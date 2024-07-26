package ch7;
class MathUtil {

    // 정수 두 개를 더하는 메소드
    public int add(int a, int b) {
        return a + b;
    }

    // 실수 두 개를 더하는 메소드
    public double add(double a, double b) {
        return a + b;
    }

    // 정수 세 개를 더하는 메소드
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingOverloadingEx {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Dog barks
    }
}