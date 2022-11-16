package chapterTwo;

import java.util.Scanner;
public class Seperation{
 public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
      System.out.println("Enter five digits:");
      int digit = scanner.nextInt();

      int digit1 = digit / 10000 % 10;
      int digit2 = digit / 1000 % 10;
      int digit3 = digit / 100 % 10;
      int digit4 = digit / 10 % 10;
      int digit5 = digit / 1 % 10;

    System.out.printf("%d %d %d %d %d", digit1, digit2, digit3, digit4, digit5);
       

}

  }