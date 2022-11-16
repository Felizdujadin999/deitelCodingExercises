package chapterFour;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double largestNumber = Double.NEGATIVE_INFINITY;
        double smallestNumber = Double.POSITIVE_INFINITY;
        int yes = 1;
        int Submit = 2;
        while (true) {
            System.out.println("Enter a number sir/ma:");
            int userInput = input.nextInt();
            if (userInput > largestNumber){
                largestNumber = userInput;
            }
            if (userInput < smallestNumber){
                smallestNumber = userInput;
            }
            System.out.println("Would you like to enter another number sir/ma?:" + yes + " yes " + Submit + " Submit ");
            int userInput2 = input.nextInt();
            if (userInput2 == Submit){
                System.out.println(largestNumber);
                System.out.println(smallestNumber);
                break;
            } while (userInput2 != yes && userInput2 != Submit) {
                System.out.println("You entered a wrong number, so pick again......");
                System.out.println("Would you like to enter another number sir/ma?:" + yes + " yes " + Submit + " Submit ");
                break;
            }
        }

    }
}
