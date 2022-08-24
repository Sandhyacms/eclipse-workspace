package javapractice;

public class WhileLoop {

	public static void main(String[] args) {
		int[] a= {1,5,3,6,9,8,6};
		int i=7;
		while(i<a.length) {
			System.out.println("Seq "+i+" value "+a[i]+" = "+(a[i]+7));
			i++;
			
		}

	}

}
