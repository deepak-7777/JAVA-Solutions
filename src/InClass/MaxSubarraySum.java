package InClass;

//public class MaxSubarraySum {
//
//    public static int maxSumSubarray(int[] arr, int k) {
//        if (arr.length < k) {
//            throw new IllegalArgumentException("Array size must be >= k");
//        }
//
//        int windowSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//
//        int maxSum = windowSum;
//
//        // Step 2: Slide the window
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i - k]; // add next, remove previous
//            maxSum = Math.max(maxSum, windowSum);
//        }
//
//        return maxSum;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int k = 3;
//
//        System.out.println(maxSumSubarray(arr, k)); // Output: 9
//    }
//}


public class MaxSubarraySum {

    public static int maxSumSubarray(int[] arr, int k) {
        int current_sum = 0;
        int max_sum = 0;

        // Step 1: first window
        for (int i = 0; i < k; i++) {
            current_sum += arr[i];
        }

        max_sum = current_sum;

        // Step 2: sliding window
        for (int i = k; i < arr.length; i++) {
            current_sum = current_sum + arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSumSubarray(arr, k));
    }
}