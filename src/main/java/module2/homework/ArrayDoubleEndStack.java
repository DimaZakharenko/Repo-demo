package module3.classwork;

import java.util.Arrays;

public class ControlStatements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 6, 8, 9, 10};
        printEvents(array);
        reverseArray(array);
        sumOfArrayElements(array);


    }


    static void printEvents(int[] array) {

        System.out.println("Even numbers: ");

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    static void reverseArray(int[] array) {

        System.out.println("Reversed array: ");


        for (int i = 0; i < array.length / 2; i++) {
            int temporaryVar = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temporaryVar;
        }
        System.out.println(Arrays.toString(array));
    }

    static void sumOfArrayElements(int[] array) {

        System.out.println("Sum of array elements: ");
        int arrSum = 0;

        for (int i = 0; i < array.length; i++) {

            arrSum += array[i];
        }
        System.out.println(arrSum);
    }


    void operationsWithConditionals() {
        boolean condition1 = false;
        boolean condition2 = false;

        if (condition1) {
            System.out.println("is is true");
        } else if (condition2) {
            System.out.println("is is true");
        } else {
            System.out.println("is is false");
        }

        int a = 0;
        int b = 1;

        if (a == b) {
            System.out.println("a = b");
        } else if (a > b) {
            System.out.println("a > b");
        } else if (a <= b) {
            System.out.println("a <= b");
        } else if (a % 2 > 0) {
            System.out.println("a is odd");
        }

        switch (a) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                break;
        }

    }

    void whileCondition() {
//
//        while (true) {
//            System.out.println();
//        }

        do {
            System.out.println();
        } while (false);

    }
}
