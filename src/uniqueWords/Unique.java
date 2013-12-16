package uniqueWords;

import java.util.HashSet;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		for (String a: args)
			set.add(a);

		for (String s: set){
			System.out.println(s);
		}
	}
}
