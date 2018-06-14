
package programs;
/*
 * Find common char in 3 diff string
 *I/P:aghkafgklt
      dfghako
      qwemnaarkf
      
       o/p: a , f,k
 */

public class CommonCharString {

	public static void main(String[] args) {
		
		
		String[] inputStr = new String[] { "aghkafgklt","dfghako","qwemnaarkf"};
		String firstString = inputStr[0];
		
		for (int i=0; i<inputStr.length ; i++)
		{
			inputStr[i].compareTo(inputStr[i+1]);
			
	}
				
				
	}	

}
 