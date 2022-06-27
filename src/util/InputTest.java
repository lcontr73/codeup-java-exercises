package util;

public class InputTest {
    public static void main(String[] args) {
        Input input1 = new Input();
        input1.getString();

        Input input2 = new Input();
//        input2.getInt();
        System.out.println(input2.getInt());

        Input input3 = new Input();
//        input3.yesNo();
        System.out.println(input3.yesNo());

        Input input4 = new Input();
//        input3.yesNo();
        System.out.println(input4.getInt(5,10));
    }

}
