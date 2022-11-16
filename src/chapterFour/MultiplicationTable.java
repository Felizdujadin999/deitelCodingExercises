package chapterFour;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter any number:");
        int userInput = input.nextInt();
        while (count <= 12) {
            int multiply = userInput * count;
            System.out.printf("%d is %d times %d%n", userInput, count, multiply);
            count += 1;
        }
        System.out.println("Thanks for using my small app");
    }
}
