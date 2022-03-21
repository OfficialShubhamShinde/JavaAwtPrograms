package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Text_Field {
    public static void main(String[] args) {
        // for Frame

        Frame f  = new Frame();
        f.setVisible(true);
        f.setBackground(Color.gray);
        f.setSize(700, 500);

        // For TextField
        TextField tf = new TextField("MIT-WPU");
        tf.setBackground(Color.blue);
        f.add(tf);

//        For close window
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}
