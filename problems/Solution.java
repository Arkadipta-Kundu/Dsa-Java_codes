package problems;

class Solution {
    public static void rotate(int nums[], int k) {
        int n = nums.length - 1;
        for (int i = 0; i < k; i++) {
            while (n != 0) {
                int temp = nums[n - 1];
                nums[n - 1] = nums[n];
                nums[n] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}