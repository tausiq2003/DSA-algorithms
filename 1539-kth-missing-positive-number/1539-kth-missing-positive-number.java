class Solution{
public int findKthPositive(int[] arr, int k) {
    //brute force approach
    // Adjust k for any missing elements before the first element
    int nom = arr[0] - 1;
    if (nom >= k) {
        return k;
    }
    
    // Traverse the array to find the kth missing element
    for (int i = 1; i < arr.length; i++) {
        nom += arr[i] - arr[i - 1] - 1;
        if (nom >= k) {
            // The kth missing element is between arr[i-1] and arr[i]
            return arr[i - 1] + (k - (nom - (arr[i] - arr[i - 1] - 1)));
        }
    }

    // The kth missing element is beyond the last element of the array
    return arr[arr.length - 1] + (k - nom);
}
}