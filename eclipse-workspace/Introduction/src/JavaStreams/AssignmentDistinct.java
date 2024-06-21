package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class AssignmentDistinct {

	
	@Test
	public void uniqueDistinct()
	
	{
		List<Integer> values =Arrays.asList(3,2,2,7,5,1,9,7);
		//this will print distinct values
		//values.stream().distinct().forEach(s->System.out.println(s));
		
		//now sort this and get 3rd index
		List<Integer> newList =values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newList.get(2));
		
	}
}
