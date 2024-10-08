package ch9;

class Circle implements Cloneable {
    Point1 p;
    double r;

    Circle(Point1 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }       // Cloneable 인터페이스를 구현하지 않은 인스런스를 대상으로 호출하면

        return (Circle) obj;
    }

    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }

        Circle c = (Circle) obj;
        c.p = new Point1(this.p.x, this.p.y);
        return c;
    }

    public String toString() {
        return "[p=" + p + ", r=" + r + "]";
    }
}


class Point1 implements Cloneable {
    int x, y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point1(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("= c1의 변경 후 =");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
