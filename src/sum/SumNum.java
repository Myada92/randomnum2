package sum;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		

	System.out.println(sumNum(5));
	}

	
	public static int sumNum(int k) {
		//10+9+8....+1
		int result = 0;
		for(int i =k; i>=1 ;i--) {
			result= result+i;
			System.out.println(i);
		}
		return result ;
	}
	
}

