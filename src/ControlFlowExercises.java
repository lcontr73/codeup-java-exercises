import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        //Create an integer variable i with a value of 5.
//        int i = 5;
//        //Create a while loop that runs so long as i is less than or equal to 15
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int x = 0;
//        do {
//            System.out.println(x);
//            x = x + 2;
//        } while (x <= 100);


        //Alter your loop to count backwards by 5's from 100 to -10.
//        int y = 100;
//        do {
//            System.out.println(y);
//            y = y - 5;
//        } while (y >= -10);

        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        long z = 2;
//        do {
//            System.out.println(z);
//            z = z*z;
//        } while (z < 100000);

        //Refactor the previous two exercises to use a for loop instead.
//        for(int i = 5; i <= 15; i += 1){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }
//
//        for (int x = 100; x >=-10; x -= 5 ){
//            System.out.println(x);
//        }
//
//        for (long y = 2; y <= 1000000; y = y*y) {
//            System.out.println(y);
//        }

        //Fizzbuzz One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

//        int i;
//        for (i = 1; i <= 100; i++)
//            // Have to put this one first because if we put it at the bottom it will do the other checks first before hitting this one.
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                // can use all if statements by using continue after each statement
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }else
//                System.out.println(i);

        //Display a table of powers.


        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table:");
        System.out.printf("%nNumber" + " | " + "squared" + " | " + "cubed");
        System.out.printf("%n------" + " | " + "-------" + " | " + "-----");
        // write loop that starts at 1 and counts up to
        for (int i = 1; i <= userInput; i++) {
            System.out.printf("%n%s", i + "      | " + i * i + "       | " + i*i*i);
        }

        //Convert given number grades into letter grades.
//        System.out.println("What is your number grade from 0 to 100?");
//        int userGrade = scanner.nextInt();
//        if (userGrade <= 59) {
//            System.out.println("F: 59-0");
//        }



    }
}
