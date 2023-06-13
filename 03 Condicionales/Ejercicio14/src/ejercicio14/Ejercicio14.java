package ejercicio14;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {
        int opcion;
        float medida;

        medida = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de kilogramos: "));

        opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                + "1. Hectogramos\n"
                + "2. Decagramos\n"
                + "3. Gramos\n"
                + "4. Decigramos\n"
                + "5. Centigramos\n"
                + "6. Miligramos\n"));
        
        switch (opcion) {
            case 1:
                medida *= 10;
                JOptionPane.showMessageDialog(null, "Medida en hectogramos: " + medida);
                break;
            case 2:
                medida *= 100;
                JOptionPane.showMessageDialog(null, "Medida en decagramos: " + medida);
                break;
            case 3:
                medida *= 1000;
                JOptionPane.showMessageDialog(null, "Medida en gramos: " + medida);
                break;
            case 4:
                medida *= 10000;
                JOptionPane.showMessageDialog(null, "Medida en Decigramos: " + medida);
                break;
            case 5:
                medida *= 100000;
                JOptionPane.showMessageDialog(null, "Medida en miligramos: " + medida);
                break;
            case 6:
                medida *= 1000000;
                JOptionPane.showMessageDialog(null, "Medida en miligramos: " + medida);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
                break;
                        
        }
    }

}
