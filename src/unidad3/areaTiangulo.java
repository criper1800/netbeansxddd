
package unidad3;

import java.util.Scanner;
public class areaTiangulo {
     public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     double base, altura, resul;
         System.out.println("dame la base");
         base = leer.nextDouble();
         System.out.println("dame la altura");
         altura = leer.nextDouble();
         resul=(base*altura)/2;
         System.out.println("tu area es: "+resul);
     }
}
