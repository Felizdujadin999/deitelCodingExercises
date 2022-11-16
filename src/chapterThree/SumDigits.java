package chapterThree;

import java.util.Scanner;
 public class SumDigits{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter a number between 0 and 1000:");
      int digits = input.nextInt();

    int digit1 = digits / 1000 % 10;
    int digit2 = digits / 100 % 10;
    int digit3 = digits / 10 % 10;
    int digit4 = digits / 1 % 10;
   
    int sum = digit1 + digit2 + digit3 + digit4;

     System.out.printf("The sum of the digits is %d", sum);
}

   }
