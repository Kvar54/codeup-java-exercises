import java.util.Scanner;

// TODO: Create a new class called MethodPractice and add main method to test these methods...
// TODO: Write a method, returnName, that returns the string of your name.
// TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
// TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
// TODO: !! Complete math exercises from the curriculum !!
public class MethodPractice {
    public static void main(String[] args) {

        String myName = returnName();
        System.out.println("My name is " + myName);


////////////////// Looking for the Longest string //////////

//        String string1 = "you go glenn coco";
//        String string2 = "You're so conceited claire";
//        String longerString = returnLongerString(string1, string2);
//        System.out.println("The longer string is: " + longerString);
//        String same = "These are the same length";
//        System.out.println(same);

///////////////////////////////////////////////////////////////////////

////////////////// Input name  //////////

//        System.out.println("Enter your name:");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        String greeting = sayName(userInput);
//        System.out.println(greeting);

///////////////////////////////////////////////////////////////////////

////////////////// Doubling the number //////////
//        int a = 10;
//        int b = 2;

        double a = 20;
        double b = 10;

        double divResult = division(a, b);

//        int addResult = add(a, b);
//        int subResult = subtract(a, b);
//        int multiplyResult = multiply(a, b);

        double addResult = add(a, b);
        double subResult = subtract(a, b);
        double multiplyResult = multiply(a, b);

        System.out.println(" ValueOne is: 10 \n ValueTwo is: 2");
        System.out.println("The result for addition is: " + addResult);
        System.out.println("The result for subtraction is: " + subResult);
        System.out.println("The result multiplication is: " + multiplyResult);
        System.out.println("The result division is: " + divResult);

///////////////////////////////////////////////////////////////////////
    }

    public static String returnName() {
        return "Keila";
    }


//    public static String returnLongerString ( String string1,  String string2) {
//        if (string1.length() > string2.length()) {
//            return string1;
//        } else if (string1.length() == string2.length()) {
//            return "These are the same length";
//        } else {
//            return string2;
//        }
//


//    public static boolean cenBeHalved (int integer) {
//return integer % 2 == 0;
//    }

    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"


    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
//    public static String sayName(String firstName) {
//        String lastName = new String();
//        if(lastName == null || lastName.isEmpty()) {
//        return "Hello, " + firstName + "!";
//        } else {
//        return "Hello, " + firstName + lastName + "!";
//        }
//    }
//}

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}