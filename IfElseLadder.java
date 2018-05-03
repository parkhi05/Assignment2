
package ifelseladder;
import java.util.Scanner;


public class IfElseLadder {

    
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        a=obj.nextInt();
         System.out.println("Enter the value of B : ");
         b=obj.nextInt();
          System.out.println("Enter the value of C : ");
          c=obj.nextInt();
          if(a>b && a>c)
          {   
           max=a;
           System.out.println("A is the maximum");
    }
          if(b>a && b>c)
          {
              max=b;
              System.out.println("B is maximum");
          }
          if(c>a && c>b)
          {
              max=c;
              System.out.println("C is maximum");
          } 
    
}
}
