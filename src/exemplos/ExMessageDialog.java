package exemplos;

import javax.swing.*;

public class ExMessageDialog extends JFrame {
    
    JFrame f;
    
    public ExMessageDialog(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Atualização Realizada com sucesso",
                "Aviso",JOptionPane.WARNING_MESSAGE);
    }
    
}
