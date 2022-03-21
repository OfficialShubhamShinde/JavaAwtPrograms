package AWT_Releted_Programs;

import java.awt.*;

public class Grid_Layout extends Frame{
    public void frame(){
        Frame f = new Frame();
        setSize(700,500);
        setVisible(true);

        setLayout(new GridLayout(2,3, 10,15));

        add(new Button ("Hii"));
        add(new Button ("Hello"));
        add(new Button ("Byy"));
        add(new Button ("Hello"));
        add(new Button ("Hello"));
        add(new Button ("Hello"));
        add(new Button ("Hello"));
        add(new Button ("Hello"));
    }

    public static void main(String[] args) {
        Grid_Layout g = new Grid_Layout();
        g.frame();
    }
}
