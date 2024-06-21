package JavaProgramsProblems;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1
		2 3
		4 5 6
		7 8 9 10
		*/
		
		
		for(int i=0;i<4;i++)
		{
			//System.out.println("outer loop started");
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
				
			}
			
			System.out.println("");
		}
	}

}

