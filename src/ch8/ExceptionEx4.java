package ch8;

public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);      // 예외가 발생되지 않았기 때문에 실행되지 않는다.
        }
        System.out.println(6);
    }
}
