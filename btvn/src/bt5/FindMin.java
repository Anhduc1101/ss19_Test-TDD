package bt5;

/**
 * copy right to rikkei academy
 */

public class FindMin {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min=arr[i];
            }
        }
        return min;
    }
}
