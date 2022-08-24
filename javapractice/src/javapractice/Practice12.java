package javapractice;
import java.util.Scanner;
public class Practice12 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in); 
		 System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		  System.out.print("Input second number: ");
		  int num2 = in.nextInt();
		  System.out.print("Input third number: ");
		  int num3 = in.nextInt();
		  System.out.print("Input fourth number: ");
		  int num4 = in.nextInt();
		  System.out.print("Input fifth number: ");
		  int num5 = in.nextInt();
		  System.out.println("average of five number is = "+ (num1+num2+num3+num4+num5)/5);
	}

}
