package module3.homework;

public class InsertionSortReversed {

    public static int[] insertionSortReversed(int[] unsorted) {
        boolean swap = true;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {

                if (unsorted[i] < unsorted[i + 1]) {
                    int temp = unsorted[i + 1];
                    unsorted[i + 1] = unsorted[i];
                    unsorted[i] = temp;
                    swap = true;
                }

                for (int j = i; j > 0; j--) {
                    if (unsorted[j - 1] < unsorted[j]) {
                        int temp = unsorted[j];
                        unsorted[j] = unsorted[j - 1];
                        unsorted[j - 1] = temp;
                        swap = true;
                    }
                }
            }

        } while (swap);

        return unsorted;
    }
}
