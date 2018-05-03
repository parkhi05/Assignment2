/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.util.*;
public class User {

   
    public static void main(String[] args) { 
      
     Scanner obj = new Scanner(System.in);
     int n;
     System.out.println("Enter your age ");
      n=obj.nextInt();
      System.out.println("Your age is : " +n);
      
     long pno;
     System.out.println("Enter your phone number :");
     pno=obj.nextLong();
     System.out.println("Your number is :"+pno);
     
     float pi;
     System.out.println("Enter the value of pi");
     pi=obj.nextFloat();
     System.out.println("pi  :" +pi); 
     
     String name; 
     System.out.println("Enter the name: ");
     name=obj.nextLine();
     System.out.println("Your name is :" + name);    //Reads full line.
     
     char ch;
     System.out.println("Enter the letter");
     ch=obj.next().charAt(1);
     System.out.println("letter is :"+ ch);
     
     
    }
    
}
