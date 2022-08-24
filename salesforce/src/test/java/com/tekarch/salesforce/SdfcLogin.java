package com.tekarch.salesforce;

import org.testng.annotations.Test;

public class SdfcLogin extends SdfcLogin_implement {
 
  @Test
  public void Login_Error_Message_1() {
	//  Launch_app_withoutpassword();	  
  }
  
  @Test
  public void Login_To_SalesForce_2() {
	 // Launch_app();
  }
   @Test
   public void Check_RememberMe_3() {
	 //  rememberMe(); 
   }
   
   @Test
   public void ForgotPassword_4A() {
	 //  forgotPassword();
   }
   
   @Test
   public void ForgotPassword_4B() throws InterruptedException {
	   forgotpassword_4b();
   }
   
}
