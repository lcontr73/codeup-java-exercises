package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
// Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
        HashMap<String, Student> students = new HashMap<>();
        Student ryanorsinger = new Student("ryan", new ArrayList<>());
        ryanorsinger.addGrade(70);
        ryanorsinger.addGrade(80);
        ryanorsinger.addGrade(90);

        students.put("ryanorsinger", ryanorsinger);
//        students.put("Zach", "zgulde");
//        students.put("Fernando", "fmendozaro");
//        students.put("Justin", "jreich5");

        Scanner scanner = new Scanner(System.in);
        String first;
        System.out.println("Please pick a user");
        first = scanner.next() + scanner.nextLine();
        System.out.println(first);

    }
}
