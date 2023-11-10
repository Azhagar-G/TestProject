package java_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class javaprogram {
	public static void main(String[] args) {
			 		        // Create a string variable with default value   
		        String str = "agilysisasb";//"JavaTpoint is the best learning website";   
		        //call removeDuplicates() method for removing duplicate characters    
		        String s=removeDuplicates(str);   
		reverse(s);   
	triangle(5);	
	}   
			
	public static String removeDuplicates(String str)   
    {           //Create an empty string   
        String newstr = new String();   
                  //calculate length of the original string  
        int length = str.length();   
                  // Traverse the string and check for the repeated characters   
        for (int i = 0; i <= length-1; i++)    
        {             // store the character available at ith index in the string  
            char charAtPosition = str.charAt(i);   
                    // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
                newstr += charAtPosition;   
            }        }   
        //Print string after removing duplicate characters   
        System.out.println(newstr);  
return(newstr);
    }   
	
public static void reverse(String sr) 
    {   for(int i=sr.length()-1;i>=0;i--) {
System.out.print(sr.charAt(i));
} System.out.println();
}     
  
public static void triangle(int rows) {
	 for (int i = 1; i <= rows; i++) {
		  
         // loop to print the number of spaces before the star
         for (int j = rows; j >= i; j--) {
             System.out.print("1");
         }

         // loop to print the number of stars in each row
         for (int j = 1; j <= i; j++) {
             System.out.print("* ");
         }

         // for new line after printing each row
         System.out.println();
     }
	 
	 //removing two Spaces
	 String before= "trim  and strong  gun";
	 String after = before.trim().replaceAll(" +", " ");
	 System.out.println(after);
}


	
	public void duplicate() {

System.out.println("To find the duplicate string");
		String s = "Big black bug bit a black dog on his big black bit nose";
		String word[] = s.split(" ");

		Set<String> a = new HashSet<String>();

		for (int i = 0; i <= word.length - 1; i++) {

			for (int j = i + 1; j <= word.length - 1; j++) {

				if (word[i].equalsIgnoreCase(word[j])) {
//					System.out.println(word[i]);
					a.add(word[i]);
				}
			}
		}
		System.out.println("Duplicate String is:");
		for (String r : a) {
			System.out.println(r);
		}
		System.out.println("----------------------------------------");

System.out.println("To print the string without duplicate");

String s1 = "Big black bug bit a black dog on his big black bit nose";
String Split[]=s1.split(" ");
Set<String> b = new HashSet<String>();
for(int i=0;i<=Split.length-1;i++) {
b.add(Split[i]);

}
//for case sensite to remove duplicate
//for (int i = 0; i <= word.length - 1; i++) {
//
//	for (int j = i + 1; j <= word.length - 1; j++) {
//
//		if (!Split[i].equalsIgnoreCase(Split[j])) {
////			System.out.println(word[i]);
//			b.add(Split[i]);
//		}
//	}
//	}
System.out.println("Duplicate String is:");
for (String r1 : b) {
	System.out.println(r1);
}
				
		String s10="Am the boss am don world Am of the don of the world of the boss";
		String de =" ";
		String[] so = s10.split(" ");
		for (String x : so) {
			if(!de.contains(x)) {
				de=de+x+" ";
			}			
		}
		System.out.println(de);

		
		System.out.println("-----------------------------------------------------------------------");
//		String s11 = "Big black bug bit a black dog on his big black bit nose";
//		String Split1[]=s11.split("");
//		Set<String> b1 = new HashSet<String>();
//		for(int i=0;i<=Split1.length-1;i++) {
//		b1.add(Split1[i]);
//		}System.out.println();
		
		 
		
		//first repeat character
		String str = "pcghahzhagartrechg";
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			int ind = str.indexOf(cc);
			int lst = str.lastIndexOf(cc);
			if(ind!=lst) {
				System.out.println(cc);
				break;			
				}		
			}
		System.out.println("-----------------------------------------------------------------------");
		//find all repeat character
		String sr = "pcghahzhagartrechg";
		char[] cs = sr.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			for (int j = i+1; j < cs.length; j++) {
				if(cs[i]==cs[j]) {
					System.out.println(cs[i]);
					break;}}}
		
		System.out.println("-----------------------------------String reverse with duplicate-------------------------");
		
		String nn1 = null;
		String ss1="Agilysys";
//		String St12[]=ss1.split(" ");
		char[] St12=ss1.toCharArray();
		System.out.println(St12);
		for(int i1=0;i1<=ss1.length();i1++) {

	for(int j1=1;j1<=ss1.length();j1++) {
	
//			for(int i=ss1.length();i>=0;i--) {
////				System.out.println("33");
//			for(int j=ss1.length()-1;j>0;j--) {
//				if(!(St12[i]==St12[j])) {
					System.out.println(St12[i1]);
				}
		}
		
	}}
//		System.out.println(nn1);
//		System.out.println(St12);
		
		
		
//		
//	System.out.println("--------------------remove duplicate-----------");
//		String s12 = "Big black bug bit a black dog on his big black bit nose";
//		String Split12[]=s12.split(" ");
//		Set<String> b2 = new LinkedHashSet<String>();
//		for(int i=0;i<=Split12.length-1;i++) {
//		b2.add(Split12[i]);
//		}
////		StringBuilder sb11=new StringBuilder();
//		for(String r2:b2) {
////		sb11.append(" "+r2);
//			System.out.print(" "+r2);
//		}}}
//		System.out.println(sb11);
		
		
		
////		Count of Letter
//		String s6="vinithth";
//		char[] cz = s6.toCharArray();
//		Map<Character, Integer> ma =new LinkedHashMap<Character, Integer>();
//		for (char x : cz) {
//			if(ma.containsKey(x)) {
//				Integer ct = ma.get(x);
//				ma.put(x, ct+1);		
//		}
//			else {
//				ma.put(x, 1);
//			}	
//		}
//		System.out.println(ma);
//		
////		duplicate print
//		Set<Entry<Character, Integer>> et = ma.entrySet();
//		for (Entry<Character, Integer> y : et) {
//			if(y.getValue()>1) {
//				System.out.println(y.getKey());
//			}	
//		}
//		
////		Count of Word
//		String s7="Am of the boss of the world of the boss";
//		String[] spt = s7.split(" ");
//		Map<String, Integer> maa= new LinkedHashMap<String, Integer>();
//		for (String x : spt) {
//			if(maa.containsKey(x)) {
//				Integer it = maa.get(x);
//				maa.put(x, it + 1);
//				
//			}
//			else {
//				maa.put(x, 1);
//			}	
//		}
//		System.out.println(maa);
//		
////		print duplicate word 
//		String s8="Am the boss am  don world Am of the don of the world of the boss";
//		String[] spq = s8.split(" ");
//		Map<String, Integer>mn=new LinkedHashMap<String, Integer>();
//		for (String u : spq) {
//			if(mn.containsKey(u)) {
//				Integer ia = mn.get(u);
//				mn.put(u, ia+1);
//			}
//			else {
//				mn.put(u, 1);
//			}
//		}
//		System.out.println(mn);
//		
//		Set<Entry<String, Integer>> es = mn.entrySet();
//		for (Entry<String, Integer> x : es) {
//			if(x.getValue()>1) {
//				System.out.println(x.getKey());
//			}	
//		}
//		
//		
//		
//	}
//}

