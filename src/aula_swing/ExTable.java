package aula_swing;

import javax.swing.*;

public class ExTable extends JFrame {
    
    JTable t;
    
    ExTable(){
        String dados[][] = {{"101", "Bruno", "670000"},
                            {"102", "Carlos", "780000"},
                            {"101", "Antonio", "700000"}};
        String colunas[] = {"ID", "NOME", "SALÁRIO"};
        t = new JTable(dados, colunas);
        t.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(t);
        
        add(sp); add(t);
        setLayout(null);
        setSize(350, 350);
        setVisible(true);
    }
    
}
