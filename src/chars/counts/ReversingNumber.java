package chars.counts;
import java.util.Scanner;
public class ReversingNumber{
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number to Reverse");
	int number = s.nextInt();
	int remainder = 0;
	int quotient = 0;
	int result = 0;
	while (number>0){
		remainder = number % 10;
		quotient = number / 10;
		number = quotient;
		result = (result*10)+remainder;
	}
	System.out.println("Reversed Number is : "+result);
}
}