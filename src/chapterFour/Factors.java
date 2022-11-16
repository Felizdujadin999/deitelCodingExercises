package chapterFour;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int counter = 0;
        System.out.println("Enter any number:");
        int userInput = input.nextInt();
        while (count <= userInput) {
            if (userInput % count == 0){
                counter += 1;}
            count += 1;
        }
        System.out.println(counter + " Factors");
        System.out.println("Thanks for using my small app.");
    }
}
