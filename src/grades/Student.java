package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }


    //this allows for the output of each student plus their array of grades. I have to convert it back to a string to get the Arraylist to populate
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

//    public Student(String name, ArrayList<Integer> grades) {
//        this.name = name;
//        this.grades = grades;
//    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0, avg = 0;
        for (Integer grade : grades) sum += grade;
        return avg;
    }
}
