package CoreJavaPart3;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		
		System.out.println(hs);
		//to remove
	//	hs.remove("UK");
		//check empty or not
		System.out.println(hs.isEmpty());
		//check size
		System.out.println(hs.size());
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
