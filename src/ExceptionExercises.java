public class ExceptionExercises {

    //    STEP 1
//Create a static divideNums method that takes in two integer arguments. If the second argument is 0, the method should throw an IllegalArgumentException with the message "Cannot divide be 0!" If the second argument is not 0, return the result of dividing the first input integer by the second input integer.

        public static int divideNums(int num1, int num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return num1 / num2;
        }


//STEP 2
// Add a main method and try calling the divideNums method with various arguments, including 0 for the second argument. Is IllegalArgumentException a checked or unchecked exception?

        public static void main(String[] args) {
            int result = divideNums(10, 0);
//            int result = divideNums(10, 2);
//            int result = divideNums(20, 5);


            System.out.println("Result: " + result);
        }
}

//STEP 3
// Create a public static void method called delayedHello that takes in an integer argument for the number of milliseconds of delay before "Hello World" is printed to the console. Use Thread.sleep() in the method to accomplish this. Does Thread.sleep() throw a checked or unchecked exception?

