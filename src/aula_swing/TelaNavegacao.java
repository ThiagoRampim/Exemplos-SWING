package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class TelaNavegacao extends JFrame implements ActionListener {
    
    JButton btExemplos[];
    
    TelaNavegacao(){
        
        // Lista em ordem para titulo dos botões
        String titulo[] = {"Button", "TextField", "TextArea", "PasswordField",
                "CheckBox", "RadioButton", "ComboBox", "Table", "List"};
        
        btExemplos = new JButton[9];
        for (int i = 0; i < 9; i++){
            btExemplos[i] = new JButton(titulo[i]);
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
            ExButton exemplo = new ExButton();
        }
        if (ae.getSource() == btExemplos[1]){
            ExTextField exemplo = new ExTextField();
        }
        if (ae.getSource() == btExemplos[2]){
            ExTextArea exemplo = new ExTextArea();
        }
        if (ae.getSource() == btExemplos[3]){
            ExPasswordField exemplo = new ExPasswordField();
        }
        if (ae.getSource() == btExemplos[4]){
            ExCheckBox exemplo = new ExCheckBox();
        }
        if (ae.getSource() == btExemplos[5]){
            ExRadioButton exemplo = new ExRadioButton();
        }
        if (ae.getSource() == btExemplos[6]){
            ExComboBox exemplo = new ExComboBox();
        }
        if (ae.getSource() == btExemplos[7]){
            ExTable exemplo = new ExTable();
        }
        if (ae.getSource() == btExemplos[8]){
            ExList exemplo = new ExList();
        }
    }
    
}
