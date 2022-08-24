package hackathon;

public class Q11 {
//How to Split String in java?
	public static void main(String[] args) {
		String str = "apple, mango, grapes";
		String[] arrSplit = str.split(", ");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.println(arrSplit[i]);

		}

	}
}