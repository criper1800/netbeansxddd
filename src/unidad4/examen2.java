
package unidad4;

import java.util.Scanner;


public class examen2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double hora, total; 
        System.out.println("cuantas horas");
        hora = leer.nextDouble();
       
        
total = 0;
         if (hora<=2){
         total=hora*15;
             System.out.println("xd "+total);
         }else if (hora<=5){
          total = 2*15 + (hora - 2)*13;
             System.out.println("xd "+total);
         }else if (hora<=10){
              total = 2*15 + 3*13 + (hora - 5)*8;
             System.out.println(" xd "+total);
         } else if(hora>=10){
         total = 2*15 + 3*13 + 5*8 + (hora - 10)*5;
             System.out.println("xd "+total);}   







    }
        
        
        
    
  
}
