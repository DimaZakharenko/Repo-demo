package module2.homework;

import java.util.Arrays;

public class ArrayDoubleEndStack {

    private int[] doubleEndStack = new int[10];
    private int rightPosition = doubleEndStack.length / 2;
    private int leftPosition = doubleEndStack.length / 2 - 1;

    void addLeft(int number) {
        if (leftPosition < 0) {
            System.out.println("Double_End_Stack is full from the left side.");
            printStack();
        } else {
            doubleEndStack[leftPosition--] = number;
        }
    }

    void addRight(int number) {
        if (rightPosition > doubleEndStack.length - 1) {
            System.out.println("Double_End_Stack is full from the right side.");
            printStack();
        } else {
            doubleEndStack[rightPosition++] = number;
        }
    }

    int removeLeft() {
        if (leftPosition >= doubleEndStack.length / 2 - 1) {
            System.out.println("Double_End_Stack is empty from from the left side.");
            printStack();
        } else {
            doubleEndStack[++leftPosition] = 0;
        }
        return 0;
    }

    int removeRight() {
        if (rightPosition <= doubleEndStack.length / 2) {
            System.out.println("Double_End_Stack is empty from the right side.");
            printStack();
        } else {
            doubleEndStack[--rightPosition] = 0;
        }
        return 0;
    }

    void printStack() {
        System.out.println(Arrays.toString(doubleEndStack));
        System.out.println();
    }
}
