
package unidad4;

import java.util.Scanner;


public class ejempoExam {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
String nom1, nom2, nom3, nom4;
int edad1, edad2, edad3, edad4, edadm;
        System.out.println("Dame el nombre del 1°");
        nom1 =leer.next();
        System.out.println("dame la edad");
        edad1= leer.nextInt();
         System.out.println("Dame el nombre del 2°");
        nom2 =leer.next();
        System.out.println("dame la edad");
        edad2= leer.nextInt();
         System.out.println("Dame el nombre del 3°");
        nom3 =leer.next();
        System.out.println("dame la edad");
        edad3= leer.nextInt();
         System.out.println("Dame el nombre del 4°");
        nom4 =leer.next();
        System.out.println("dame la edad");
        edad4= leer.nextInt();
        if (edad1>edad2){
            edadm=edad1;
            System.out.println("es mayor "+edadm);
        }else if(edad1==edad2){
            System.out.println(edad1+" son iguales "+edad2);
        }else if(edad1>edad3){
            edadm=edad3;
            System.out.println("1"+edadm);
        }else if (edad1==edad3){
            System.out.println(edad1+"dd"+edad3);
        }else if (edad1>edad4){
            edadm=edad4;
            System.out.println("s"+edadm);
        }else if(edad1==edad4){
            System.out.println(edad1+" c "+edad4);
        }else if(edad2>edad1){
        edadm=edad2;
            System.out.println("mayor "+edadm);
        }else if(edad2==edad1){
            System.out.println(edad2+"igual"+edad1);
        }
        
        




    
    }
 
    
    
    
}
