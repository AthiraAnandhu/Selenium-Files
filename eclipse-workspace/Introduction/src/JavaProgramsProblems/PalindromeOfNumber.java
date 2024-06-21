package JavaProgramsProblems;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		int org_No = num;
		
		int rev =0;
		while(num !=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(org_No == rev)
		{
			System.out.println(org_No + " is a palindrome no");
		}
		else
		{
			System.out.println(org_No + " is not a palindrome no");
		}
		

}
}