package ch3;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);        // byte 타입은 -128 ~ 127까지  따라서 overflow 발생
        System.out.println(c);
    }
}
