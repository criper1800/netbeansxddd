
package unidad4;

import java.util.Scanner;


public class prac3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in) ;
    double a, b;
        System.out.println("lapices");
        a = leer.nextDouble();
        
        if (a>=1000){
            b=a*0.85;
            System.out.println("costo "+b);
         }else{
            b=a*0.90;
      System.out.println("costo "+b);
        }
        
    
    }
  
}
