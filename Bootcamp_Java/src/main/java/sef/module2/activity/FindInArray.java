package sef.module2.activity;

public class FindInArray {
    public static void main(String[] args) {
        int[] nums = {100, 1, 4, 30};
        int result = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < result) {
//                result = nums[i];
//            }
//        }
//        IO.println("Smallest is " + result);
//        result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }
        IO.println("Largest is " + result);
    }
}
