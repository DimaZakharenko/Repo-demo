package module2.classwork.module2;


public class SortingAlgorithm {

    static int[] bubbleSort(int[] unsorted) {

        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {

                if (unsorted[i] > unsorted[i + 1]) {
                    int temp = unsorted[i + 1];
                    unsorted[i + 1] = unsorted[i];
                    unsorted[i] = temp;
                    swap = true;
                }
            }

        }
        return unsorted;
    }


    static int[] bubbleSortReversed(int[] unsorted) {
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

        return unsorted;

    }


    static int[] insertionSort(int[] unsorted) {

        for (int i = 1; i < unsorted.length; i++) {

            if (i == unsorted.length - 1 && (unsorted[i - 1] <= unsorted[i])) {
                break;
            }
            if (unsorted[i - 1] > unsorted[i]) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[i - 1];
                unsorted[i - 1] = temp;


                for (int j = i - 1; j > 0; j--) {

                    if (unsorted[j - 1] > unsorted[j]) {
                        temp = unsorted[j];
                        unsorted[j] = unsorted[j - 1];
                        unsorted[j - 1] = temp;
                    }
                }
            }
        }
        return unsorted;
    }


    static int[] insertionSortReversed(int[] unsorted) {
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


    static int[] selectionSort(int[] unsorted) {

        for (int i = 1; i < unsorted.length; i++) {

            if (i == unsorted.length - 1 && (unsorted[i - 1] <= unsorted[i])) {
                break;
            }

            for (int j = unsorted.length - 1; j > i; j--) {
                if (unsorted[j - 1] > unsorted[j]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }

            if (unsorted[i - 1] > unsorted[i]) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[i - 1];
                unsorted[i - 1] = temp;
            }

        }
        return unsorted;
    }


    static int[] selectionSortReversed(int[] unsorted) {

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
        return unsorted;
    }


}



