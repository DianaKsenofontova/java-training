package dublicatesCount;

import java.util.HashSet;
import java.util.Set;

public class DublicatesCount {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for (String a: args){
			if (set1.contains(a)){
				set2.add(a);
			}else{
				set1.add(a);
			}
		}
		for (String s: set2){
			int counter = 0;
			for (String a: args){
				if (s.equals (a)){
					counter ++;
				}
			}
			System.out.println(s + "=" + counter);
		}
	}
}


