package exemplos;

import java.awt.event.*;
import javax.swing.*;


public class ExButton extends JFrame implements ActionListener {
    
    JButton b;
    
    public ExButton(){
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
        dispose();
    }
}
