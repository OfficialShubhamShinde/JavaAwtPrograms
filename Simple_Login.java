package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_Login extends Frame {
    public void frame(){
        Frame f = new Frame();
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());

        Label l = new Label("E-mail");
        add(l);

        TextField tf = new TextField(10);
        add(tf);

        Label l2 = new Label("Password");
        add(l2);

        TextField tf2 = new TextField(10);
        add(tf2);

        Button b = new Button("Login");
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog d = new Dialog(Simple_Login.this, "Login Successful");
                d.setVisible(true);
                d.setSize(400,300);
                d.setLayout(new GridLayout(3,1));
                Label lb1 = new Label("Your E-Mail ID Is : " + tf.getText());
                d.add(lb1);
                Label lb2 = new Label("Your Password is : " + tf2.getText());
                d.add(lb2);

            }
        });
    }
    public static void main(String[] args) {
        Simple_Login sl = new Simple_Login();
        sl.frame();
    }
}
