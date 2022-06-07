public class ControlFlowExercises {
    public static void main(String[] args) {
        //Create an integer variable i with a value of 5.
        int i = 5;
        //Create a while loop that runs so long as i is less than or equal to 15
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x = x + 2;
        } while (x <= 100);

    }
}
