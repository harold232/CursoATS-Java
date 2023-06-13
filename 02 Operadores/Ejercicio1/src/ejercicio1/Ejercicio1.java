package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double calificacion1, calificacion2, calificacion3;
        
        System.out.println("Ingrese tres calificaciones: ");
        System.out.print("Nota 1: ");
        calificacion1 = entrada.nextDouble();
        
        System.out.print("Nota 2: ");
        calificacion2 = entrada.nextDouble();
        
        System.out.print("Nota 3: ");
        calificacion3 = entrada.nextDouble();
        
        System.out.println("La suma es: " + (calificacion1 + calificacion2 + calificacion3));
    }
    
}
