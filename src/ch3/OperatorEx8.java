package ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        long c = a * b;         //이미 int로 계산이 되었기때문에 long으로 자동형변환이 안됨 명시적으로 변환해야함
        System.out.println(c);
    }
}
