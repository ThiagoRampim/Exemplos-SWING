package aula_swing;

import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.*;


public class Exemplo1 extends JFrame implements ActionListener {
    
    JButton b;
    
    Exemplo1(){
        JButton b = new JButton("Clique aqui");
        b.setBounds(130, 100, 100, 40);
        b.addActionListener(this);
        
        add(b);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        //System.exit(0);
        dispose();
    }
}
