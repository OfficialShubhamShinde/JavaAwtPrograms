package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swap_Text_in_Button extends Frame {
    public void frame(){
        Frame F = new Frame();
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void textfield(){
        TextField tf1 = new TextField(10);
        String s1 = tf1.getText();
        TextField tf2 = new TextField(10);
        String s2 = tf2.getText();
        add(tf1);
        add(tf2);
    }
    public void button(){
        Button b2 = new Button("Swap");
        b2.addActionListener(new ActionL());
        add(b2);
    }
    class ActionL implements ActionListener{
        public void al(ActionEvent e){
            System.out.println("Swap values");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Swap values");
        }
    }
    public static void main(String[] args) {
        Swap_Text_in_Button stb = new Swap_Text_in_Button();
        stb.frame();
        stb.textfield();
        stb.button();
    }
}
