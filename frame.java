package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frame extends Frame{
        public frame(){
            // This is for Creating Frame

            Frame f = new Frame("Welcome to my AWT Platform");
            setVisible(true);
            setSize(700, 500);
            setLocation(250,100);
            setBackground(Color.gray);


            // This is for Close Program X

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });

        }
        public static void main(String[] args) {
        new frame();
    }
}
