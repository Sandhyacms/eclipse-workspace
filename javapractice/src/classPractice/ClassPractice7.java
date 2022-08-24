package classPractice;

public class ClassPractice7 {

	public static void main(String[] args) {
		calc2 a = new calc2(5, 2, 3, 4);
		a.multiplication();

	}

}

class calc2 {
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;

	calc2(int i, int j, int k, int l) {
		a = i;
		b = j;
		c = k;
		d = l;

	}
	void multiplication() {
		System.out.println(a*b*c*d);
	}
			

}
