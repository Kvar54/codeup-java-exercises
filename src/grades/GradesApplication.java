package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!\n");

        HashMap<String, Student> students = new HashMap<>();

        // Initialize student data
        Student student1 = new Student("Devi Patel");
        student1.addGrade(88);
        student1.addGrade(96);
        student1.addGrade(83);
        student1.addGrade(97);
        students.put("DeviPat12_1", student1);

        Student student2 = new Student("Jasmine Ortiz");
        student2.addGrade(97);
        student2.addGrade(99);
        student2.addGrade(100);
        students.put("Jazzy_535", student2);

        Student student3 = new Student("Xavier Yang");
        student3.addGrade(65);
        student3.addGrade(55);
        student3.addGrade(99);
        students.put("XXaVier21X", student3);

        Student student4 = new Student("Tommy Smith");
        student4.addGrade(75);
        student4.addGrade(0);
        student4.addGrade(100);
        students.put("TomatoTom91_9", student4);

        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();

        boolean continueApp = true;
        String userInput;
        while (continueApp) {
            System.out.println(" ");
            System.out.print("What student would you like to see more information on? ");
            System.out.println(" ");

            userInput = scanner.nextLine();

            Student student = students.get(userInput);
            if (student != null) {
                System.out.println("Name: " + student.getName() + " - " + "GitHub Username: " + userInput);

                double averageGrade = student.getGradeAverage();
                System.out.printf("Grade Average: %.1f\n", averageGrade);

                if (averageGrade >= 100) {
                    System.out.printf("Grade: A++\n");
                }
                else if (averageGrade >= 97 && averageGrade <= 99) {
                    System.out.printf("Current Grade: A+\n");
                } else if (averageGrade >= 90) {
                    System.out.printf("Current Grade: A-\n");
                } else if (averageGrade >= 87) {
                    System.out.printf("Current Grade: B+\n");
                } else if (averageGrade >= 83.5) {
                    System.out.printf("Current Grade: B\n");
                } else if (averageGrade >= 80) {
                    System.out.printf("Current Grade: B-\n");
                } else if (averageGrade >= 77) {
                    System.out.printf("Current Grade: C+\n");
                } else if (averageGrade >= 73.5) {
                    System.out.printf("Current Grade: C\n");
                } else if (averageGrade >= 70) {
                    System.out.printf("Current Grade: C-\n");
                } else if (averageGrade >= 67) {
                    System.out.printf("Current Grade: D+\n");
                } else if (averageGrade >= 63.5) {
                    System.out.printf(" Current Grade: D\n");
                } else if (averageGrade >= 60) {
                    System.out.printf("Current Grade: D-\n");
                } else {
                    System.out.println("Current Grade: F\n");
                }

            } else {
                System.out.println(" ");
                System.out.println("Sorry, no student found with the GitHub username of '" + userInput + "'");
            }
            System.out.println(" ");
            System.out.print("Do you want to continue? (yes/no): ");
            System.out.println(" ");

            userInput = scanner.nextLine();
            continueApp = userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
        }
        System.out.println("Goodbye, and have a wonderful day!\n");

    }
}
