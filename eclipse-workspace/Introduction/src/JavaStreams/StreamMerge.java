package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamMerge {
	
		@Test
		public void Merge() {
			//FIRST LIST
			ArrayList<String> names = new ArrayList<String>();
			names.add("Man");
			names.add("Don");
			names.add("Women");
			//SECOND LIST
			List<String> names1 = Arrays.asList("Azbhijeeth","Don","Alekhya","Adam","Rama");
			
			Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
			newStream.sorted().forEach(s->System.out.println(s));
}
}