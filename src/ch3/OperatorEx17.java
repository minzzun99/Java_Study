package ch3;

public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;      // 반올림 하는 법
        System.out.println(shortPi);
    }
}
