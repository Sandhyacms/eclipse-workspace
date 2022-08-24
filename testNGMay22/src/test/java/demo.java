import org.testng.annotations.Test;

public class demo {
  @Test(priority=1)
  public void c_method() {
	  System.out.println("I am in method c");
}
  @Test
  public void b_method() {
	  System.out.println("I am in method b"); 
}
  @Test(priority=2)
  public void test1() {
	  System.out.println("I am in method a");
}
  @Test
  public void a_method() {
	  System.out.println("I am in method d");
}
  @Test(priority=3)
  public void e_method() {
	  System.out.println("I am in method e");
}
}