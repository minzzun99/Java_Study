package ch9;

public class StringEx2 {
    public static void main(String[] args) {
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";          // s1, s2, s3는 같은 String 인스턴스를 참조함 그래서 s1 == s2가 true
        String s4 = "BBB";
    }
}
