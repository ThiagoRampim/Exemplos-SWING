package exemplos;

import java.awt.event.*;
import javax.swing.*;

public class ExList extends JFrame implements ActionListener {
    
    JList<String> list1, list2;
    JLabel label;
    
    public ExList(){
        
        label = new JLabel();
        label.setSize(500, 100);
        JButton b = new JButton("Mostrar");
        b.setBounds(200, 150, 100, 30);
        final DefaultListModel<String> l1 = new DefaultListModel<>();
            l1.addElement("C");
            l1.addElement("C++");
            l1.addElement("Java");
            l1.addElement("PHP");
        list1 = new JList<>(l1);
        list1.setBounds(100, 100, 75, 75);
        final DefaultListModel<String> l2 = new DefaultListModel<>();
            l2.addElement("Turbo C++");
            l2.addElement("Struts");
            l2.addElement("Spring");
            l2.addElement("YII");
        list2 = new JList<>(l2);
        list2.setBounds(100, 200, 75, 75);
        b.addActionListener(this);
        
        add(list1); add(list2); add(b); add(label);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String data = "";
        if (list1.getSelectedIndex() != -1){
            data = "Linguagem de programação escolhida: " + 
                    list1.getSelectedValue();
            label.setText(data);
        }
        if (list2.getSelectedIndex() != -1){
            data += " FrameWork selecionado: ";
            for (Object frame :list2.getSelectedValuesList()){
                data += frame + " ";
            }
        }
        label.setText(data);
    }
    
}
