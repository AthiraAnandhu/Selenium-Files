package CoreJavaPart2;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[]=new int[5];
		try
		{
			System.out.println(arry[7]);
		}
		catch(IndexOutOfBoundsException et)
		{
			System.out.println("I catched the Index Out Of Bounds Exception error");
		}
		finally {
			System.out.println("delete cookies");
		}
	}

}
