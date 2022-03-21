package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class List_In_Java extends Frame {
    public void frame(){
        Frame f  = new Frame();
        setVisible(true);
        setSize(700,500);
        setLayout(new FlowLayout());
    }
    public void list(){
        List l = new List(5,true);
        add(l);
        l.add("Java");
        l.add("Python");
        l.add("c");
        l.add("C++");
        l.add("HTML");
        l.add("Java");
        l.add("Python");
        l.add("c");
        l.add("C++");
        l.add("HTML");

        l.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String [] s = l.getSelectedItems();
                for (String z : s){
                    System.out.println("Selected item is : " + z );
                }
            }
        });

        Button b = new Button("Choose");
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] s1 = l.getSelectedItems();
                for (String x : s1){
                    System.out.println("U are selected items Are : " + x);
                }
            }
        });

    }
    public static void main(String[] args) {
        List_In_Java l = new List_In_Java();
        l.frame();
        l.list();
    }
}
