import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        ////////////////////////////////// 1.Loop Basics ////////////////////////////////////////

        /////// A. While Loop////////////
//  Create an integer variable i with a value of 5.
//  Create a while loop that runs so long as 'i' is less than or equal to 15
//  Each loop iteration, output the current value of i, then increment i by one.
//  Your output should look like this:

//        int i = 5;
//    while (i <= 15) {
//        System.out.print(i + " ");
//                                ^_________ ADDING AN EMPTY STRING WITH A SPACE CREATES A SEPARATOR BETWEEN THE NUMBERS
//        i++;
//    }

        /////// B. Do While Loop///////////
//  Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
//            int i = 0;
//        do{
//            System.out.println("i is " +i);
//            i +=2;
//        }while(i <= 100);

//  Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do{
//            System.out.println("i is " + i);
//            i -= 5;
//        }while(i >= -10);


//  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.   Output should equal

//        long i = 2L;
//        do{
//            System.out.println( i) ;
//            i *= i;
//        }while(i < 1000000L);

        /////////// C. For Loop////////////////
//  Refactor the previous two exercises to use a for loop instead.

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//        for(long i = 2L; i < 1000000L; i *= i) {
//            System.out.println(i);
//        }

        ////////////////////////////////////////// 2. FIZZ BUZZ ////////////////////////////////////////
//  Write a program that prints the numbers from 1 to 100.
//  For multiples of three: print “Fizz” instead of the number.
//  For the multiples of five: print “Buzz”.
//  For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + " " + "FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " " + "Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println(i + " " + "Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        ///////////////////////////////////// 3. Display a table of powers ////////////////////////////////////////
//  Prompt the user to enter an integer.
//  Display a table of squares and cubes from 1 to the value entered.
//  Ask if the user wants to continue.
//  Assume that the user will enter valid data.
//  Only continue if the user agrees to.

//        Scanner scanner = new Scanner (System.in);
//        while(true){
//            System.out.println("What number would you like to go up to?");
//            int num = scanner.nextInt();
//            System.out.println("\nHere is your table!");
//            System.out.println(" ");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            // This section Prints the table of squares and cubes
//
//            for(int i= 1; i <= num; i++){
//                int squared = i * i;
//                int cubed = i * i + i;
//            System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
////                             ^ ^^              ^_separates, It inserts a newline character,the next output will be on a new line
////                             | ||_______ THE d represents the integer value
////                             |_|____ The % sign is used to format the printf string
////                               |___________ The - sign means that the value should be left-aligned within the allotted width of                                              6 characters. If the integer has fewer than 6 characters, it will be padded with                                                 spaces on the right to reach the width of 6 characters.
//            }
//            System.out.println("\nWould you like to continue? (Y/N):");
//            String answer = scanner.next();
//            if (!answer.equalsIgnoreCase("y")) {
//                break;
//            }
//        }
//
//        System.out.println("Thank you for using the table of powers program, have a nice day!");
//

////////////////////////////////// 4.Convert given number grades into letter grades ///////////////////////////////////
//Prompt the user for a numerical grade from 0 to 100.

        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a numerical grade:");
            int num = scanner1.nextInt();
            System.out.println("Your Letter Grade is an: ");


                if (num >= 88 && num <= 101) {
                    System.out.println("A:" + num + " ");
                } else if (num <= 87 && num >= 80) {
                    System.out.println("B:" + num + " ");
                } else if (num <= 79 && num >= 67) {
                    System.out.println("C:" + num + " ");
                } else if (num <= 66 && num >= 60) {
                    System.out.println("D:" + num + " ");
                } else if (num <= 59 && num >= 0) {
                    System.out.println("F:" + num + " ");

                } else {
            System.out.println("Invalid input, please enter a valid numerical grade (0-100).");
        }
        System.out.println("\nWould you like to continue? (Y/N):");
        String answer = scanner1.next();
        if (!answer.equalsIgnoreCase("y")) {
            System.out.println("Okay have a good day!");;
            break;
        }
            }

        }
    }

