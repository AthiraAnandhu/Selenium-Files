package JavaCore;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = new int[5];
         arr[0]=1;
         arr[1]=2;
         arr[2]=3;
         arr[3]=4;
         arr[4]=5;
         for(int i=0; i<arr.length; i++)
         {
        	 System.out.println(arr[i]);
         }
         
         
         
       int[] arr2 = {1,2,4,5,88};
       for(int i=0;i<arr2.length; i++)
       {
    	 System.out.println(arr2[i]);  
       }
       
       String[] name= {"athira","athi","pkumar"};
       for(int i=0;i<name.length;i++)
       {
    	   System.out.println(name[i]);
       }
       
	}

}
