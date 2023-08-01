import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

// 1. Copy the code into your main method then Write some Java code that uses the variable pi to the output

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);
//                                                            ^ ^^---------- THIS IS SAYING THERE IS A BREAK HERE
//                                                            | |_____________ THIS dot is simply a period to end the sentence.
//                                              THIS .2 IS SAYING IT NEEDS TWO DECIMAL PLACES

//  1. Prompt a user to enter an integer and store that value in an int variable using the nextInt method

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInput1 = scanner.nextInt();
//        System.out.println("You entered: " + userInput1 + " ");

// 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Enter 3 words seperated by spaces: ");
//        String userInput1 = scanner1.nextLine();
//        String[] words = userInput1.split(" ");
//
//        if (words.length != 3) {
//            System.out.println("You need to enter 3 words.");
//        } else {
//            System.out.println("You entered:");
//            for (String word : words) {
//                System.out.println(word);
//            }
//        }

// 3.Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Enter a sentence:");
//        String userInput2 = scanner2.next();
//        System.out.println("Your sentence is:" + userInput2);

// 4.Rewrite the above example using the nextLine method.

//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Enter a sentence:");
//        String userInput3 = scanner3.nextLine();
//        System.out.println("Your sentence is:" + userInput3);

// 1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

//        Scanner scanRoom = new Scanner(System.in);
//        System.out.println("Enter the length and width of Codeup's classroom:");
//        String userInput = scanRoom.nextLine();
//
//        String[] dimensions = userInput.split(" ");
//
//
//        if (dimensions.length != 2) {
//            System.out.println("Please enter both length and width separated by a space.");
//        } else {
//            // Parse the strings to numeric types (double, int, etc.)
//            double length = Double.parseDouble(dimensions[0]);
//            double width = Double.parseDouble(dimensions[1]);
//
//            System.out.println("You entered:");
//            System.out.println("Length: " + length);
//            System.out.println("Width: " + width);
//        }

// 2. Display the area and perimeter of that classroom.The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        Scanner scanRoom = new Scanner(System.in);
        System.out.println("Enter the length and width of Codeup's classroom:");
        String userInput = scanRoom.nextLine();

        String[] dimensions = userInput.split(" ");
//
//
        if (dimensions.length != 2) {
            System.out.println("Please enter both length and width separated by a space.");
        } else {
            // Parse the strings to numeric types (double, int, etc.)
            double length = Double.parseDouble(dimensions[0]);
            double width = Double.parseDouble(dimensions[1]);

            double area = length * width;
            double perimeter = 2 * (length + width);

            System.out.println("You entered:");
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);


        }
    }
}
