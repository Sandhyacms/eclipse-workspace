package classPractice;

public class ArrayPractice1 {

	public static void main(String[] args) {
		int arr[] = { 12, 5, 6, 8, 4, 9, 6, 7, 11, };
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (ans > arr[i]) {
				ans = arr[i];
			}
		}
		
System.out.println(ans);
	}

}
