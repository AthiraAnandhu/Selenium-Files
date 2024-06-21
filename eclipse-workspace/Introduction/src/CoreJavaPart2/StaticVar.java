package CoreJavaPart2;

public class StaticVar {

	String name;
	String address;  // instance variable
	static String city ; // class variable
	
	static
	{
		city="Banglore";
	}
	StaticVar(String name,String address)  // local variable
	{
		this.name=name;
		this.address=address;
		
	}
	
	public void getAddress() {
		System.out.println(address +" "+city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj =new StaticVar("Bob","Marthalli");
		StaticVar obj1 =new StaticVar("Ram","JayNagar");
		obj.getAddress();
		obj1.getAddress();
	}

}
