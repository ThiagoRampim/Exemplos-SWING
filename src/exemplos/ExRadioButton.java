package exemplos;

import java.awt.event.*;
import javax.swing.*;

public class ExRadioButton extends JFrame implements ActionListener {
    
    JRadioButton rb1, rb2;
    JButton b;
    
    public ExRadioButton(){
        rb1 = new JRadioButton("Maculino");
        rb1.setBounds(70, 50, 100, 30);
        rb2 = new JRadioButton("Feminino");
        rb2.setBounds(70, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2);
        b = new JButton("Enviar");
        b.setBounds(70, 150, 150, 30);
        b.addActionListener(this);
        
        add(rb1); add(rb2); add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if (rb1.isSelected()){
            JOptionPane.showMessageDialog(this, "Você é menino.");
        }
        if (rb2.isSelected()){
            JOptionPane.showMessageDialog(this, "Você é menina.");
        }
    }
    
}
