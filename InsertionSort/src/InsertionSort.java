import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        for (int j = 1; j < sortedArr.length; j++) {
            int key = sortedArr[j];
            int i = j-1;
            while (i >= 0 && sortedArr[i] > key) {
                sortedArr[i+1] = sortedArr[i];
                i--;
            }
            sortedArr[i+1] = key;
        }

        return sortedArr;
    }
}
