import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        ////////////////| Exercise 1 Main |///////////////
//        int a = 10;
//        int b = 2;
//        double divResult = division(a, b);
//        int modResult = modulus(a, b);
//
//        int addResult = add(a, b);
//        int subResult = subtract(a, b);
//        int multiplyResult = multiply(a, b);

//        System.out.println(" ValueOne is: 10 \n ValueTwo is: 2");
//        System.out.println("The result for addition is: " + addResult);
//        System.out.println("The result for subtraction is: " + subResult);
//        System.out.println("The result multiplication is: " + multiplyResult);
//        System.out.println("The result division is: " + divResult);
//        System.out.println("The result modulus is: " + modResult);
////
//    }
///////////////////////////////////////////////////////////////////////

        ////////////////| Exercise 2 Main |///////////////

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("You entered: " + userInput);

///////////////////////////////////////////////////////////////////////

        ////////////////| Exercise 3 Main |///////////////
//        Scanner scanner = new Scanner(System.in);
//        String answer;
//        do {
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = getInteger(1, 10);
//            long factorial = getFactorial(userInput);
//            printFactorialOutput(userInput, factorial);
//            System.out.println(userInput + "!" + " = " + factorial);
//            System.out.println("Do you wish to continue? (yes/no):");
//            answer = scanner.next();
//
//        } while (answer.equalsIgnoreCase("yes"));
//        System.out.println("Goodbye!");
//        scanner.close();

///////////////////////////////////////////////////////////////////////

        ////////////////| Exercise 4 Main |///////////////

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter 6 numbers for each side of the dice below.");

        System.out.print("Roll the dice. Enter Roll to roll the dice: ");
        scanner1.next();

    }
    ////////////////| Exercise 1 Methods |///////////////

//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public static int divide(int a, int b) {
//        return a / b;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static double division(int a, int b) {
//        if (a == 0) {
//            throw new IllegalArgumentException("division by zero is not allowed");
//        }
//        return (double) a / b;
//    }
//
//    public static int modulus(int a, int b){
//        if (b == 0) {
//            throw new IllegalArgumentException("Modulus by zero is not allowed.");
////              ^               ^                    ^
////              |               |                    |________ By throwing an exception with a meaningful message, you provide                            |               |                                 information about what went wrong, making it easier to debug and                         |              |                                   understand the issue
////              |               |
////              |               |_____  used to throw an exception of the "IllegalArgumentException" class.
////              |                       Exceptions are used in Java to handle runtime errors or exceptional
////              |                       conditions that can occur during the execution of a program
////              |
////              +___  When an exception is thrown, it will propagate up the call
////                     stack until it is caught and handled by an appropriate
////                     try-catch block or another mechanism for handling exceptions.
////
//        }
//        return a % b;
//    }
//    }

    ////////////////| Exercise 2 Methods |///////////////

//    public static int getInteger(int min, int max) {
//Scanner scanner = new Scanner(System.in);
//int userInput = scanner.nextInt();
//if (userInput >= min && userInput <= max) {
//    return userInput;
//} else{
//    System.out.println("Invalid Input. Please enter a number between " + min + " and " + max + ":");
//    return getInteger(min, max);
//}
//    }

    ////////////////| Exercise 3 Methods |///////////////

//    public static int getInteger(int min, int max) {
//        Scanner scanner1 = new Scanner(System.in);
//        int userInput = scanner1.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("Invalid Input. Please enter a number between " + min + " and " + max + ":");
//            return getInteger(min, max);
//        }
//    }
//
//    public static long getFactorial(int n) {
//        long factorial = 1;
//        for (int i = 2; i <= n; i++) {
//            factorial *= i;
//        }
//        return factorial;
//    }
//
//    public static void printFactorialOutput(int n, long factorial) {
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + "! = 1");
//            for (int j = 2; j <= i; j++) {
//                System.out.print(" x " + j);
//            }
//            System.out.println(" = " + factorial);
//        }
//    }

    ////////////////| Exercise 4 Methods |///////////////

//public static int rollingDice (){
//
//
//
//
//
//}

}
