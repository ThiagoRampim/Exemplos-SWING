package aula_swing;

import exemplos.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaNavegacao extends JFrame implements ActionListener {
    
    JButton btExemplos[];
    JLabel l;
    
    TelaNavegacao(){
        l = new JLabel("Escolha um exemplo:");
        l.setBounds(120, 20, 160, 25);
        add(l);
        
        // Lista em ordem para titulo dos botões
        String titulo[] = {"Button", "TextField", "TextArea", "PasswordField",
                "CheckBox", "RadioButton", "ComboBox", "Table", "List", 
                "MessageDialog", "ScrollBar", "MenuBar", "CheckBoxMenuItem",
                "PopUpMenu"};
        
        int qtdBotoes = titulo.length;
        
        btExemplos = new JButton[qtdBotoes];
        for (int i = 0; i < qtdBotoes; i++){
            btExemplos[i] = new JButton(titulo[i]);
            
            //Calculando posições
            int posX = 0;
            int posY = 40; //posição inicial
            if ((i % 2) == 0){
                posX = 25;
                posY += 20 * (i + 1);
            }else{
                posX = 200;
                posY += 20 * i;
            }
            
            btExemplos[i].setBounds(posX, posY, 150, 25);
            btExemplos[i].addActionListener(this);
            add(btExemplos[i]);
        }
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
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
        if (ae.getSource() == btExemplos[9]){
            ExMessageDialog exemplo = new ExMessageDialog();
        }
        if (ae.getSource() == btExemplos[10]){
            ExScrollBar exemplo = new ExScrollBar();
        }
        if (ae.getSource() == btExemplos[11]){
            ExMenuBar exemplo = new ExMenuBar();
        }
        if (ae.getSource() == btExemplos[12]){
            ExCheckBoxMenuItem exemplo = new ExCheckBoxMenuItem();
        }
        if (ae.getSource() == btExemplos[13]){
            ExPopUpMenu exemplo = new ExPopUpMenu();
        }
    }
    
}
