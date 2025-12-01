
package unidad3;

import java.util.Scanner;


public class Practica1 {
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("dame un numero");
        num1 = leer.nextInt();
         System.out.println("dame un numero");
        num2 = leer.nextInt();
        resultado= num1+num2;
        System.out.println("resultado = "+resultado);
    }

   
}
