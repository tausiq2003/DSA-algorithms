#include <iostream>
using namespace std;

// here search_element is used for better understanding of the code, please use the variable name you are comfortable with
void binarySearch_iterative(int arr[], int size, int search_element)
{

    int low, mid, high;
    bool found_element = false;

    low = 0;
    high = size - 1;

    while (low <= high)
    {
        mid = (low + high) / 2;

        if (arr[mid] == search_element)
        {
            found_element = true;
            break;
        }
        else if (arr[mid] < search_element)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    if (found_element == true)
    {
        cout << "Number is found at index " << mid << endl;
    }
    else
    {
        cout << "Number not found" << endl;
    }
}

int main()
{

    int arr[] = {1, 4, 52, 63, 78, 221, 442};
    int size = sizeof(arr) / sizeof(int);
    int search_element = 78;

    binarySearch(arr, size, search_element);
}

// Code by krupalitrivedi