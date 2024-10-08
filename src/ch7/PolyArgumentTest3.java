package ch7;

import java.util.Vector;

class Product03 {
    int price;
    int bonusPoint;

    Product03(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product03() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv03 extends Product03 {
    Tv03() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer03 extends Product03 {
    Computer03() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Audio03 extends Product03 {
    Audio03() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer03 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product03 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product03 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for (int i = 0; i < item.size(); i++) {
            Product03 p = (Product03) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer03 b = new Buyer03();
        Tv03 tv = new Tv03();
        Computer03 com = new Computer03();
        Audio03 audio = new Audio03();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
