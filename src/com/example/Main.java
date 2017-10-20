package com.example;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target){
        int indexBefore = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]<target){
                indexBefore = i;
            }
        }
        if(indexBefore==0 && target<nums[0]){
            return 0;
        }
        return ++indexBefore;
    }
}
