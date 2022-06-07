public class ControlFlowExercises {
    public static void main(String[] args) {
        //Create an integer variable i with a value of 5.
//        int i = 5;
        //Create a while loop that runs so long as i is less than or equal to 15
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }


        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int x = 0;
//        do {
//            System.out.println(x);
//            x = x + 2;
//        } while (x >= -10);


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
        for(int i = 5; i <= 15; i += 1){
            System.out.println(i);
        }

        for(int i = 0; i <= 100; i += 2){
            System.out.println(i);
        }

        for (int x = 100; x >=-10; x -= 5 ){
            System.out.println(x);
        }

        for (long y = 2; y <= 1000000; y = y*y) {
            System.out.println(y);
        }





    }
}
