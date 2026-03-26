import java.util.*;

class Solution {

    public int[] bubbleSort(int[] nums) {
        return bubbleSort(nums, nums.length);
    }

    private int[] bubbleSort(int[] nums, int n) {
        if (n == 1) return nums;

        for (int j = 0; j < n - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }

        return bubbleSort(nums, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // take array input
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        // sort array
        int[] result = s.bubbleSort(nums);

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}