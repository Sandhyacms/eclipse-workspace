package classPractice;

public class ClassPracticeEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
encap var = new encap();
var.setI(9);
var.setJ(12);

System.out.println(var.getI());
System.out.println(var.getJ());

	}

}

class encap {
	private int i=0;
	private int j=0;
	
	public int getI() {
		return i+2;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j+2;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	
	
}