package AWT_Releted_Programs;

import java.awt.*;

public class Panal_In_AWS extends Frame {
    public void frame(){
        Frame f = new Frame("Panel Example");
        setVisible(true);
        setSize(700,500);
        setLayout(new BorderLayout());

        Panel p = new Panel();
        add(p,BorderLayout.EAST);
        p.setBackground(Color.pink);

        Panel p1 = new Panel();
        add(p1,BorderLayout.WEST);
        p1.setBackground(Color.red);
        p1.setPreferredSize(new Dimension(200,300));

//        ScrollPane s = new ScrollPane();
//        p.add(s);
    }
    public static void main(String[] args) {
        Panal_In_AWS pn = new Panal_In_AWS();
        pn.frame();
    }
}
