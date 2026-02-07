package week1.day2;

public class LearnMethod {
	
	public void enterUsername() {	
			System.out.println("Valid username is entered");
	}
	
	public void enterPassword() {
		System.out.println("Valid Password Entered");
	}
	public void clickLogin() {
		System.out.println("Login successful for the valid credentials");
	}
	public static void main(String[] args) {
		
		LearnMethod lm=new LearnMethod ();
		lm.enterUsername();
		lm.enterPassword();
		lm.clickLogin();
	}

}
