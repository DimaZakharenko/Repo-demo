package module3.homework;

public class BubbleSortReversed {

    public static int[] bubbleSortReversed(int[] unsorted) {

        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {

                if (unsorted[i] < unsorted[i + 1]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);

        int[] sorted = new int[unsorted.length];

        for (int i =0; i < sorted.length; i++){
            sorted[i] = unsorted[i];
        }
        return sorted;
    }
}
