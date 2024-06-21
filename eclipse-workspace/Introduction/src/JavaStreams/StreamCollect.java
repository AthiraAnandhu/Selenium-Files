package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;
@Test

public class StreamCollect {
	
	public void Collect() {
		List<String> newString=
	Stream.of("Abhijeeth","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a"))
	.map(s->s.toUpperCase()).collect(Collectors.toList());
	
	//now print only fisrt element
     System.out.println(newString.get(0));
	
	
}
}