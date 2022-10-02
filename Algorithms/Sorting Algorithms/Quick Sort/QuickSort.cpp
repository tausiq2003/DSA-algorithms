#include <iostream>
using namespace std;
// Funtio to Swap two elements 
void swap(int* a, int* b) 
{ 
    int t = *a; 
    *a = *b; 
    *b = t; 
} 
   
// partition of the array using last element as pivot
int partition (int arr[], int low, int high) 
{ 
    int pivot = arr[high];    // pivot 
    int i = (low - 1);   
   
    for (int j = low; j <= high- 1; j++) 
    { 
        //if current element is smaller than pivot, increment the low element
        //swap elements at i and j
        if (arr[j] <= pivot) 
        { 
            i++;    // increment index of smaller element 
            swap(&arr[i], &arr[j]); 
        } 
    } 
    swap(&arr[i + 1], &arr[high]); 
    return (i + 1); 
} 
   
// quicksort algorithm
void quickSort(int arr[], int low, int high) 
{ 
    if (low < high) 
    { 
        //partition the array 
        int pivot = partition(arr, low, high); 
   
        //sort the sub arrays independently 
        quickSort(arr, low, pivot - 1); 
        quickSort(arr, pivot + 1, high); 
    } 
} 
//This funtion for display arrays
void displayArray(int arr[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
        cout<<arr[i]<<" "; 
      
} 
   
int main() 
{ 
    
   
    int size;
    cin>>size; //Input size of array
    int arr[size];
    int i;
    for(i=0;i<size;i++)
    cin>>arr[i]; //Take input array element
    displayArray(arr,size);
    cout<<endl;
    quickSort(arr, 0, size-1); 
    cout<<"Array sorted with quick sort"<<endl; 
    displayArray(arr,size); 
    return 0; 
}