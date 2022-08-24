package hackathon;

import java.util.Scanner;
//Q1.Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true 

public class Q01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean a;

		a = s.nextBoolean();
		boolean b;
		b = s.nextBoolean();
		boolean c;
		c = s.nextBoolean();
		int result = 0;
		if (a == true) {
			result++;
		}
		if (b == true) {
			result = result + 1;

		}
		if (c == true) {
			result++;
		}
		if (result >= 2) {
			System.out.println("value of two variable is true");

		} else {
			System.out.println("value of two vaeiable is not true");
		}
	}
}