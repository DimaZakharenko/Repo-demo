package module3.homework;

import java.util.Arrays;

public class SelectionSortReversed {

    public static int[] selectionSortReversed(int[] unsorted) {

        for (int i = 1; i < unsorted.length; i++) {

            if (i == unsorted.length - 1 && (unsorted[i - 1] <= unsorted[i])) {
                break;
            }

            for (int j = unsorted.length - 1; j > i; j--) {
                if (unsorted[j - 1] < unsorted[j]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }

            if (unsorted[i - 1] < unsorted[i]) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[i - 1];
                unsorted[i - 1] = temp;
            }
        }

        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);

        return sorted;
    }
}
