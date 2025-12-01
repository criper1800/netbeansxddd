
package unidad3;

import java.util.Scanner;


public class exam2 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     double saltotal, sala, hora, salbase, a, b, c, d, e, f;
        System.out.println("dame las horas trabajadas");
        hora = leer.nextDouble();
         System.out.println("dame el pago por hora");
       sala = leer.nextDouble();
       salbase = hora*sala;
       a= (salbase*0.18) ;
       b=(salbase*0.10);
       c=(salbase*0.12);
       d=(salbase*0.02);
       e=(salbase*0.16);
       f=(salbase*0.05);
       saltotal= salbase+a+b+c-d-e-f;
        System.out.println("salario total: "+saltotal );
       
    }
    
}
