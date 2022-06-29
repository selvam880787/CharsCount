package chars.counts;
import java.util.Scanner;
public class DigitCounts{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int number = s.nextInt();
int count=0;
while(number>0){
	count++;
	number = number/10;
	}
	System.out.println("Digits in the number is :"+count);
}
}