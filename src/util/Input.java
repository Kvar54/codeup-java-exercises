package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    //    constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Getter //
    public Scanner getScanner() {
        return scanner;

    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("yes") || input.equals("y") || input.equals("n") || input.equals("no");
    }

    public int getInt(int min, int max) {
        int value;
        do {
            value = getInt();

        } while (value > min || value < max);
        return value;
    }

    public int getInt() {
        return scanner.nextInt();
    }

//    public double getDouble(double min, double max) {
//        try {
//            return Double.parseDouble(this.getString());
//        } catch (NumberFormatException e) {
//            System.out.println("you must enter a number");
//            return this.getDouble();
//        }
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
////        return this.getDouble();
//    }

//    public double getDouble(double min, double max) {
//        double userDouble = this.getDouble();
//    }


}
