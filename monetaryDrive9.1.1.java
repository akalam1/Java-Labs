package question1;

import java.util.*;
public class MonetaryDriver {
	public static void main(String[] args) {
		Random k= new Random();
		
		int[]value= {1,2,3,4,5,6,7,8};
		
		
		int yolo,ak,j;
		
		MonetaryCoins[] coins= new MonetaryCoins[10];
		for (ak=0; ak<coins.length; ak++) {
			
			yolo= Math.abs(k.nextInt())% value.length;
			coins[ak] = new MonetaryCoins (value[yolo]);
			
		}
			System.out.println("before they are  " + "sorted:");
			
			for (ak=0; ak<coins.length;ak++)
				
				System.out.println("\t" + coins[ak]);
			System.out.println("\nAfter they " + "are sorted:");
			
			for (j=0; j<coins.length;j++)
				System.out.println("\t" + coins [j]);
			System.out.println("\n" + coins[0] + " Before flipping, it is: " + coins[0].getValue());
			
			
			
			System.out.println("After flipping, it is: " + coins[0].flip());
			
			
			
	}
			
		
		
}



