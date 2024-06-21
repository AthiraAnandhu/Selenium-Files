package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamMatch {
		
		@Test
		public void Match() {
			//FIRST LIST
			ArrayList<String> names = new ArrayList<String>();
			names.add("Man");
			names.add("Don");
			names.add("Women");
			//SECOND LIST
			List<String> names1 = Arrays.asList("Azbhijeeth","Don","Alekhya","Adam","Rama");
			
			Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
			Boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			System.out.println(flag);
			Assert.assertTrue(flag);
}
}