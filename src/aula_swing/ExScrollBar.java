package aula_swing;

import java.awt.event.*;
import javax.swing.*;

public class ExScrollBar {
    
    ExScrollBar(){
        JFrame f = new JFrame("Barra de rolagem: ");
        
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        final JScrollBar s = new JScrollBar();
        s.setBounds(100, 100, 50, 100);
        s.addAdjustmentListener((AdjustmentEvent ae) -> {
            label.setText("Valor vertical da barra de rolagem: " +
                    s.getValue());
        });
                
        f.add(s); f.add(label);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
