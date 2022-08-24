package hackathon;
//Q4.	Given an array of integers check the Palindrome of the series.

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r, sum = 0, temp;
		int n =s.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not palindrom");

	}

}
