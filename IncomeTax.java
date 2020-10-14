// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: Jgrasp
//Scanner is stored in java.util package
import java.util.Scanner;

public class IncomeTax {
//Main method
   public static void main (String[] args)
   {  
   //Create scanner
      Scanner scan = new Scanner(System.in);
      double income ;
      System.out.println("Please write your annual income:");
      income=scan.nextDouble();
      double tax ;
      
      
      
      if(income <=30000) {
         tax=income*0.03;
         System.out.println("Your income:\t "+"  " + income);
         System.out.println("Your tax bracket: % 3");
      }
      else if(income >30000 && income <=70000){
         tax=30000*0.03+(income-30000)*0.1;
         System.out.println("Your income:\t "+"  " + income); 
         System.out.println("Your tax bracket: % 10");
      }
      else if(income >70000 && income <=150000){
         System.out.println("Your income:\t "+"  " + income); 
         System.out.println("Your tax bracket: % 15");
         
         tax=30000*0.03+(40000)*0.1+(income-70000)*0.15;
      }
      else if(income >150000 && income <=300000){
         System.out.println("Your income:\t "+"  " + income);
         System.out.println("Your tax bracket: % 20");
         tax=30000*0.03+(40000)*0.1+(80000)*0.15+(income-150000)*0.2;
      }
      else if(income >300000 && income <=900000){ 
         System.out.println("Your income:\t "+"  " + income);
         System.out.println("Your tax bracket: % 35");
         tax=30000*0.03+(40000)*0.1+(80000)*0.15+(150000)*0.2+(income-300000)*0.35;
      }
      else{
         tax=30000*0.03+(40000)*0.1+(80000)*0.15+(150000)*0.2+(600000)*0.35+(income-900000)*0.40;
         System.out.println("Your income:\t "+"  " + income);
         System.out.println("Your tax bracket: % 40");
      }
      System.out.print("Your tax amount: "+ " " + tax);
   }
}

