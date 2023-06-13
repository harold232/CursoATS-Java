package introduccion;

import java.util.Scanner;

public class Introduccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char letra;
        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(1);
        
        System.out.println("La cadena es: " + letra);
    }

}
