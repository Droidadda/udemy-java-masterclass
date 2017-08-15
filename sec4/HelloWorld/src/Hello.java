/**
 *
 * Created by Rambod Rahmani.
 * Section: Section 4 - Variables, Datatypes and Operators
 * Project: HelloWorld
 *
 */

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        int mySecondNumber = 10;
        System.out.println(mySecondNumber);

        int myThirdNumber = 10 + 5;
        System.out.println(myThirdNumber);

        int myFourthNumber = (10 + 5) + (2 * 10);
        System.out.println(myFourthNumber);

        System.out.println("myFourthNumber");

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber + myFourthNumber;
        System.out.println(myTotal);

        myThirdNumber = myFirstNumber * 2;

        myTotal = myFirstNumber + mySecondNumber + myThirdNumber + myFourthNumber;
        System.out.println(myTotal);

        int myLast = 1000 - myTotal;
        System.out.println(myLast);
    }
}
