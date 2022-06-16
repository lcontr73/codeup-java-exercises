import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);


        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method. What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        System.out.printf("You entered %d%n", userInput);

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//          My solution:
        String first;
        String second;
        String third;
        System.out.println("Please enter a word: ");

        first = scanner.next() + scanner.nextLine();
        System.out.println("Please enter another word: ");
        second = scanner.nextLine();
        System.out.println("Please enter a third word: ");
        third = scanner.nextLine();
        System.out.println("First word: " + first + "\n Second word: " + second + "\n Third word: " + third);

//        Instructor Solution
//        System.out.println("Enter 3 words: ");
//        for (int i = 0; i < 3; i++) {
//            String userInput = scanner.next();
//            System.out.printf("%s%n", userInput);
//        }

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        String sentence;
        System.out.println("Please enter a sentence: ");
//       sentence = scanner.next();
        sentence = scanner.nextLine();
        System.out.println("My sentence : " + sentence);




//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual). Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.

        System.out.println("Enter the length of your classroom:");
        String length = scanner.nextLine();
        System.out.println("Enter the width of your classroom:");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) *2;
        System.out.printf("The perimeter is: %s%n", perimeter);
    }
}
