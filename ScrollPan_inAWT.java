package AWT_Releted_Programs;

import java.awt.*;

public class ScrollPan_inAWT extends Frame{
    public void frame(){
        Frame f  = new Frame();
        setSize(200,300);
        setVisible(true);
        setLayout(new BorderLayout());
    }
    public void panal(){
        Panel p = new Panel();
        p.setPreferredSize(new Dimension(200,600));
        p.setBackground(Color.pink);
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        sp.add(p);

        Label l1 = new Label("Name");
        p.add(l1);
        TextField tf1 = new TextField(10);
        p.add(tf1);

        Label l2 = new Label("Email");
        p.add(l2);
        TextField tf2 = new TextField(10);
        p.add(tf2);

        Label l3 = new Label("Passw");
        p.add(l3);
        TextField tf3 = new TextField(10);
        p.add(tf3);

        Label l4 = new Label("Addres");
        p.add(l4);
        TextField tf4 = new TextField(10);
        p.add(tf4);

        add(p);
    }
    public static void main(String[] args) {
        ScrollPan_inAWT spf = new ScrollPan_inAWT();
        spf.frame();
        spf.panal();
    }
}
