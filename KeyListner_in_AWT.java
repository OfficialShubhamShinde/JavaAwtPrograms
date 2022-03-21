package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListner_in_AWT extends Frame {
    public void frame() {
        Frame f = new Frame();
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        TextField tf = new TextField(10);
        add(tf);
        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("U r Typed : " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("U r key pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("U relesed key");
            }
        });
    }
    public static void main(String[] args) {
        KeyListner_in_AWT kiw = new KeyListner_in_AWT();
        kiw.frame();
    }
}
