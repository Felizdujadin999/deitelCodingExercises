package chapterTwo;

import java.util.Scanner;
public class ArithmeticFive{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.println("Enter numbers between 25 to 75:");
   
   System.out.print("Enter number:");
      int digit1 = input.nextInt();

   System.out.print("Enter number:");
      int digit2 = input.nextInt();
   
      int digit1a = digit1 / 10 % 10;
      int digit1b = digit1 / 1 % 10;

      int digit2a = digit2 / 10 % 10;
      int digit2b = digit2 / 1 % 10;
      

   if (digit1a == digit2a){
	System.out.printf("True, same digit is %d", digit1a);
}
      if (digit1b == digit2b){
	System.out.printf("True, same digit is %d", digit1b);
}
      if (digit1a == digit2b){
	System.out.printf("True, same digit is %d%n", digit1a);
}
      if (digit1b == digit2a){
	System.out.printf("True, same digit is %d", digit1b);
}

 }
   }