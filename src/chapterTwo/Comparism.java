package chapterTwo;

import java.util.Scanner;
   public class Comparism {
       public static void main(String[] args) {
          Scanner input = new Scanner(System.in);		
               System.out.println("Enter First Number:");
               int highestNumber = input.nextInt();
               int lowestNumber = highestNumber;
   
               System.out.println("Enter Second Number:");
                int userInput = input.nextInt();
               if (userInput > highestNumber) highestNumber = userInput;
               if (userInput < lowestNumber) lowestNumber = userInput;  
          
               System.out.println("Enter Third Integer:");             
                 userInput = input.nextInt();
               if (userInput > highestNumber) highestNumber = userInput;
               if (userInput < lowestNumber) lowestNumber = userInput;  

               System.out.println("Enter Fourth Integer");
                 userInput = input.nextInt();
               if (userInput > highestNumber) highestNumber = userInput;
               if (userInput < lowestNumber) lowestNumber = userInput;  
   
              System.out.printf("lowest is %d, highest is %d", lowestNumber, highestNumber);
               



  }
 
}