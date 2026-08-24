public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 8, 61};
        int target = 4;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            System.out.println("Range: [" + low + ", " + high + "], Mid = " + mid);

            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                break;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        // Worst-case comparisons:
        // N -> N/2 -> N/4 -> N/8 -> ...
        // N / 2^k = 1
        // 2^k = N
        // k = log2(N)
        // Time Complexity = O(log N)

        // Iterative Binary Search
        // Auxiliary Space = O(1)
    }
}