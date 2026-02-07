package week1.day2;

public class LearnMethods {
		
		void addNumbers(int a,int b){
			System.out.println(a+b);
			 	
			}
		
		int noofbycycle(){
			return 2;			
}
 String bicycleData(String brandName ,String color){
	 return brandName +" " +color;
	 
 }
 
 public static void main(String[] args) {
	LearnMethods bi=new LearnMethods ();
	bi.addNumbers(1, 2);
	bi.bicycleData("Hero","red");
	int noofbycycle = bi.noofbycycle();
	System.out.println(noofbycycle);
	System.out.println(bi.bicycleData("Hero", "red"));
	
	
}

}

