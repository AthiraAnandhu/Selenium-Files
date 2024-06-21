package JavaProgramsProblems;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int a[][]= {{2,3,4},{5,6,7}};
		
		for(int i=0;i<2;i++)  // i here is row
		{
			for (int j=0;j<3;j++)  //j here is column
			{
				System.out.print(" "); // to put spaces
				System.out.print(a[i][j]);  //ith row jth index
			}
			System.out.println();  // to print row in next line
		}
	}

}
