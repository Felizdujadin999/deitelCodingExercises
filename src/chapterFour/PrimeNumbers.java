package chapterFour;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int userInput = input.nextInt();
        int count = 2;
        while (count <= userInput){
            if (userInput%count != 0){
                System.out.println(userInput + " is a prime number");
            }
            else
                System.out.println(userInput + " is not a prime number");
            break;
        }
        System.out.println("Thanks for using my small app");
    }
}
