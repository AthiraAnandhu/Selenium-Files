package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamMap {
	@Test
	//print names which have last letter a  and convert it to upercase and then print
	public void Map() {
		Stream.of("Abhijeeth","Don","Alekhya","Adam","Rama").
		filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
		//print names which have last letter a and convert it to upercase and sort
		
		List<String> names = Arrays.asList("Azbhijeeth","Don","Alekhya","Adam","Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}

}
