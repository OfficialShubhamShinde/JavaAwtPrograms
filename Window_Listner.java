package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window_Listner extends Frame {
    public void WindowL(){
        Frame f = new Frame();
        setVisible(true);
        setSize(700,500);

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window open");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Icon in window");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Icon is Missing");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activate");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        Window_Listner w = new Window_Listner();
        w.WindowL();
    }
}
