package javapractice;
import java.util.Scanner;
public class Scannerclass2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		System.out.println("The sum of Three number is "+(a+b+c));
		System.out.println("The average of three number is "+(a+b+c)/3);
		in.close();

	}

}
