package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class ExComboBox extends JFrame implements ActionListener {
    
    JLabel l;
    JComboBox cb;
    
    ExComboBox(){
        l = new JLabel();
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setSize(400, 50);
        JButton b = new JButton("Mostrar");
        b.setBounds(200, 100, 100, 20);
        b.addActionListener(this);
        String linguagens[] = {"C", "C++", "C#", "Java", "PHP"};
        cb = new JComboBox(linguagens);
        cb.setBounds(50, 100, 90, 20);
        
        add(cb); add(l); add(b);
        setLayout(null);
        setSize(350, 350);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String dados = "Linguagem de programação selecionada: "+ cb.getItemAt(cb.getSelectedIndex());
        l.setText(dados);
    }
    
}
