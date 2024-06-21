package CoreJavaPart2;

public class ChildDemo extends ParentDemo {
	
	
	String name ="Anandhu";
	 
	//super keyword with same constructor
	public  ChildDemo()
	{ 
		super();
		System.out.println("I am child class constructor");
	}
	//super keyword with same variable name
	public void getName()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	//super keyword with same method 
	public void getData()
	{ 
		super.getData();
		System.out.println("I am in child class");
	}
	
	public static void main(String[] args) {
	
		ChildDemo cd = new ChildDemo();
		cd.getName();
		cd.getData();
	}
}
