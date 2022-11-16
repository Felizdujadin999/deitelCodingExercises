package chapterThree;

import java.util.Scanner;
 public class NumberOfYears{
 public static void main(String[] args){

   Scanner input = new Scanner(System.in);
 
   System.out.print("Enter the number of minutes:");
      int number = input.nextInt();

     long years = (long) (number /(60*24*365));
     long days =  (long) (number / 60 / 24) % 365;

     System.out.printf("%d minutes is approximately %d years and %d days", number, years, days);     
}

   }