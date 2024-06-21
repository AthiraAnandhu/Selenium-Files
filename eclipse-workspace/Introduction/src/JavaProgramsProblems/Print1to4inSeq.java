package JavaProgramsProblems;

public class Print1to4inSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1
		1 2
		1 2 3
		1 2 3 4
		*/
		
		
		for(int i=1;i<=4;i++)
		{
			//System.out.println("outer loop started");
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
				
			}
			
			System.out.println("");
		}
	}

}

