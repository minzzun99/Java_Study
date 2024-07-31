package ch7;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent02 p = new Child02();
        Child02 c = new Child02();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
class Parent02 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child02 extends Parent02{
    int x = 200;

    @Override
    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x ) ;
    }
}