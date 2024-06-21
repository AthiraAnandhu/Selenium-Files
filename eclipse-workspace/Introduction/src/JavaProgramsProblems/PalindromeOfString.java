package JavaProgramsProblems;

public class PalindromeOfString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="athira";
		String rev="";
	
	
	for(int i=s.length()-1; i>=0;i--)
	{
		rev= rev+s.charAt(i);
		
		
		
		
	}
	System.out.println(rev);
	if(s==rev)
	{
		System.out.println(s +" They are palindrome Nos");
	}
	else
	{
		System.out.println(s +"Not palindrome");
	}
}
}