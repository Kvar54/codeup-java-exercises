public class intergerVariable {
    public static void main(String[] args) {
// 1.Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);
// 2.Create a String variable named myString and assign a string value to it, then print the variable out to the console
//
        String myString = "practicing Java :)";
        System.out.println(myString);
//
// 3.Change your code to assign a character value to myString. What do you notice?
//
//        String myString = "c";
//        System.out.println(myString);

// 4.Change your code to assign the value 3.14159 to myString. What happens?
//
//        String myString = 3.14159;
//        System.out.println(myString);

// compilation error because it is not a string
// 5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens
//
//          long myNumber;
//          System.out.println(myNumber);

//  6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//        long myNumber = 3.14;
//        System.out.println(myNumber);

// compilation error because it is not a whole number

//        long myNumber = (long) 3.14;
//        System.out.println(myNumber);

// we would have to change the code by inserting (long) in front of the number to assign the value 3.14 to myNumber and create a whole number

// 7.Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        long myNumber = 123L;
        System.out.println(myNumber);

// 8.Change your code to assign the value 123 to myNumber.

//        long myNumber = 123;
//        System.out.println(myNumber);

// long types can't hold decimal values

// 9.Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14;
//        System.out.println(myNumber);

//  we get a compilation error stating that there could be lossy conversion from double to float
//
//    first way to fix
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
//   second way to fix
//        float myNumber = (float)3.14;
//        System.out.println(myNumber);

// 10. Copy and paste the following code blocks one at a time and execute them
// What is the difference between the above code blocks? Explain why the code outputs what it does.

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        The difference is :
//        x is incremented
//        the first code block incremented after the statement is completed
//        the second code block incremented before the statement is completed
//        in both the value ends up getting incremented before the second part

// 11. Try to create a variable named class. What happens?

//    String class = "class"

// There was a compilation error because class is

// 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//
//        String theNumberThree = "three";
//        System.out.println(theNumberThree);
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o ;
//        System.out.println(three);

//We expected to get an error and we got a runtime error

// How is the above example different from the code block below?

//        int three = (int) "three";

//  The difference is that we ar e using the object variable as a middleman
//  Java doesn't know that this specific object cannot be cast to an int
//  Sometimes object variable CAN be cast to an int

//  13. Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x;
//        System.out.println(y);
//
        int x = 10;
        int y = 2;
        x = x / y;
        x/= y;
        y = y - x;
        y -= x;
        System.out.println(x);
        System.out.println(y);

// 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

//        byte practiceByte = -200;

// this throws a compilation error because this(-128 to 127) is the min and max a bit can hold.

        byte practiceByte = -127;
        practiceByte += 256;
        System.out.println(practiceByte);

// when we increment past the types capacity, it will loop lower (or upper if we're subtracting) bounds of what that data type can hold
    }

}
