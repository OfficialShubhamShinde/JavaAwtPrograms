package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Choise_Function extends Frame {
    public void frame(){
        Frame f = new Frame();
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());

        Choice c = new Choice();
        add(c);
        c.add("Maths");
        c.add("English");
        c.add("Hindi");
        c.add("Marathi");

        Button b = new Button("Select");
        add(b);

//        Here also a remove method & index of chossen iteam

        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String t = c.getSelectedItem();
                System.out.println("Selected iteam is : " + t);
            }
        });

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = c.getSelectedItem();
                System.out.println("Finally u r choose item is : " + s);
            }
        });

    }
    public static void main(String[] args) {
        Choise_Function cf = new Choise_Function();
        cf.frame();
    }
}
