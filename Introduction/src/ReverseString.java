
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s= "Athira";
           String y= "";
           
           for(int i=s.length()-1; i>=0; i--)
           {
        	   y+=s.charAt(i);
        	   System.out.println(y);
           }
        
	}

}
