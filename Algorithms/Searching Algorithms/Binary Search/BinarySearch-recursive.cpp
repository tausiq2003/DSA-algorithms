#include <iostream>
using namespace std;

// here search_element is used for better understanding of the code, please use the variable name you are comfortable with
int binarySearch_recursive(int arr[], int search_element, int low, int high)
{
    

    while (low <= high)
    {
        int mid = (low + high) / 2;

        if (arr[mid] == search_element)
        {
            return mid;
        }
        else if (arr[mid] > search_element)
        {
           return binarySearch_recursive(arr,search_element,low,mid-1);
        }
        else
        {
            return binarySearch_recursive(arr,search_element,mid+1,high);
        }
    }
    return -1;
}

int main()
{
    int low, mid, high;
    bool found_element = false;

    low = 0;
    int arr[] = {1, 4, 52, 63, 78, 221, 442};
    int size = sizeof(arr) / sizeof(int);
    high = size - 1;
    int search_element = 78;

   int result = binarySearch_recursive(arr, search_element, low, high);
   if (result != -1){
    cout<<"Element is at index number" <<result;
   }
   else
   cout<<"Element is not found";
}
// Code by krupalitrivedi