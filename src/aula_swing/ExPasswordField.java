package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class ExPasswordField extends JFrame implements ActionListener {
    
    JTextField login;
    JPasswordField senha;
    JLabel texto;
    
    ExPasswordField(){
        texto = new JLabel();
        texto.setBounds(20, 150, 300, 50);
        senha = new JPasswordField();
        senha.setBounds(100, 75, 100, 30);
        JLabel l1 = new JLabel("Usuário:");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Senha:");
        l2.setBounds(20, 75, 80, 30);
        JButton b = new JButton("Entrar");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);
        login = new JTextField();
        login.setBounds(100, 20, 100, 30);
        
        add(senha); add(l1); add(texto); add(l2); add(b); add(login);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String data = "Username " + login.getText();
        data += ", Password: " + new String(senha.getPassword());
        texto.setText(data);
    }
    
}
