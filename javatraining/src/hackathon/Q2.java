package hackathon;

import java.util.Scanner;
//Q2.	write a program to find factorial (Non Recursive)

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int Fact = 0;
		Fact = s.nextInt();
		int result = 1;
		for (int i = Fact; i > 1; i--) {
			result = result * i;
		}
		System.out.println("Factorial no is = " + result);
	}

}
