package ch7;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropShip);
        // scv.repair(marine);      //에러 marine은 Repairable 인터페이스를 구현하지 않음
    }
}

interface Repairalble { }

class Unit1 {
    int hitPoint;
    final int MAX_HP;
    Unit1(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit1{
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit1{
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairalble{
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}

class DropShip extends AirUnit implements Repairalble {
    DropShip() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "DropShip";
    }
}

class Marine extends GroundUnit{
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Marine";
    }
}

class SCV extends GroundUnit implements Repairalble {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairalble r) {
        if (r instanceof Unit1) {
            Unit1 u = (Unit1) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}