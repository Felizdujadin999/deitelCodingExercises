package chapterTwo;

import java.util.Scanner;
public class ArithmeticThree{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number:");
      int digit1 = input.nextInt();

   System.out.print("Enter number:");
      int digit2 = input.nextInt();
   
   System.out.print("Enter number:");
      int digit3 = input.nextInt();

   int average = (digit1 + digit2 + digit3) / 3;

System.out.printf("The average is %d%n", average);

 }
   }