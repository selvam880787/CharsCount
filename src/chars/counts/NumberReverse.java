package chars.counts;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to reverse :");
		int n=s.nextInt();
		System.out.println("Entered Number  : " + n);
		int reversed=0;
	while(n!=0) {
		int remainder = n%10;
		reversed=(reversed*10)+remainder;
		n=n/10;
	}
	System.out.println("Reversed Number : "+reversed);
	}
}
