import java.util.Scanner;

public class MethodsExercises {

    //
    public static int add(int num1, int num2) {

        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {

        return num2 - num1;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;

    }

    public static int divide(int num1, int num2) {
        return num2 / num1;
    }

    public static int modulus(int num1, int num2) {
        return num2 % num1;
    }


    //// Bonus do multiplication with a loop
//    public static int loopMultiply (int num1, int num2) {
//        long result =1;
//        for(int i = 0; i <= num2; i++){
//            result = result * num1;
//        }
//        return loopMultiply(num1, num2);
//    }
//
//    // TODO: create a method, sayName, that can take in a single name input or two name inputs and will return
//    //  a greeting message to the user by either their first or first and last name.
    public static String sayName(String name) {
        return "Hi " + name;
    }

    public static String sayName(String name1, String name2) {
        return "Hi " + name1 + " " + name2;
    }

    public static String sayName(String greeting, String name1, String name2) {
        return greeting + ", " + name1 + name2 + "!";
    }
    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"

    // TODO: overload the addition method from the curriculum exercise to both add integers and add doubles


    //Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
        int userInt = scanner.nextInt();
//        String wrongChoice = "please try again";
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Input out of range!");
            return getInteger(min, max);
        }
    }


    //Calculate the factorial of a number.
    public static long getFactorial(int num) {
        long output = 1;
        for (int i = 1; i <= num; i++) {
            output *= i;
        }
        return output;
    }

    public static void promptUserForFactorials() {
        Scanner scanner = new Scanner(System.in);
        String continueMessage;
        System.out.println("Welcome to the factorial calculator");
        do {
            System.out.println("What number should we calculate?");
            int userInt = getInteger(1,10);
            System.out.println("The factorial of " + userInt + " is " + getFactorial(userInt) + ".");

            System.out.println("Would you like to enter another number? (Enter 'yes' or 'no')");
            continueMessage= scanner.nextLine();
        } while (continueMessage.equalsIgnoreCase("yes"));
    }


    //Create an application that simulates dice rolling.
    public static void rollDice () {
        Scanner scanner = new Scanner(System.in);
        String continueMessage;
        System.out.println("Welcome to Roll a Jackpot");
        do {
            System.out.println("How many sides to the dice would you like?");
            int userInt = getInteger(1,10);
            System.out.println("You chose a " + userInt + " sided dice.");
            System.out.println("Would you like to play again? (Enter 'yes' or 'no')");
            continueMessage= scanner.nextLine();
        } while (continueMessage.equalsIgnoreCase("yes"));
    }




    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int addition = add(num1, num2);
        System.out.println(addition);

        int subtraction = subtract(num1, num2);
        System.out.println(subtraction);

        int multiplication = multiply(num1, num2);
        System.out.println(multiplication);

        int division = divide(num1, num2);
        System.out.println(division);

        int modulus = modulus(num1, num2);
        System.out.println(modulus);

//        int loopMultiply = loopMultiply(num1, num2);
//        System.out.println(loopMultiply);

        System.out.println(sayName("Bob"));

        System.out.println(sayName("Bob", "Smith"));


//        int loop = loopMultiply(num1, num2);
//        System.out.println(loop);
//
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("You entered: " + userInput);

        System.out.println(getFactorial(1)); //1
        System.out.println(getFactorial(2)); //2
        System.out.println(getFactorial(3));//6
        System.out.println(getFactorial(4));//24
        promptUserForFactorials();
        rollDice();

    }
}

