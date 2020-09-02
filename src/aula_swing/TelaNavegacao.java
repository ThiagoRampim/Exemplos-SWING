package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class TelaNavegacao extends JFrame implements ActionListener {
    
    JButton btExemplos[];
    
    TelaNavegacao(){
        btExemplos = new JButton[9];
        for (int i = 0; i < 9; i++){
            String titulo = "Exemplo " + Integer.toString(i + 1);
            btExemplos[i] = new JButton(titulo);
            btExemplos[i].setBounds(70, 40 * (i + 1), 100, 25);
            btExemplos[i].addActionListener(this);
            add(btExemplos[i]);
        }
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 500);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == btExemplos[0]){
            Exemplo1 exemplo = new Exemplo1();
        }
        if (ae.getSource() == btExemplos[1]){
            Exemplo2 exemplo = new Exemplo2();
        }
        if (ae.getSource() == btExemplos[2]){
            Exemplo3 exemplo = new Exemplo3();
        }
        if (ae.getSource() == btExemplos[3]){
            Exemplo4 exemplo = new Exemplo4();
        }
        if (ae.getSource() == btExemplos[4]){
            Exemplo5 exemplo = new Exemplo5();
        }
        if (ae.getSource() == btExemplos[5]){
            Exemplo6 exemplo = new Exemplo6();
        }
        if (ae.getSource() == btExemplos[6]){
            Exemplo7 exemplo = new Exemplo7();
        }
        if (ae.getSource() == btExemplos[7]){
            Exemplo8 exemplo = new Exemplo8();
        }
        if (ae.getSource() == btExemplos[8]){
            Exemplo9 exemplo = new Exemplo9();
        }
    }
    
}
