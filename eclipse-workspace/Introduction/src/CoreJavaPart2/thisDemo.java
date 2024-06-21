package CoreJavaPart2;

public class thisDemo {
	
   //gobal variable
	int a=2;
	
	public void getDta()
	{
		//local variabe
		int a= 3;
		int b = a+this.a ;
		System.out.println(a);
		System.out.println(this.a);
		//print sum 
		System.out.println("sum is " + b);
	}
	public static void main(String[] args) {
		
		thisDemo td = new thisDemo();
		td.getDta();

	}

}
