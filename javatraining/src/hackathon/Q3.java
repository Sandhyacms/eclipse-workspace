package hackathon;

import java.util.Arrays;
//Q3.	Given an array of integers, sort the integer values.

public class Q3 {

	public static void main(String[] args) {
		int arr[] = { 53, 6, -7, 8, 9, 1, 55, 21, 45, 2 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
