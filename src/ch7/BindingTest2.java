package ch7;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent01 p = new Child01();
        Child01 c = new Child01();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent01 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child01 extends Parent01 {

}