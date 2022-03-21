package AWT_Releted_Programs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class sirCalci {
    class calci extends Frame implements ActionListener
    {
        JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bdot,beq;
        JTextField t1;
        calci()
        {
            super("Calci");
            t1=new JTextField(40);
            b0=new JButton("0");
            b1=new JButton("1");
            b2=new JButton("2");
            b3=new JButton("3");
            b4=new JButton("4");
            b5=new JButton("5");
            b6=new JButton("6");
            b7=new JButton("7");
            b8=new JButton("8");
            b9=new JButton("9");
            badd=new JButton("+");
            bsub=new JButton("-");
            bmul=new JButton("*");
            bdiv=new JButton("/");
            beq=new JButton("=");
            bdot=new JButton(".");

            b0.addActionListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            bdot.addActionListener(this);


            Panel p = new Panel();
            p.setLayout(new GridLayout(4,4));
            p.add(b7); p.add(b8); p.add(b9); p.add(bdiv);
            p.add(b4); p.add(b5); p.add(b6); p.add(bmul);
            p.add(b1); p.add(b2); p.add(b3); p.add(bsub);
            p.add(b0); p.add(bdot); p.add(beq); p.add(badd);
            setLayout(new FlowLayout());


            Panel p2=new Panel();
            p2.setLayout(new BorderLayout());
            p2.add("North",t1);
            p2.add("Center",p);

            add(p2);
            setSize(300,300);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {
            String s=e.getActionCommand();
            if(s.equals("0"))
                t1.setText(t1.getText()+"0");
            if(s.equals("1"))
                t1.setText(t1.getText()+"1");
            if(s.equals("2"))
                t1.setText(t1.getText()+"2");
            if(s.equals("3"))
                t1.setText(t1.getText()+"3");
            if(s.equals("4"))
                t1.setText(t1.getText()+"4");
            if(s.equals("5"))
                t1.setText(t1.getText()+"5");
            if(s.equals("6"))
                t1.setText(t1.getText()+"6");
            if(s.equals("7"))
                t1.setText(t1.getText()+"7");
            if(s.equals("8"))
                t1.setText(t1.getText()+"8");
            if(s.equals("9"))
                t1.setText(t1.getText()+"9");
            if(s.equals("."))
                t1.setText(t1.getText()+".");
        }
        public static void main(String args[])
        {
            new calci();
        }
    }
