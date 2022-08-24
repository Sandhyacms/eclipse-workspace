package classPractice;

public class ClassPractice9 {

	public static void main(String[] args) {
		table a=new table(4);
		a.printtable();

	}

}
class table{
	 int num=0;
	 
	 table(int a){
		num=a; 
	 }
	public void printtable() {
		for(int i=1;i<=10;i++) {
			System.out.println(num  +" x "+ i + " = " + (num* i));
		}
	}
}