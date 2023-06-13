package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int salario = 100;
        int cantidadCarros;
        float salarioTotal, precioCarro;
        
        System.out.print("Ingrese la cantidad de carros vendidos: ");
        cantidadCarros = entrada.nextInt();
        
        System.out.print("Ingrese el precio de los carros: ");
        precioCarro = entrada.nextInt();
        
        salarioTotal = salario + (cantidadCarros * 150) + (0.05f * precioCarro * cantidadCarros);
        System.out.println("Salario Total: " + salarioTotal);
    }
    
}
