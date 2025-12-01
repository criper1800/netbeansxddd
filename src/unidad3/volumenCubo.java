
package unidad3;

import java.util.Scanner;




public class volumenCubo {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      double a, resul;
        System.out.println("dame un lado del cubo");
        a= leer.nextDouble();
        resul=a*a*a;
        System.out.println("volumen: "+resul);
        
    }
   
}
