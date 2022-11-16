package chapterTwo;

import java.util.Scanner;
public class ArithmeticTwo{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number:");
      int digit1 = input.nextInt();

   System.out.print("Enter number:");
      int digit2 = input.nextInt();

   int sum = digit1 + digit2;
   int product = digit1 * digit2;
   int difference = digit1 - digit2;
   int division = digit1 / digit2;
   int remainder = digit1 % digit2;

System.out.printf("The sum is %d%nThe product is %d%nThe difference is %d%nThe  division is %d%nThe remainder is %d%n", sum, product, difference, division, remainder);

 }
   }