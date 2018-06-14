package interviewQuestionWeb;
/*
 * Input: "My name is Aswathy"
 * O/p:  "yM eman si yhtawsA"
 */

public class StringRev1 {

	public static void main(String[] args) {
		
		String orginal = "My name is Aswathy";
		String rev="";
		Character[] ch = new Character[orginal.length()];
		String[] str = orginal.split(" ");
		
		for(String s: str) {
			int len = s.length();
			rev= rev+ " ";
			
			for(int i=0;i<s.length();i++) {
				ch[i]=s.charAt(len-1);
				
				rev=rev+ ch[i];
				len--;
			}
		}
		System.out.println(orginal);
		System.out.println(rev.trim());

	}

}
