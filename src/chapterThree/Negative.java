package chapterThree;

import java.util.Scanner;
 public class Negative{
 public static void main(String[] arg){
    Scanner input = new Scanner(System.in);

     System.out.println("Enter digit:");
      int digit = input.nextInt();
   
     System.out.println("Enter digit:");
        int digit2 = input.nextInt();

     System.out.println("Enter digit:");
        int digit3 = input.nextInt();   
      	  
     System.out.println("Enter digit:");
        int digit4 = input.nextInt();

     System.out.println("Enter digit:");
        int digit5 = input.nextInt();

            int negcount = 0;
            int poscount = 0;
            int zerocount = 0;
   
       System.out.printf("%d %d %d %d %d%n", digit, digit2, digit3, digit4, digit5);
	 
	if (digit < 0)
	 negcount = negcount + 1;
	if (digit > 0)
	 poscount = poscount + 1;
	if (digit == 0)
	 zerocount = zerocount +1;
	
	if (digit2 < 0)
	 negcount = negcount + 1;
	if (digit2 > 0)
	 poscount = poscount + 1;
	if (digit2 == 0)
	 zerocount = zerocount +1;

	if (digit3 < 0)
	 negcount = negcount + 1;
	if (digit3 > 0)
	 poscount = poscount + 1;
	if (digit3 == 0)
	 zerocount = zerocount +1;


        if (digit4 < 0)
	 negcount = negcount + 1;
	if (digit4 > 0)
	 poscount = poscount + 1;
	if (digit4 == 0)
	 zerocount = zerocount +1;

	if (digit5 < 0)
	 negcount = negcount + 1;
	if (digit5 > 0)
	 poscount = poscount + 1;
	if (digit5 == 0)
	 zerocount = zerocount +1;

System.out.printf("The number of negative number is %d%nThe number of positive number is %d%nThe number of negtive number is %d%n", negcount, poscount, zerocount);

	
          
  }

    }