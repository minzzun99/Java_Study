package ch2;

public class CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;       //23자리 뒤로는 버려지고 24번째 자리에서 반올림이 발생해서 23번째자리 1증가
        double d = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f = %20.18f%n", f);
        System.out.printf("d = %20.18f%n", d);
        System.out.printf("d2 = %20.18f%n", d2);
    }
}
