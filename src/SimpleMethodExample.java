public class SimpleMethodExample {
//When creating a method use public static for now


    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int total = doIt(num1, num2, num3);

        System.out.println(total);

    }

    public static int doIt(int num1, int num2, int num3) {
        return doMath(num1, num2, num3);
    }
    public static int doMath(int num1, int num2, int num3) {
        return num1 + (num2 * num3);
    }

}
