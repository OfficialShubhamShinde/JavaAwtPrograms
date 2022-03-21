package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Flow_Layout {
    public static void main(String[] args) {
        // for Frame

        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(700,500);
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 40));
        TextField tf = new TextField("MIT-WPU");
        tf.setBackground(Color.blue);
        f.add(tf);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}
