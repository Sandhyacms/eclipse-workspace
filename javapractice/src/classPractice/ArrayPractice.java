package classPractice;

public class ArrayPractice {

	public static void main(String[] args) {
		int arr[] = { 13, 12, 2, 5, 6, 9, 5, 8, 31, 1 };
		maximum mm=new maximum();
		mm.setArr(arr);
		System.out.println(mm.getmaximum());

	}
}

class maximum {
	int arr[];

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getmaximum() {
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (ans < arr[i]) {
				ans = arr[i];
			}

		}

		return (ans);
	}
}