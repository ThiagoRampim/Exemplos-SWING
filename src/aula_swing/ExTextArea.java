package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class ExTextArea implements ActionListener {
    
    JLabel l1, l2;
    JTextArea area;
    JButton b;
    
    public ExTextArea(){
        JFrame f = new JFrame();
        l1 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2 = new JLabel();
        l2.setBounds(160,25,100,30);
        area = new JTextArea();
        area.setBounds(20,75,250,200);
        b = new JButton("Contar Palavras");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);
        
        f.add(l1);f.add(l2);f.add(area);f.add(b);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Palavras: " + words.length);
        l2.setText("Caracteres: " + text.length());
    }
    
}