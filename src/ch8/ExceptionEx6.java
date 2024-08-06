package ch8;

public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (Exception e) {         //ArithmeticException 대신에 Exception 사용
            System.out.println(5);      //Exception 이기때문에 어떤 예외도 처리
        }
        System.out.println(6);
    }
}
