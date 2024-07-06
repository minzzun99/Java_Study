package ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);        // int 타입보다 작은 타입은 int로 변환 후에 연산하기 때문에 byte타입인 c에 저장하기 위해선
                                        // 명시적 형변환이 필요함
        System.out.println(c);
    }
}
