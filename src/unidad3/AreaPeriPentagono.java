
package unidad3;

import java.util.Scanner;


public class AreaPeriPentagono {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      double area, peri, a, b;
        System.out.println("dame un lado del pentagono ");
        a= leer.nextDouble();
        System.out.println("dame el apotema");
        b= leer.nextDouble();
        peri=a*5;
        System.out.println("perimetro: "+peri);
        area= (peri*b)/2;
        System.out.println("area: "+area);
    }
}
