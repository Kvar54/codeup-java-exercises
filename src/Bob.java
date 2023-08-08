import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String message = "Speak to Bob";
        System.out.println(message);
        String message2 = "Do you wish to speak to Bob? (yes/no):";
        System.out.println(message2);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine().toLowerCase(); // Read the whole line and convert to lowercase

            if (userInput.equals("no")) {
                System.out.println("Bob: Whatever. Bye.");
                break;
            } else if (userInput.equals("yes")) {

                while (true) {
                    System.out.println("What do you wish to tell Bob?");
                    String userMessage = scanner.nextLine();
                    if (userMessage.equalsIgnoreCase("bye")) {
                        System.out.println("Bob: Whatever.Bye.");
                        break;
                    } else {
                        String bobResponse = getBobResponse(userMessage);
                        System.out.println("Bob: " + bobResponse);
                    }
                }
            }
        }
        scanner.close();
    }
    public static String getBobResponse(String input) {
        input = input.trim();
        if (input.endsWith("?")) {
            return "sure";
        } else if (input.endsWith("!")) {
        return "Whoa, chill out!";
        } else if (input.isEmpty()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }

}


