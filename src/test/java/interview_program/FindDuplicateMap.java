package interview_program;

import java.util.*;

public class FindDuplicateMap {
	 public static void main(String argu[]) {
	      String str = "beautiful beach is better";
	      char[] c = str.toCharArray();
	    Map<Character,Integer> AS=new HashMap<Character,Integer>();
	    for(Character A:c){
	    if(AS.containsKey(A)){
	 AS.put(A,AS.get(A)+1);
	    }
	    else
	     AS.put(A,1);
	     
	     
	     }
	     for(Map.Entry<Character,Integer> Res:AS.entrySet()){
	         if(Res.getValue()>1){
	             System.out.println( Res.getKey() +" is "+Res.getValue()+" times");
	         }
	   }
	}
}
