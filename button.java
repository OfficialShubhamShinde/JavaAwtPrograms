package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class button extends Frame {
    public void frame1(){
        Frame f = new Frame();
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void cross(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void textF(){
        TextField tf = new TextField("I am shubham ");
        tf.setBounds(20,100,120,40);
        add(tf);
    }
    public void button10(){
        Button b2 = new Button("Click here");
        b2.setBackground(Color.red);
        add(b2);
        Button b3 = new Button("Click here");
        add(b3);
        Button b4 = new Button("Click here");
        add(b4);
    }
    public static void main(String[] args) {
        button b1 = new button();
        b1.frame1();
        b1.cross();
        b1.button10();
        b1.textF();
    }
}
