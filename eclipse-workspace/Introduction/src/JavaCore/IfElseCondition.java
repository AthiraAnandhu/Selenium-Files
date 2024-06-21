package JavaCore;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to print multiples of 2
		int[] arr2 = {1,2,4,5,88};
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] %2 == 0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i] +"is not multiple of 2");
			}
		}
	}

}
