
package unidad4;

import java.util.Scanner;


public class wuea5 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);    
    double pe, pr;
        System.out.println("cuantas personas");
        pe = leer.nextDouble();
        if(pe > 200 && pe <= 300){
        pr = pe*85;
        }else if (pe > 300){
        pr = pe*75;
        }else{
        pr = pe *95;
        }
        System.out.println("total banquete: "+pr);
    
    }
 
}
