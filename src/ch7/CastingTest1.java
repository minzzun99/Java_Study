package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;       // 자식 -> 부모  Car에 fe의 주소를 넣는다  (Car)fe
//        car.water()       // Car 타입의 참조변수로는 water() 접근 불가
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }
    void stop() {
        System.out.println("stop!!!");

    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
