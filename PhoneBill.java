// Class: CS 5000
// Term: Spring 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: Jgrasp
//Scanner is stored in java.util package
import java.util.Scanner;

public class PhoneBill {
//Main method
   public static void main (String[] args)
   {  
   //Create scanner
      Scanner scan = new Scanner(System.in);
      int minutes, accountNum;
      char time;
      char service;
      System.out.println("Please write your account number:");
      accountNum=scan.nextInt();
      System.out.println("Please write your service type:");
      service=scan.next().charAt(0);
     
      
      if(service == 'r') {
         System.out.println("Please write your total minutes:");
         minutes=scan.nextInt();
         double cost = 20.0;
         if(minutes > 50) {
            cost+=(minutes-50)*0.20;
         } 
         System.out.print("Account number:" + accountNum);
         System.out.print("Service type: regular");
         System.out.print("Number of minutes:" + minutes);
         System.out.print("Amount due: $" + cost);
         
      } else if (service == 'p') {
         double baseFee = 10;
         double costDay = 0;
         double costNight = 0;
         System.out.println("How Many Daytime Minutes?");
         int dayMin = scan.nextInt();
         if (dayMin > 75) {
            costDay = costDay + ((dayMin - 75) * 0.1);     
         }
         System.out.println("How Many Nighttime Minutes?");
         int nightMin = scan.nextInt();
         if (nightMin > 100) {
            costNight = costNight + ((nightMin - 100) * 0.05);
         }
         double total = costDay + costNight + baseFee;
         System.out.print("\nAccount Number:\t\t" + accountNum + "\nService Type:\t\t\tPremium" + "\nDaytime Minutes:\t\t" + dayMin + "\nNighttime Minutes:\t" + nightMin + "\nAmount Due:\t\t\t\t" + total);
      }
   }
}

/*System.out.println("Is it daytime or nighttime (d/n)?");
         time=scan.next().charAt(0);
         double baseCost = 10.0;
         if (time == 'd'){
            System.out.println("How many minutes did you use");
            int minutesDay = scan.nextInt();
            if (minutesDay > 75) {
               baseCost = baseCost + ((minutesDay - 75) * 0.10);
            }
            System.out.print("Account number:" + accountNum);
            System.out.print("Service type: premium");
            System.out.print("Number of minutes:" + minutesDay);
            System.out.print("Amount due: $" + baseCost);
         } else if (time == 'n') {
            System.out.println("How many minutes did you use");
            int minutesNight = scan.nextInt();
            if(minutesNight > 100) {
               baseCost = baseCost + ((minutesNight - 75) * 0.05);
            }
            System.out.print("Account number:" + accountNum);
            System.out.print("Service type: premium");
            System.out.print("Number of minutes:" + minutesNight);
            System.out.print("Amount due: $" + baseCost);
         }      */