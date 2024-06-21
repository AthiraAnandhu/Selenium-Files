package JavaOOpsPart1;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<4;i++)
		{
			System.out.println("outer loop started");
			
			for(int j=1;j<=4;j++)
			{
				System.out.println("inner loop");
			}
			
			System.out.println("outer loop finished");
		}
	}

}
