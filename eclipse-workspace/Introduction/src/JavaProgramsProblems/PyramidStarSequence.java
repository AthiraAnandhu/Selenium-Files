package JavaProgramsProblems;

public class PyramidStarSequence {
/*
	  
	 * 
    * * 
   * * * 
  * * * * 
 * * * * * 

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++)   // no of rows is 5
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");  // create spaces at begining of each row
			}
			 
			for(int k=0; k<=i ; k++)
			{
				System.out.print("* ");  // give space after * to get pyramid
			}
			
			System.out.println();
		}

	}

}
