package ch8;

public class ExceptionEx8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            String s = null;
            System.out.println(3);
            // NullPointerException 발생
            s = s.toLowerCase();
            System.out.println(s);

            // ArithmeticException 발생
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("예외 메시지 : " + e.getMessage());
        }
        System.out.println(5);
    }
}
