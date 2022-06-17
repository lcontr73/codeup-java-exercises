package grades;

import util.Input;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
//        ArrayList<Integer> grades = new ArrayList<>();
//        grades.add(80);
        Student name = new Student("Bob");
        name.addGrade(80);
        name.addGrade(70);
        name.addGrade(90);

        System.out.println("The students grades are: \n" + name);
        System.out.println(name.getGradeAverage());

        Student nameJim = new Student("Jim");
        nameJim.addGrade(95);
        nameJim.addGrade(85);
        nameJim.addGrade(75);
        System.out.println(nameJim);

    }
}
