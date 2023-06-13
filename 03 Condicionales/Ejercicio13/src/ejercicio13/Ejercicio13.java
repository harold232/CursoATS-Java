package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero Automatico\n"
                + "1. Ingresa dinero a la cuenta\n"
                + "2. Retira dinero a la cuenta\n"
                + "3. Salir"));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar: "));
                saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                if (retiro > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                }
                else {
                    saldoActual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                        
        }
    }

}
