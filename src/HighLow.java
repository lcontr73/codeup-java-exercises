import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100");

        String tooLow = "HIGHER";
        String tooHigh = "LOWER";
        int userPick = scanner.nextInt();
        if (userPick < randomNumber) {
            System.out.println(tooLow);
        } else if (userPick > randomNumber) {
            System.out.println(tooHigh);
        } else {
            System.out.println("GOOD GUESS");

        }
    }
}

