package hackathon;

import java.util.Scanner;
//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?

public class Q12 {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		
		if (original.equals(reverse))
			System.out.println("Entered String/number is a palindrome");
		else
			System.out.println("Entered String?number is not a palindrome");

	}

}
