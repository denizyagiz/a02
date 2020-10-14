// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: Jgrasp
//Scanner is stored in java.util package
 import java.util.Scanner;

public class Circles {
//Main method
   public static void main (String[] args)
   {  
//Create scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Enter x, y coordinates and radius of Circle 1 :");
        double X1 = in.nextDouble();
        double Y1 = in.nextDouble();
        double R1 = in.nextDouble();

        System.out.println("Enter x, y coordinates and radius of Circle 2 :");
        double X2 = in.nextDouble();
        double Y2 = in.nextDouble();
        double R2 = in.nextDouble();

        System.out.println("Circle 1 center  : (" + X1 + "," + Y1 + ")");
        System.out.println("Circle 1 radius :  " + R1);

        System.out.println("Circle 2 center  : (" + X2 + "," + Y2 + ")");
        System.out.println("Circle 2 radius :  " + R2);
        //calculating distance between centers
        double centerDistance = Math.pow((X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2), 0.5);
        
         if (R2 >= R1 && centerDistance <= (R2 - R1)){
            System.out.println("Judgment:  Circle 1 is completely inside circle 2.");
        }
        else if (R1 >= R2 && centerDistance <= (R1 - R2) ) {
            System.out.println("Judgment:  Circle 2 is completely inside circle 1.");
        }
        else if (centerDistance > (R1 + R2)){
            System.out.println("Judgment:  Circle 2 is overlapping with circle 1.");
        }
        else {
            System.out.println("Judgment:  Circle 2 is completely outside circle 1.");}
    }
}