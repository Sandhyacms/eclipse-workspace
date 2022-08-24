package javapractice;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input your name : ");
		String name = sc.next();
		if(name.contains("len")) {
			System.out.println(" shailendra");
		
		}

		else {
			System.out.println("you are not a member");

		}
	
	}
}