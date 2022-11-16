package chapterThree;

import java.util.Scanner;
   public class Feet {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

    System.out.print("Enter number(in feet):");
       double number = input.nextDouble();

   double meters = number * 0.305;

    System.out.printf("%.3f feet is %.3f in meters", number, meters);

}

   }