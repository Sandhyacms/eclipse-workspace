package classPractice;

public class ClassPractice10 {

	public static void main(String[] args) {
	sum1 s=new sum1(4,5);
	s.printsumofsquare();

	}

}
class sum1{
	int a=0;
	int b=0;
	sum1(int i,int j){
		a=i;
		b=j;
		
	}
	public void printsumofsquare() {
		System.out.println(a*a+b*b);
	}
}