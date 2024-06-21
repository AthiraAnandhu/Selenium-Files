package JavaProgramsProblems;

public class Print3MultiplesinSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		3
		3 6
		12 15 18
		s
		*/
		
		int k=1;
		for(int i=1;i<=4;i++)
		{
			//System.out.println("outer loop started");
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(k*3);
				System.out.print("\t");
				k++;
				
			}
			
			System.out.println("");
		}
	}

}

