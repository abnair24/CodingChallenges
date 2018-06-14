package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


   /*A method takes two array list as its arguments
     Both ArrayList have list of objects similar to the example here below 
    *AL1 = {A,A,B,L,C,F,D,E,F,D,Z,R}
     AL2 = {C,E,X,Z,M,X,P,L,M,N,S,T,P,B,A}
     The aim is to create a third arraylist AL3 which would contain only 
     elements that are occuring exactly twice, even after combining both AL1 and AL2.
     So, the resultant list should be as seen here below
     AL3 = {B,C,F,D,Z,E,X,P,M} 
    */


public class ArrayListCountChar {
	
	public static void twiceChar(List<Character> l1,List<Character> l2) {
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		ArrayList<Character> ac = new ArrayList<Character>();
		
		for(Character a1: l1) {
			Integer i = hm.get(a1);

			if(i==null) {
				hm.put(a1, 1);
			}
			else {
				hm.put(a1,++i);
						
			}
			
		}
		
		for(Character a2: l2) {
			Integer j = hm.get(a2);
			
			if(j==null) {
				hm.put(a2, 1);
			}
			else {				
				hm.put(a2, ++j);
			}
		}
		System.out.println(hm);
		for(Entry<Character,Integer> ent: hm.entrySet()) {
			if(ent.getValue()==2) {
				ac.add(ent.getKey());
				
			}
		}
		
		System.out.println(ac);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character car1[] = new Character[] {'A','A','B','L','C','F','D','E','F','D','Z','R'};
		Character car2[] = new Character[] {'C','E','X','Z','M','X','P','L','M','N','S','T','P','B','A'};
		
		List<Character> l1 = new ArrayList<Character>();
		List<Character> l2 = new ArrayList<Character>();
		
		l1 = Arrays.asList(car1);
		System.out.println(l1);
		l2= Arrays.asList(car2);
		System.out.println(l2);
		
		twiceChar(l1,l2);
			
	}

}
