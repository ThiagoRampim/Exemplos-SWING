package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class ExPopUpMenu {
    
    ExPopUpMenu(){
        JFrame f = new JFrame("Exemplo JPopUpMenu");
        JPopupMenu popupmenu = new JPopupMenu();
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem colar = new JMenuItem("Colar");
        popupmenu.add(cortar); popupmenu.add(copiar); popupmenu.add(colar);
        JLabel l = new JLabel("Clique na tela");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400, 100);
        f.add(l); f.add(popupmenu);
        f.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                popupmenu.show(f, e.getX(), e.getY());
            }
        });
        cortar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                l.setText("Item corte selecionado");
            }
        });
        copiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                l.setText("Item copiar selecionado");
            }
        });
        colar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                l.setText("Item colar selecionado");
            }
        });
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
