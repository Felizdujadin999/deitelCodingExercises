package chapterTwo;

import java.util.Scanner;
  public class Name{
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name:");
          String name = scanner.nextLine();
           System.out.print("How old are you?:");
             int age = scanner.nextInt();
          System.out.printf("Welcome %s, you are %s years old", "Nice to see you.", name, age);

}

  }