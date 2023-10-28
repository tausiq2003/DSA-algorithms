class Solution {
    public int majorityElement(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums[(nums.length-1)/2];
    }
    public void quickSort(int[] nums, int low, int hi){
        if (low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];
        //putting the pivot at correct index
        while(s <= e){
        while (nums[s] < pivot){
            s++;
        }
        while(nums[e] > pivot){
            e--;
        }
        if (s <= e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
        }
        quickSort(nums, low, e);
        quickSort(nums, s, hi);
        
        
    }

    }
