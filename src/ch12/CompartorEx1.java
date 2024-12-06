package ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorEx1 {
    private static class Node implements Comparator<Node> {
        String name;
        int number;

        Node(String name, int number) {
            this.name = name;
            this.number = number;
        }

        Node() { }

        @Override
        public int compare(Node o1, Node o2) {
            return o2.number - o1.number;
        }

        @Override
        public String toString() {
            return name + " " + number;
        }
    }

    private static class Node2 implements Comparable<Node2> {
        String name;
        int number;

        Node2(String name, int number) {
            this.name = name;
            this.number = number;
        }

        @Override
        public String toString() {
            return name + " " + number;
        }

        @Override
        public int compareTo(Node2 o) {
            return o.number - this.number;
        }
    }

    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        list.add(new Node("Apple", 100));
        list.add(new Node("Grape", 200));
        list.add(new Node("Kang", 300));
        list.add(new Node("Jun", 400));

        Node compareInstance = new Node();
        Collections.sort(list, compareInstance);

        System.out.println("Comparator 사용 : " + list);
        System.out.println();

        List<Node2> list2 = new ArrayList<>();
        list2.add(new Node2("Apple", 100));
        list2.add(new Node2("Grape", 200));
        list2.add(new Node2("Kang", 300));
        list2.add(new Node2("Jun", 400));

        Collections.sort(list2);

        System.out.println("Comparator 사용 : " + list);
        System.out.println();
    }
}
