#include <iostream>
using namespace std;

void linearSearch(int arr[], int size, int search_element)
{

    bool found_element = false;
    int index = 0;

    for (int i = 0; i < size; i++)
    {
        if (arr[i] == search_element)
        {
            found_element = true;
            break;
        }
        index++;
    }

    if (found_element == true)
    {
        cout << "Number is found at index " << index << endl;
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

    linearSearch(arr, size, search_element);
}