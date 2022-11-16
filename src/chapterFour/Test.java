package chapterFour;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or enter 0 to quit:");
        int number = input.nextInt();
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        while (number != 0) {
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
          }
            System.out.println("Enter a number or enter 0 to quit:");
            number = input.nextInt();

        }
        System.out.println(smallestNumber);
        System.out.println(largestNumber);
    }

}