package programs;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("malayalam");
		
		boolean b = isPalindrome(str);
		System.out.println(b);

	}
	
	private static boolean isPalindrome(String st) {
		if(st == null) {
			return false;
			
		}
		int length = st.length();
		
		for(int i=0; i< length /2;i++)
		{
			if(st.charAt(i)!=st.charAt(length-i-1))
				return false;
		}
		
		return true;
	}

}
