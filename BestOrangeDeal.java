 // Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: Jgrasp
//Scanner is stored in java.util package
import java.util.Scanner;

public class BestOrangeDeal {
//Main method
   public static void main (String[] args)
   {  
   
      Scanner sc = new Scanner(System.in);
   
      System.out.println(" Enter the small box weight: ");
   
      double smallWt = sc.nextDouble();
   
      System.out.println("Enter the small box price: ");
   
      double smallP = sc.nextDouble();
   
      System.out.println("Enter the large box weight: ");
   
      double largeWt = sc.nextDouble();
   
      System.out.println("Enter the large box price: ");
   
      double largeP = sc.nextDouble();
   
      double smallPr = smallP / smallWt;
   
      double largePr = largeP / largeWt;
   
      if(smallPr>largePr){
         System.out.println("Small box weight:\t"+ smallWt );
         System.out.println("Small box price:\t"+ smallP);
         System.out.println("Large box weight:\t"+ largeWt);
         System.out.println("Large box prices:\t"+ largeP );
         System.out.println("The large box is a better deal");
      
      }
      else if(smallPr<largePr){
         System.out.println("Small box weight:\t"+ smallWt );
         System.out.println("Small box price:\t"+ smallP);
         System.out.println("Large box weight:\t"+ largeWt);
         System.out.println("Large box prices:\t"+ largeP );
         System.out.println("The smaller box is a better deal");
      
      }
      
      else{
         System.out.println("Small box weight:\t"+ smallWt );
         System.out.println("Small box price:\t"+ smallP);
         System.out.println("Large box weight:\t"+ largeWt);
         System.out.println("Large box prices:\t"+ largeP );
         System.out.println("Both boxes are of the same value");
      
      }
   
   }

}