package classPractice;

public class ClassPractice4 {

	public static void main(String[] args) {
		calc s=new calc(5,6,7);
		s.printsum();
		 s=new calc(15,16,12);
		s.printsum();

	}

}
class calc {
	int a = 0;
	int b = 0;
	int c=0;
	
	calc(int i,int j,int k){
		a=i;
		b=j;
		c=k;
	}
	void printsum() {
		System.out.println(a+b-c);
	}
	
}