public class MergeSort {

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;

        System.out.println("Split: [" + left + "," + right + "]");

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
    }

    public static void main(String[] args) {

        int[] arr = {8, 61, 2, 3, 4, 0};

        System.out.println("Division Tree:");
        mergeSort(arr, 0, arr.length - 1);

        /*
        
        Recursion Tree:

                       6
                    /     \
                   3       3
                 /  \     /  \
                2    1   2    1
               / \       / \
              1   1     1   1

        Work at each level:
        
        Level 0: N
        Level 1: N
        Level 2: N
        ...
        Level log₂N: N

        Recurrence:
        T(N) = 2T(N/2) + O(N)

        Recursion tree:
        O(N) × log₂N

        Therefore:
        T(N) = O(N log N)

        Time Complexity = O(N log N)

         Merge Sort
        Auxiliary Space = O(N)
        */
    }
}