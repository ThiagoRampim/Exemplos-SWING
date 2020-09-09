package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class ExCheckBoxMenuItem {
    
    ExCheckBoxMenuItem(){
        JFrame f = new JFrame("Exemplo JCheckBoxMenuItem");
        JMenuBar barraMenu = new JMenuBar();
        JMenu arquivo = new JMenu("Arquivo");
        barraMenu.add(arquivo);
        arquivo.setMnemonic(KeyEvent.VK_F);
        JMenuItem i1 = new JMenuItem("Abrir", KeyEvent.VK_N);
        JMenuItem i2 = new JMenuItem("Salvar Como");
        arquivo.add(i1);
        arquivo.addSeparator();
        arquivo.add(i2);
        JCheckBoxMenuItem cbmi = new JCheckBoxMenuItem("Clique aqui");
        cbmi.setMnemonic(KeyEvent.VK_C);
        arquivo.add(cbmi);
        f.setJMenuBar(barraMenu);
        cbmi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                AbstractButton aButton = (AbstractButton) ae.getSource();
                boolean selecionado = aButton.getModel().isSelected();
                String novo;
                Icon novoIcone;
                if (selecionado){
                    novo = "Valor 1";
                }else{
                    novo = "Valor 2";
                }
                aButton.setText(novo);
            }
        });
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
