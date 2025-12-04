
package unidad4;

import java.util.Scanner;


public class examen {
    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
     String act ;
     double peso, l;
        System.out.println("igresa tu peso");
        peso = leer.nextDouble();
        System.out.println("igresa tu actividad fisica (poca, moderada o intensa)");
        act = leer.next();
        if (peso<50 && act.equals("poca")){
            l=1.5*7;
            System.out.println("tu consumo de agua es 1.5L al dia y semanal "+l);
        }else if(peso<50 && act.equals("moderada")){
             l=2*7;
        System.out.println("tu consumo de agua es 2L al dia y semanal"+l);
        }else if(peso<50 && act.equals("intensa")){
             l=2.5*7;
        System.out.println("tu consumo de agua es 2.5L al dia y semanal"+l);
        }else if (peso>50 && peso<70 && act.equals("poca")){
             l=2*7;
            System.out.println("tu consumo de agua diario es 2L y semanal "+l);
        }else if (peso>50 && peso<70 && act.equals("moderada")){
             l=2.5*7;
            System.out.println("tu consumo de agua diario es 2.5L y semanal "+l);
        }else if (peso>50 && peso<70 && act.equals("intensa")){
             l=3*7;
            System.out.println("tu consumo de agua diario es 3L  y semanal"+l);
        }else if(peso>70 && act.equals("poca")){
             l=2.5*7;
            System.out.println("tu consumo de agua diario es 2.5 y semanal "+l);
        }else if(peso>70 && act.equals("moderada")){
             l=3*7;
            System.out.println("tu consumo de agua diario es 3 y semanal "+l);
        }else if(peso>70 && act.equals("intensa")){
             l=3.5*7;
            System.out.println("tu consumo de agua diario es 3.5 y semanal "+l);
        }
     
     
     
     
    }
    
}
