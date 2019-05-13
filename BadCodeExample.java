package module1.homework;

public class BadCodeExample {

    int number1 = 13;
    int number2 = 16;

    void operationsWithNumbers() {
        int result = number1 * number2;     // lets try to multiply the above numbers
        double fraction = result / 3;       // and divide by 3 to get a fraction
        System.out.println("this is the resulting number");
        System.out.println(fraction);
    }

    void operationsWithText() {
        String neverUsedString = "This is a text";
        char neverUsedCharacter = 'A';
        String combinedText = "text " + "can be combined";
        System.out.println(combinedText);
    }

}
