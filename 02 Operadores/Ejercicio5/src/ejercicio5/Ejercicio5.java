package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float part, primerParcial, segundoParcial, examFinal, promedioFinal;
        
        System.out.println("Nota de Participacion: ");
        part = entrada.nextFloat();
        
        System.out.print("Nota de Primer Parcial: ");
        primerParcial = entrada.nextFloat();
        
        System.out.print("Nota del segundo parcial: ");
        segundoParcial = entrada.nextFloat();
        
        System.out.print("Nota del Examen Final: ");
        examFinal = entrada.nextFloat();
        
        promedioFinal = (part * 0.10f) + (primerParcial * 0.25f) + (segundoParcial * 0.25f)
                + (examFinal * 0.4f);
        
        System.out.println("Promedio FInal: " + promedioFinal);
    }
    
}
