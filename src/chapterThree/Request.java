package chapterThree;

import java.util.Scanner;
public class Request{
public static void main(String[] arg){
    Scanner input = new Scanner(System.in);

   System.out.print("Please, what is your name?:");
      String name = input.nextLine();

System.out.printf("Welcome %s, i´m hungry..........",  name);
}

   }