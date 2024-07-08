package ch3;

public class Operator26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a != 0 || ++b !=0 = %b%n", a != 0 || ++b != 0);      //왼쪽 조건이 어차피 참이라 참 출력하고 뒤는 실행 X
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a == 0 && ++b != 0 = %b%n", a == 0 && ++b != 0);     //왼쪽 조건이 어차피 거짓이라 거짓 출력하고 뒤는 실행 X
        System.out.printf("a = %d, b = %d%n", a, b);
    }
}
