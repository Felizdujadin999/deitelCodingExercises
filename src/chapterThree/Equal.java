package chapterThree;

import java.util.Scanner;
 public class Equal{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number:");
      int digit1 = input.nextInt();

   System.out.print("Enter number:");
      int digit2 = input.nextInt();

   int sum = digit1 + digit2;
   int difference = digit1 - digit2;
   int product = digit1 * digit2;
   int average = (digit1 / digit2) / 2;
   int distance = digit1 - digit2;

System.out.printf("The sum is %d%nThe difference is %d%nThe product is %d%nThe average is %d%nThe distance is%d%n", sum, difference, product, average, distance);

   if (digit1 > digit2){
	System.out.printf("%d is bigger", digit1);
}
      if (digit2 > digit1){
	System.out.printf("%d is bigger", digit2);
}
      if (digit1 < digit2){
	System.out.printf("%d is smaller", digit1);
}
      if (digit2 < digit1){
	System.out.printf("%d is smaller", digit2);
}

 }
   }