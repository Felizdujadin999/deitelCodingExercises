package chapterTwo;

import java.util.Scanner;
 public class AverageAcceleration{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
 
       System.out.print("Enter v0(initial velocity):");
       double v0 = input.nextDouble();

       System.out.print("Enter v1(initial velocity):");
        double v1 = input.nextDouble();

       System.out.print("Enter t(time in seconds):");
         double t = input.nextDouble();

        double acceleration = ((v1 - v0) / t);
    
             System.out.printf("The average acceleration is %s", acceleration);

}

  
  }