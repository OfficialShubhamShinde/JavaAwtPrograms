package AWT_Releted_Programs;

import java.awt.*;

public class lable extends Frame {
    public void frame(){
        Frame f = new Frame();
        setVisible(true);
        setSize(700,500);
        setLayout(new FlowLayout());

        Label l = new Label("Email");
        TextField tf = new TextField(10);

        Label l2 = new Label("Email");
        TextField tf1 = new TextField(10);

        add(l);
        add(tf);
        add(l2);
        add(tf1);
    }
    public static void main(String[] args) {
        lable l = new lable();
        l.frame();
//        l.textfield();
    }
}
