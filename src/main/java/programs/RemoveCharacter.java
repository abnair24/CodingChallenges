package programs;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Fox jumper over the bridge";
		char toReplace='o';
		String newStr= removeChar('e',str,toReplace);
		
		System.out.println(newStr);

	}
	
	public static String removeChar(char c, String s,char r) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				sb.append(r);
			}
			else
				sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	
	

}
