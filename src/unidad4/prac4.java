
package unidad4;

import java.util.Scanner;


public class prac4 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double a, b, c ;
        System.out.println("precio");
        a= leer.nextDouble();
        if (a>=2500){
        b= a*0.15;
        c=a-b;
        }else{
        b= a*0.08;
        c=a-b;}
        System.out.println("precio final: "+c);
       
       
       
    }
 
}
