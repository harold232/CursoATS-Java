package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero < 10) {
            JOptionPane.showMessageDialog(null, "El numero tiene una cifra");
        }
        else if (numero < 100) {
            JOptionPane.showMessageDialog(null, "El numero tiene dos cidras");
        }
    }

}
