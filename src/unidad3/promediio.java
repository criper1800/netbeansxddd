
package unidad3;

import java.util.Scanner;
public class promediio {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double a, b, c, resul;
        System.out.println("dame el primero");
        a= leer.nextDouble();
        System.out.println("dame el segundo");
        b= leer.nextDouble();
        System.out.println("dame el tercero");
        c= leer.nextDouble();
        resul= (a*b*c)/3;
        System.out.println("promedio: "+resul);
    }
   
}
