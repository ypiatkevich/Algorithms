import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int[] numbers = getRandomNumbers(50, 0, 100);
        int[] sortedNumbers = SelectionSort.sort(numbers);

        System.out.printf("Unsorted: %s\n", Arrays.toString(numbers));
        System.out.printf("Sorted: %s\n", Arrays.toString(sortedNumbers));
    }

    private static int[] getRandomNumbers(int n, int lBound, int rBound) {
        return ThreadLocalRandom.current().ints(n, lBound, rBound).toArray();
    }

}