package aula_swing;

import javax.swing.*;

public class ExMenuBar extends JFrame {
    
    JMenu menu1, menu2, submenu1, submenu2;
    JMenuItem i1, i2, i3, i4, i5, i6, i7;
    
    ExMenuBar(){
        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        
        menu1 = new JMenu("Menu 1");
        barraMenu.add(menu1);
        
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        submenu1 = new JMenu("SubMenu 1");
        menu1.add(i1); menu1.add(i2); menu1.add(i3); menu1.add(submenu1);
        
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        submenu2 = new JMenu("SubMenu 2");
        submenu1.add(i4); submenu1.add(i5); submenu1.add(submenu2);
        
        i6 = new JMenuItem("Item 6");
        submenu2.add(i6);
        
        menu2 = new JMenu("Menu 2");
        barraMenu.add(menu2);
        
        i7 = new JMenuItem("Item 7");
        menu2.add(i7);
        
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    
}
