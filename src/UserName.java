import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
//        System.out.printf("Hello, %s", userName);
        // or can do sout method
        System.out.println("Hello, " + userName);
    }
}
