
package ifelse1;
import java.util.Scanner;                                      //Nested If/Else


public class IfElse1 {

    
    public static void main(String[] args) {
       int x,y,z,max;
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the First number :");
       x=obj.nextInt();
       System.out.println("Enter the Second number :");
        y=obj.nextInt();
       System.out.println("Enter the third number :");
       z=obj.nextInt();
       if(x>y)
       {
           if(x>z)
           {
               max=x;
               System.out.println("Max no. is : "+max);
           }
       }
       else
       {
           System.out.println("x is smaller");
       }
       if(y>x)
       {
           if(y>z)
           {
               max=y;
               System.out.println("Max no. is : "+max);
               
           }
       }
       else
           {
           System.out.println("Y is smaller");
       }
       
       if(z>x)
       {
           if(z>y)
           {
               max=z;
               System.out.println("Max no. is : "+max);
               
           }
       }
       else
           {
           System.out.println("Z is smaller");
       }
    }
}
      
       
       
       
       
       
       
       
       /* if(x>y)
        {
            max=x;
            System.out.println("Biggest number is : "+max);
        }else
        {
            System.out.println("Y is bigger");
            
        }-----------------------------------------------------------
       */
       /*if(x>y)
       {
          max=x;
          System.out.println("Biggest number is : "+max); 
       }
       else
           System.out.println("Biggest number is Y");
       
       if(x>z)
           {
          max=x;
          System.out.println("Biggest number is : "+max); 
       }
       else
           System.out.println("Biggest number is Z");
       
        if(y>x)
           {
          max=y;
          System.out.println("Biggest number is : "+max); 
       }
       else
           System.out.println("Biggest number is X");
        
         if(y>z)
           {
          max=y;
          System.out.println("Biggest number is : "+max); 
       }
       else
           System.out.println("Biggest number is Z");
         
          if(z>x)
           {
          max=z;
          System.out.println("Biggest number is : "+max); 
       }
       else
           System.out.println("Biggest number is X");
          
           if(z>y)
           {
          max=z;
          System.out.println("Biggest number is : "+max); 
       }
       else
           System.out.println("Biggest number is Y");
       */--------------------------------------------------------
               
   




           
       
       
       
       
        
        
        
        /*{
                System.out.println("X is smaller");
                }
        if(x>z)
        {
            max=x;
            System.out.println("Biggest number is : "+max);
        }
            
        if (y>x);
        {
            max=y;
            System.out.println("Biggest number is : "+max);
        }
          if(y>z);
          {
               max=y;
            System.out.println("Biggest number is : "+max);
          }
          
        if (z>x);
        {
            max=z;
            System.out.println("Biggest number is : "+max); 
            
        }
        if(z>y);
        {
             max=z;
            System.out.println("Biggest number is : "+max);
        } */
          
          
          
  
