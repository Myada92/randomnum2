package generateNumbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String args[]) {
		Random random = new Random();
		int counter = 10;
		int[] numbers = new int[counter];

		int min = 5;
		
		for (int i=0;i<counter;i++) {
			numbers[i]=random.nextInt(10);
			System.out.println(numbers[i]);
			min = Math.min(min, numbers[i]); //Returns the smaller of two int values
		}
		
//		Arrays.sort(numbers);//time sorting .. n =500 , n^2
		
		Scanner ui = new Scanner(System.in);
		System.out.println("Please provide the Nth number: ");

		int ni = ui.nextInt();
		
		int n = numbers[ni];
		if(n==min)
			System.out.println("correct");
		else
			System.out.println("incorrect the Nth smallest number is = "+ min);
		}

}
