package sentenciaif;

import javax.swing.JOptionPane;


public class SentenciaIf {

    public static void main(String[] args) {
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero != dato) {
            JOptionPane.showMessageDialog(null, "El numero es diferente a 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
    }
    
}
