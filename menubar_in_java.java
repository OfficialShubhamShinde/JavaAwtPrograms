package AWT_Releted_Programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class menubar_in_java extends Frame {
    public void frame() {
        Frame f = new Frame();    // For frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void menu() {
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu menu = new Menu("Insert");       // it is an MenuBar
        Menu menu2 = new Menu("Update");
        Menu menu3 = new Menu("Delete");

        mb.add(menu);
        mb.add(menu2);
        mb.add(menu3);

        MenuItem i1 = new MenuItem("Why",new MenuShortcut(KeyEvent.VK_W));    // for add items in menubar one menu
        MenuItem i2 = new MenuItem("What");
        MenuItem i3 = new MenuItem("When");

        

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);



    }

    public static void main(String args[]){
        menubar_in_java m = new menubar_in_java();
        m.frame();
        m.menu();
    }
}
