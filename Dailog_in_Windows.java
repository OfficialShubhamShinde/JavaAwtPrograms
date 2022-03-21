package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Dailog_in_Windows extends Frame {
    public void frame(){
        Frame f = new Frame();
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());

        Button b = new Button("Click Here");
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog d = new Dialog(Dailog_in_Windows.this, "Prefferencess");
                d.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        dispose();
                    }
                });
                d.setSize(400,300);
                d.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        Dailog_in_Windows dw = new Dailog_in_Windows();
        dw.frame();
    }
}
