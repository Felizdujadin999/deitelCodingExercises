package chapterThree;

import java.util.Scanner;
   public class Kilogram{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number(in pounds):");
     double number = input.nextDouble();

       double kilogram = number * 0.454;

       System.out.printf("%.2f pounds is %.3f in kilograms", number, kilogram);
}

   } 