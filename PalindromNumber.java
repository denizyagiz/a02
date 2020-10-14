 // Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: Jgrasp


import java.util.Scanner;

public class PalindromNumber {

   public static void main(String[] args) {
   
      int number = 0;
   
      Scanner input = new Scanner (System.in);
   
      System.out.print("Enter a 5-digit number: ");
      number = input.nextInt();
   
      if (number < 99999 && number > 10000) {
      
         int fiveDigits = 0, reverse = 0;
         int temp = number;
      
         while (temp > 0) {
            fiveDigits = temp % 10;
            reverse = (reverse * 10) + fiveDigits;
            temp = temp/10;
         } 
      
         if (number == reverse) {
            System.out.println("Input value: "+ number );
            System.out.println("Judgment:    Palindrome");
         } else{
            System.out.println("Input value: "+ number );
            System.out.println("Judgment:    Not Palindrome");
         }
      }
      else{
         System.out.println("Input value: "+ number );
         System.out.println("Judgment:    Invalid input, must be 5 digits number");
      }
   
   
   }

}