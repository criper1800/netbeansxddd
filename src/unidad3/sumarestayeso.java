
package unidad3;

import java.util.Scanner;

public class sumarestayeso {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int a, b, sum, res, mul, div;
        System.out.println("dame un mumero");
        a= leer.nextInt();
        System.out.println("dame otro munero");
        b= leer.nextInt();
        sum= a+b;
        System.out.println("suma: "+sum);
        res= a-b;
        System.out.println("resta: "+res);
        mul= a*b;
        System.out.println("multiplicacion: "+mul);
        div=a/b;
        System.out.println("divicion: "+div);
    }
    
}
