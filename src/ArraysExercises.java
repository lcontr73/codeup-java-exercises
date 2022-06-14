import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] person = new String[3];
        person[0] = "Bob";
        person[1] = "Sam";
        person[2] = "Sara";

        for (String ofPeople : person) {
            System.out.println(ofPeople);
        }

        Person[] newPersonsArray;
        Person peter = new Person("Peter");
//        newPersonsArray = ArraysExercises.addPerson(peter, persons);


    }

    public static Person[] addPerson(Person newPerson, Person[] persons) {
        Person[] newPersonArray;
        newPersonArray = new Person[persons.length + 1];
        for (int i = 0; i < persons.length; i++) {
            newPersonArray[i] = persons[i];
        }
        newPersonArray[newPersonArray.length - 1] = newPerson;
        return newPersonArray;
    }

//    public static void addPerson(String[] person) {
//        for (String newArray : person) ;
//    }
//    public static Person[]
//    newArrayAddPerson(Person[] newArr, Person addPerson) {
//        Person[] newPerson = Arrays.copyOf(newArr, newArr.length + 1);
//        newPerson[newPerson.length - 1] = addPerson;
//        return newPerson;
//    }
}
