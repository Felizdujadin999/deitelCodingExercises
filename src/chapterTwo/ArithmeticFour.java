package chapterTwo;

import java.util.Scanner;
public class ArithmeticFour{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number:");
      int digit1 = input.nextInt();

   System.out.print("Enter number:");
      int digit2 = input.nextInt();

      int REM1 = digit1 % 6;
      int REM2 = digit2 % 6;

   if (digit1 > digit2){
	System.out.printf("%d is bigger number", digit1);
}
      if (digit2 > digit1){
	System.out.printf("%d is bigger number", digit2);
}
      if (digit1 == digit2){
	System.out.printf("0");
}
  
      if (REM1 == REM2 & digit1 < digit2){
        System.out.printf("The smaller number is %d%n", digit1);
}      
      if (REM1 == REM2 & digit2 < digit1){
	System.out.printf("The smaller number is %d", digit2);
}
 }
   }