package chars.counts;

import java.util.Scanner;

public class NumbersSwapping {

	public static void main(String[] args) {
		System.out.println("Swapping Numbers with third variable");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nmbers to swap");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Entered numbers :"+"a="+a+" b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped numbers :"+"a="+a+" b="+b+"\n");
	
		System.out.println("Swapping Numbers without third variable ");
		System.out.println("Enter the nmbers to swap");
		int c=s.nextInt();
		int d=s.nextInt();
		System.out.println("Entered numbers :"+"c="+c+" c="+d);
		c=d+(d=c)-c;
		System.out.println("Swapped numbers :"+"c="+c+" d="+d);


	}

}
