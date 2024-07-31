package ch7;

class Product02 {
    int price;
    int bonusPoint;

    Product02(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product02() { }
}

class Tv02 extends Product02 {
    Tv02() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer02 extends Product02 {
    Computer02() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Audio02 extends Product02 {
    Audio02() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer02 {
    int money = 1000;
    int bonusPoint = 0;
    Product02[] item = new Product02[10];
    int i = 0;
    void buy(Product02 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                break;
            }
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer02 b = new Buyer02();
        b.buy(new Tv02());
        b.buy(new Computer02());
        b.buy(new Audio02());
        b.summary();
    }
}
