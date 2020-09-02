package aula_swing;

import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.*;


public class Exemplo2 extends JFrame implements ActionListener {
    
    JTextField tf; JLabel l; JButton b, c;
    
    Exemplo2(){
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        l = new JLabel();
        l.setBounds(50, 100, 250, 20);
        b = new JButton("Encontrar IP");
        b.setBounds(50,150,150,30);
        b.addActionListener(this);
        c = new JButton("Colocar Texto");
        c.setBounds(50,200,150,30);
        c.addActionListener(this);
        
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(b); add(c); add(tf); add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        l.setText("");
        if (ae.getSource() == b){
            try{
                String host = "";
                String ip = java.net.InetAddress.getByName(host).getHostAddress();
                l.setText("IP of "+host+" is: "+ip);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        if (ae.getSource() == c){
            l.setText(tf.getText());
        }
    }
}
