import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Printing the delimiter used. By default, a whitespace is used as a delimiter
        //but you can set it to be something else if desired
        System.out.println("Delimiter:" + scan.delimiter());

        //Print the Strings
        int counter = 1;
        while (scan.hasNext()) { //this line will begin listening for user input
            System.out.print("'" +scan.next() +"'");//grab the tokens
            System.out.println(" was token number " +counter++);//output token
        }
        //Best practice is to always close a Scanner after its not needed to clear memory
        //however, this isn't strictly necessary as trash clean up will get it eventually.
        scan.close();
    }
}
