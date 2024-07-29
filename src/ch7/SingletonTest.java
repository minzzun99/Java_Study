package ch7;

final class Singleton {
    private static Singleton s = new Singleton();       // private 클래스이기때문에 static을 통해서 인스턴스 미리 생성
    private Singleton() {
        //...
    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();        // private 생성자 이기때문에 객체 생성 불가
        Singleton s = Singleton.getInstance();
    }
}

