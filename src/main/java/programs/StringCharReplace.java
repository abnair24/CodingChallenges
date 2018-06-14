package programs;

/*
 * I/P: GOOGLE
 * O/P: OOLE (G is removed)
 */
public class StringCharReplace {

	public static void main(String[] args) {
		String str = "GOOGLE";
		char charToremove = 'G';
		
		
		StringBuffer sample = new StringBuffer();
		char temp;
		for(int i=0;i<str.length();i++)
		{
			temp=str.charAt(i);
			if(temp!=charToremove) {
				sample.append(temp);				
			}
			
		}
		System.out.println(sample.toString());

	}

}
