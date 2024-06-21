package JavaStreams;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Demo {

	//print total count of names starting with A
	
	//@Test
	public void commonway() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
			System.out.println(count);
		}
		
	}
	
	
	//using Java Streams----Lamda expression
	//@Test
	public void JavaStream()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		//lamda expression
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
	}

	//to print the names where the length gretaer than 4
	@Test
	
	public void GreaterThan4()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
}
