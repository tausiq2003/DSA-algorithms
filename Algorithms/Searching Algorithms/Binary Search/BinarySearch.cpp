#include<bits/stdc++.h>
using namespace std;

int binary_search(int arr[],int n,int key){   // The time Complexity of binary Search is O(log(n)) and spce complexity is O(1)
  int low = 0 , high = n-1;
  while(low <= high)
  {
    int mid = (low + high)/2;

    if (arr[mid] == key) return mid;
    else if(arr[mid] > key) high = mid - 1;
    else low = mid + 1;
  }
  return -1;
}

int main(){
  int array[100];
  int number_of_element_in_array = 0;
  int enter_the_element_to_be_searched_in_array = 0;

  cout<<"Enter number of element should be in the array"<<endl;
  cin>>number_of_element_in_array;
 
  cout<<"Enter the element in array in a sorted manner"<<endl; //because binary search only work in a sorted array
  for(int i = 0 ; i < number_of_element_in_array ; i++) {
    cin>>array[i];
  }

 
  cout<<"enter the element to be found: ";
  cin>>enter_the_element_to_be_searched_in_array;

  cout<<"Your element is at index:" << binary_search(array,number_of_element_in_array, enter_the_element_to_be_searched_in_array) << endl;


  return 0;
}