package ch7;

import java.awt.*;
import java.awt.event.*;

// InnerEx7 예제를 익명클래스로 변경한 예제
public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
