package chars.counts;
import java.util.Scanner;
public class OddOrEven{
public static void main(String[] args){
// Given number is odd or even ? 
System.out.println("Enter the Number");
//int number = 50;
Scanner s = new Scanner(System.in);
int number = s.nextInt();

if(number%2!=0){
System.out.println("Given Number is odd !");
}
else{
	System.out.println("Given Number is even !");
}

}

}