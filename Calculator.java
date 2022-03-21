package AWT_Releted_Programs;

import java.awt.*;

public class Calculator extends Frame{
    public void frame(){
        Frame f = new Frame();
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
       }
       public void TextField(){
        TextField tf1 = new TextField(10);
        add(tf1);
           TextField tf2 = new TextField(10);
           add(tf2);
           TextField tf3 = new TextField(10);
           add(tf3);
       }
       public void buttons(){
        Button b1 = new Button("+");
        add(b1);
           Button b2 = new Button("-");
           add(b2);
           Button b3 = new Button("X");
           add(b3);
           Button b4 = new Button("/");
           add(b4);
           Button b5 = new Button("=");
           add(b5);
           Button b6 = new Button("0");
           add(b6);
       }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.frame();
        c.TextField();
        c.buttons();
    }
}
