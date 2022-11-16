package chapterThree;

import java.util.Scanner;
 public class RunwayLength{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter speed(v):");
           double speed = input.nextDouble();

     System.out.print("Enter acceleration(a):");
           double acceleration = input.nextDouble();

           double length = (speed * speed) / (2 * acceleration);
    
     System.out.printf("The minimum runway length for this airplane is %.3f", length);
            

}

   }