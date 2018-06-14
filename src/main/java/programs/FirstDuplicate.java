package programs;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[] {4,3,2,1,5,9,6,4,5,3};
		
		Set<Integer> freq= new HashSet<Integer>();
		for(int i=0;i<numbers.length;i++)
		{
			
			if(!freq.contains(numbers[i]))
			{
				freq.add(numbers[i]);
			}
			else 
			{
				System.out.println(numbers[i]);
				
			}
		}
		
		

	}

}
