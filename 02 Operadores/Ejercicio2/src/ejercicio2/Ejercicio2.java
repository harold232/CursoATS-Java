package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salarioTotal, horas, salarioHora;
        
        System.out.print("Ingrese sus horas semanales: ");
        horas = entrada.nextFloat();
        
        System.out.print("Ingrese su salario por hora: ");
        salarioHora = entrada.nextFloat();
        
        salarioTotal = horas * salarioHora;
        
        System.out.println("Salario Total del empleado " + salarioTotal);
    }
    
}
