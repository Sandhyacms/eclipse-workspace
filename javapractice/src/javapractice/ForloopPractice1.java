package javapractice;
import java.util.Scanner;
public class ForloopPractice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your information");
		String str=sc.next();
		String[] info=str.split(",");
		for(int i=0;i<info.length;i++) {
			System.out.println(info[i]);
			
		}
	
			

	}

}
