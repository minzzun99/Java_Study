package ch9;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
//        Integer i = Integer.valueOf(100);     // 자바 9 이상부터는 이렇게 사용 이게 더 성능 좋음
        Integer i2 = new Integer(100);

        System.out.println("i == i2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
        System.out.println("i.toString() = " + i.toString());

        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("MAX_VALUE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + " bits");
        System.out.println("BYTES = " + Integer.BYTES + " bytes");
        System.out.println("TYPE = " + Integer.TYPE);
    }
}
