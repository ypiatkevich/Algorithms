import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] a) {
        int[] b = Arrays.copyOf(a, a.length);

        for (int i = 0; i < a.length - 1; i++) {
            int ind = i;
            for (int j = i+1; j < a.length; ++j) {
                if (b[ind] > b[j]){
                    ind = j;
                }
            }
            int temp = b[i];
            b[i] = b[ind];
            b[ind] = temp;
        }

        return b;
    }
}
