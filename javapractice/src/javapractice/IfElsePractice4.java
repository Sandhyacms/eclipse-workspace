package javapractice;

import java.util.Scanner;

public class IfElsePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your first name : ");
		String firstname = sc.next();
		System.out.print("enter your last name : ");
		String lastname = sc.next();
		System.out.print("your state : ");
		String statename = sc.next();
		if (lastname.equalsIgnoreCase("singh")) {
			if (statename.equalsIgnoreCase("up")) {
				System.out.println(firstname + " " + lastname + ", you are a rajput");
			} else {
				System.out.println(firstname + " " + lastname + ",you are Kurmi");
			}
		} else {

			System.out.println(firstname + " " + lastname + ", you are general class");

		}

	}
}
