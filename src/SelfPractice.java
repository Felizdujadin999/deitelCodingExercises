import java.util.Scanner;

public class SelfPractice{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int largestNumber = -100;
        int lowestNumber = +100;
        int secondLargest = -100;


        while (count < 5) {
            System.out.println("Enter a number:");
            int userInput = input.nextInt();
            count += 1;

                 if (userInput > largestNumber) {
                     userInput = lowestNumber;
                     secondLargest = largestNumber;
                     largestNumber = userInput;
                 }else {
                     if (userInput < largestNumber && userInput > secondLargest) {
                         secondLargest = userInput;
                     }
                 }
              }
        System.out.printf("The largest number is %d%n",largestNumber );
        System.out.printf("The lowest number is %d%n",lowestNumber );
        System.out.printf("The second largest number is %d%n",secondLargest );

    }
}