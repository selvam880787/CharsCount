package chars.counts;
import java.util.Scanner;
public class ArmstrongNumber{
public static void main(String[] args){

Scanner s = new Scanner(System.in);
System.out.println("Enter the Number to check Armstrong or not ");
int number = s.nextInt();
int input = number;
int remainder=0,quotient=0,result=0;
while(input>0){
	remainder = input % 10;
	quotient = input/10;
	result = result+remainder*remainder*remainder;
	input = quotient;
}
if(result==number){
	System.out.println("Entered Number is Armstrong");
}else{
	System.out.println("Entered Number is not Armstrong");
}
}
}