
package unidad4;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in); 
      double a, b, c, prom;
        System.out.println("calificacion 1");
        a= leer.nextDouble();
        System.out.println("calificacion 2");
        b= leer.nextDouble();
        System.out.println("calificacion 3");
        c= leer.nextDouble();
        prom=(a+b+c)/3;
        if (prom>=70){
            System.out.println("APROBAO");}
        else {
            System.out.println("ECHALE GANAS WUE: "+prom);
       
      
    }
   
}}
