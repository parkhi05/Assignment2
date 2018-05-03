
package pkgswitch;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        int choice1,choice2,choice3,choice4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Course");
        System.out.println("ME");
        System.out.println("CSE");
        System.out.println("IT");
                
        System.out.println("Enter your choice from the above options : ");
        choice1=sc.nextInt();
        switch(choice1)
       {
            case 1 :
                System.out.println(" Locations for ME :");
                System.out.println("Delhi");
                System.out.println("Mumbai");
                System.out.println("Kolkata");
                System.out.println("FEES Info : ");
                System.out.println("Enter the choice from ablove options : ");
                choice2=sc.nextInt();
                switch(choice2)
                {
                    case 1 :
                        System.out.println("Fees = 3200");
                        break;
                    case 2 :
                        System.out.println("Fees = 5433");
                        break;
                    case 3 :
                        System.out.println("Fees = 9333");
                        break;
                        
                }
        }
        switch(choice1)
        {
         case 2 : 
            
                System.out.println("Locations for CSE :  :");
                System.out.println("Gurgaon");
                System.out.println("Chennai");
                System.out.println("Pune");
                System.out.println("FEES Info ");
                System.out.println("Enter the choice from ablove options : ");
                choice3=sc.nextInt();
                switch(choice3)
                {
                    case 1 : 
                        System.out.println("Fees = 13200");
                        break;
                    case 2 :
                        System.out.println("Fees = 15433");
                        break;
                    case 3 :
                        System.out.println("Fees = 19333");
                        
                        
                }
               
        }
                switch(choice1)
                {
               case 3 :
            
               System.out.println(" locations for IT");
               System.out.println("Faridabad");
                System.out.println("Bhopal");
                System.out.println("Banglore");
                System.out.println("FEES Info ");
                System.out.println("enter your choice :");
                choice4=sc.nextInt();
                switch(choice4)
                {
                    case 1 :
                        System.out.println("Fees = 3882");
                        break;
                    case 2 :
                        System.out.println("Fees = 53882");
                        break;
                    case 3 :
                        System.out.println("Fees = 33882");
               
                }          
                
    }
        }
    }
        
                
        
    
    

