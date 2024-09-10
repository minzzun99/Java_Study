package ch11;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);       // 용량(capacity)이 5인 Vector 생성
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();     // 빈 공간 제거. (용량과 크기가 같아짐)
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);
    }

    private static void print(Vector vector) {
        System.out.println(vector);
        System.out.println("size : " + vector.size());
        System.out.println("capacity : " + vector.capacity());
    }
}
