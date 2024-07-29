package ch7;

public class CastingTesting2 {
    public static void main(String[] args) {
        Car car = new Car();
//        Car car = new FireEngine();       // 이러면 오류발생 X
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car;
        fe.drive();         //부모의 인스턴스를 자식의 참조변수가 참조하는것은 X
        car2 = fe;
        car2.drive();
    }
}
