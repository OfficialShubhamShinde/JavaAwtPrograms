package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Check_Box_Listner extends Frame {
    public void frame(){
        Frame f = new Frame();
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());

        Checkbox c = new Checkbox("Java");
        add(c);
        Checkbox c1 = new Checkbox("Python");
        add(c1);
        Checkbox c2 = new Checkbox("C++");
        add(c2);

        Button B = new Button("Ok");
        add(B);

        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getItem());
            }
        });
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getItem());
            }
        });
        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getItem());
            }
        });
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Successfully");
            }
        });
    }
    public static void main(String[] args) {
        Check_Box_Listner c= new Check_Box_Listner();
        c.frame();

    }
}
