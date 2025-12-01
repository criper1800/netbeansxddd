
package unidad3;

import java.util.Scanner;


public class waos {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       int balas = 1;
       String posenemigo = "media"; //media, lejos
       String ener = "alta";
       int salud = 51;
       boolean p, q, r, s, respuesta;
       
       //tiene balas xd
     p = balas >= 1;
      q= !posenemigo.equals("cerca");
     r= ener.equals("alta")||ener.equals("media");
      s= salud>=50;
      respuesta = p && q && r && s;
        System.out.println("puedes atacar? "+respuesta);
        
        
        
    }
 
}
