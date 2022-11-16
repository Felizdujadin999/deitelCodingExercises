package chapterTwo;

import java.util.Scanner;
 public class BMI{
public static void main(String[] args){
       Scanner input = new Scanner(System.in);

      System.out.print("Enter weight(in Kilogram):");
         double weight = input.nextDouble();

      System.out.print("Enter height(in meters):");
         double height = input.nextDouble();

      double BMI = weight / (height * height);

	if (BMI < 18.5){
      System.out.printf("Your body mass index (BMI) is %.2f, you are underweight", BMI);
}
	if (BMI >= 18.5 & BMI <= 24.9){
      System.out.printf("Your body mass index (BMI) is %.2f, you have a normal weight", BMI);
}
	if (BMI >= 25 & BMI <= 29.9){
      System.out.printf("Your body mass index (BMI) is %.3f, you have an over weight", BMI);
}
	if (BMI >= 30){
      System.out.printf("Your body mass index (BMI) is %.3f, you have obesity", BMI);
}


  }
    }