package chapterTwo;

import java.util.Scanner;
public class ArithmeticSix{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number:");
      int side = input.nextInt();
      double pi = (Math.PI / 6);
      double area = (6 * side * side) / (4 * Math.tan (pi));

	System.out.printf("Area of the hexagon is %.3f", area);
}
  }