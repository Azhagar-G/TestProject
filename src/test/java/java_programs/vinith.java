package java_programs;

import java.util.HashSet;
import java.util.Set;

public class vinith {

	
	public static void main(String[] args) {
		
		int[] arr={2,4,5,2,1,4,8,4,9,11,6};
		Set<Integer> a = new HashSet<Integer>();
		
		for(int a1 : arr) {
			a.add(a1);
		}System.out.println(a);
	}
}
