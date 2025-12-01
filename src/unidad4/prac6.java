
package unidad4;
//pinches uvas xd
import java.util.Scanner;

public class prac6 {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);    
    String tam, tipo;
    double precio, total, kilos;
    precio= 140;
       System.out.println("tipo de uva (a o b)");
      tipo= leer.next();
       System.out.println("tamaño de uva (1 o 2)");
       tam = leer.next();
       System.out.println("cuantos kilos");
       kilos= leer.nextDouble();
       if (tipo.equals("a")) {
           if (tam.equals("1")) {
             precio = precio +0.20f;  
           } else {
               precio = precio +0.30f;
           }
  
       } else {
       }if (tam.equals("1")) {
          precio = precio -0.30f;  
       } else {
            precio = precio -0.50f;
       }
       
       
       
       
    }  
}
