
public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {8, 61, 2, 3, 4, 0};
        int target = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}

/* 

| Case             | Example             | Comparisons | Time Complexity |
| Best Case        | Target = `8`        |           1 | O(1)        |
| Average Case     | Random position     |       ≈ n/2 | O(n)        |
| Worst Case       | Target = `0` or `5` |           n | O(n)        |

*/

// Linear Search
//         Auxiliary Space = O(1)