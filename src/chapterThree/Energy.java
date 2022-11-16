package chapterThree;

import java.util.Scanner;
  public class Energy{
   public static void main(String[] args){
     
      Scanner input = new Scanner(System.in);

      System.out.print("Enter amount of water (in kilogram):");
           double kilogram = input.nextDouble();

      System.out.print("Enter initial temperature(in degree celsius):");
           double initialTemperature = input.nextDouble();

      System.out.print("Enter final temperature(in degree celsius):");
           double finalTemperature = input.nextDouble();


       double energy = (kilogram * (finalTemperature - initialTemperature) * 4187);

         System.out.printf("the energy needed is %.3f", energy);
}

   }