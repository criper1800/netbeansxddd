
package unidad3;

import java.util.Scanner;


public class examen {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
       double prime, seg, c, d;
     System.out.println("precio del boleto de primera");
     prime =leer.nextDouble();
     seg= prime-(prime*0.30);
        System.out.println("costo del boleto de segunda: "+seg);
        c= prime+prime+seg+seg+seg;
        System.out.println("El costo de todo es: "+c);
        
        
        
      
    }
    
    
    
}
