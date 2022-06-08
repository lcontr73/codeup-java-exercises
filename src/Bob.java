import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is Bob. Get to know Bob, by asking him a few questions.");
boolean continueConversation = true;
        do {
            String userConversation = scanner.nextLine();

                if (userConversation.endsWith("?")) {
                    System.out.println("Sure");

                } else if (userConversation.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userConversation.equals("")) {
                    System.out.println("Fine. Be that way!");
                } else {
                    System.out.println("Whatever.");
                }
                System.out.println("Do you want to continue talking with BoB? (y/n)");
                String userResponse = scanner.nextLine();
                if (!userResponse.equalsIgnoreCase("y")) {
                    continueConversation = false;
                }
            } while (continueConversation);
    }
}
