package CoreJavaPart2;

public class ExceptionArithmeticDemo {
	public static void main(String[] args) {
		
		int a=4;
		int b=0;
		
		try {
			int k=a/b;
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("I catched the Arithmetic exception error");
		}
		
		catch(Exception e)
		{
			
		}
		
	}
	
	
}