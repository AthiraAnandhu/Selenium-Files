package JavaProgramsProblems;

public class Print1to10InAnotherSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1
		2 3
		4 5 6
		7 8 9 10
		*/
		
		int k=1;
		for(int i=0;i<4;i++)
		{
			//System.out.println("outer loop started");
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
		}
	}

}

