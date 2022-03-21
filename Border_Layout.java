package AWT_Releted_Programs;

import java.awt.*;

public class Border_Layout extends Frame {
        public void frame() {
            Frame f = new Frame();
            setSize(700, 500);
            setVisible(true);
        }
        public void BL(){

            setLayout(new BorderLayout(10,20));  // for an horizontal & vertical gap

            Panel p = new Panel();
            p.setBackground(Color.blue);
            add(p, BorderLayout.SOUTH);
            p.setPreferredSize(new Dimension(50,100));

            Panel p1 = new Panel();
            p1.setBackground(Color.green);
            p1.setPreferredSize(new Dimension(20,40));
            add(p1, BorderLayout.NORTH);

            Panel p2 = new Panel();
            p2.setBackground(Color.yellow);
            p1.setPreferredSize(new Dimension(25,50));
            add(p2, BorderLayout.WEST);

            Panel p3 = new Panel();
            p3.setBackground(Color.red);
            p1.setPreferredSize(new Dimension(30,20));
            add(p3, BorderLayout.EAST);

            Panel p4 = new Panel();
            p4.setBackground(Color.pink);
            add(p4, BorderLayout.CENTER);
        }

        public static void main(String[] args) {
            Border_Layout b = new Border_Layout();
            b.frame();
            b.BL();
        }
    }
