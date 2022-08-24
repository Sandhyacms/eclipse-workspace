package classPractice;

public class ClassPractice12 {

	public static void main(String[] args) {
		calculater cal;
		cal = new calculater("div", 15, 7);
		cal.calc();
//		cal = new calculater("sum", 15, 7);
//		cal.calc();
//		cal = new calculater("sub", 15, 7);
//		cal.calc();
//		cal = new calculater("mul", 15, 7);
//		cal.calc();
		cal.calc("mul", 8, 2);
		cal.calc("sum", 8, 2);
		cal.calc("div", 8, 2);
		cal.calc("sub", 8, 2);
		
		
	}

}

class calculater {
	String a = "";
	int b = 0;
	int c = 0;

	calculater(String i, int j, int k) {
		a = i;
		b = j;
		c = k;

	}

	void calc() {
		if (a == "sum") {
			System.out.println(b + c);
		} else if (a == "sub") {
			System.out.println(b - c);
		} else if (a == "mul") {
			System.out.println(b * c);
		} else if (a == "div") {
			System.out.println(b / c);
		}
	}

	void calc(String i, int j, int k) {
		a = i;
		b = j;
		c = k;
		if (a == "sum") {
			System.out.println(b + c);
		} else if (a == "sub") {
			System.out.println(b - c);
		} else if (a == "mul") {
			System.out.println(b * c);
		} else if (a == "div") {
			System.out.println(b / c);
		}
	}

}