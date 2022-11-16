package chapterFour;

import java.util.Scanner;

public class Terminate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddNumber = 0;
        int evenNumber = 0;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("Enter Number or any negative number to quit:");
        int userInput = input.nextInt();

        while (userInput > 0){
            if (userInput%2 == 0){
                sumEven += userInput;
                evenNumber += 1;
            }else {oddNumber += 1;
                sumOdd += userInput;
            }
            System.out.println("Enter Number or any negative number to quit:");
            userInput = input.nextInt();
        }

        System.out.println("number of even number is " + evenNumber);
        System.out.println("number of odd number is " + oddNumber);
        System.out.println("sum of even number is " + sumEven);
        System.out.println("sum of even number is " + sumOdd);
    }
}
