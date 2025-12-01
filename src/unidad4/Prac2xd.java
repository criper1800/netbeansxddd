
package unidad4;

import java.util.Scanner;

public class Prac2xd {
    public static void main(String[] args) {
  Scanner leer= new Scanner(System.in);
  double a;
        System.out.println("dame un mumero");
        a = leer.nextDouble();
        if (a>0){
            System.out.println("positivo");
        }else if (a==0){
            System.out.println("cero");
        }else{
            System.out.println("negativo");
        }
  
    }
   
}
