package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action_Listner extends Frame{
    public void frame(){
        Frame f = new Frame();
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void button(){
        Button b = new Button("Click me");
        b.addActionListener(new action1());
        add(b);
    }
    class action1 implements ActionListener {
        public void ActionPerformed(ActionEvent e) {
            System.out.println("Clicked Succsessfull");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked Succsessfull");
        }
    }
    public static void main(String[] args) {
        Action_Listner al = new Action_Listner();
        al.frame();
        al.button();


    }
}

