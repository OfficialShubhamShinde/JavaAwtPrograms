package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text_Area extends Frame {
    public void frame(){
        Frame f = new Frame();
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());

        TextArea ta = new TextArea("Start Typing here.....", 10,30);
        add(ta);

        Button B = new Button("Show");
        add(B);

        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = ta.getText();
                System.out.println("U Written as : " + s);
            }
        });
    }
    public static void main(String[] args) {
        Text_Area t = new Text_Area();
        t.frame();
    }
}
