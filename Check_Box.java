package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Check_Box extends Frame{
    public void frame(){
        Frame f = new Frame();
        setVisible(true);
        setSize(700,500);

        setLayout(new FlowLayout());
    }
    public void CB(){
        Checkbox c = new Checkbox("Phython");
        add(c);
        Checkbox c1 = new Checkbox("Java");
        add(c1);
        Checkbox c2 = new Checkbox("C++");
        add(c2);

        Button b = new Button("Ok");
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Successfully");

                System.out.println(c.getLabel() + "--->" + c.getState());
                System.out.println(c1.getLabel() + "--->" + c1.getState());
                System.out.println(c2.getLabel() + "--->" + c2.getState());

            }
        });
    }

    public static void main(String[] args) {
        Check_Box c = new Check_Box();
        c.frame();
        c.CB();
    }
}
