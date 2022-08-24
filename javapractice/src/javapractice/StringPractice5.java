package javapractice;

import java.util.Scanner;

public class StringPractice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input your name : ");
		String name = sc.next();
		if(name.endsWith("dra")) {
			System.out.println(" shailendra");
		}else if(name.endsWith("hya")) {
			System.out.println("sandhya");
		}

		else {
			System.out.println("you are not a member");

	}

	}
}
