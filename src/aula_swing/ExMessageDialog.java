package aula_swing;

import javax.swing.*;

class ExMessageDialog extends JFrame {
    
    JFrame f;
    
    ExMessageDialog(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Atualização Realizada com sucesso",
                "Aviso",JOptionPane.WARNING_MESSAGE);
    }
    
}
