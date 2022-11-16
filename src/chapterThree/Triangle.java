package chapterThree;

import java.util.Scanner;
  public class Triangle{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

       System.out.print("Enter x1:");
       double a1 = input.nextDouble();

       System.out.print("Enter y1:");
       double b1 = input.nextDouble();
  
       System.out.print("Enter x2:");	       
       double a2 = input.nextDouble();

       System.out.print("Enter y2:");
       double b2 = input.nextDouble();
  
       System.out.print("Enter x3:");
       double a3 = input.nextDouble();

       System.out.print("Enter y3:");
       double b3 = input.nextDouble();

        double area = 0.5 * (a1*(b2 - b3) + (a2 * (b3 - b1)) + (a3 * (b1 - b2)));

	if (area < 0){ 

         System.out.printf("The area of the triangle is %.3f", area *(-1));
  }
	if (area >= 0)
         System.out.printf("The area of the triangle is %.2f", area);

      }

    }