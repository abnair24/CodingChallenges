package programs;

/*
 * Sample: "My Name is Aman"
 * O/p:    "Aman is Name My"
 */

public class StringReverse {

	public static void main(String[] args) {
		String str = "My name is Aman";
		String[] str1 = str.split(" ");
		
		for(int i= (str1.length-1);i>=0;i--)
		{
			System.out.print(str1[i]+" ");
		}

	}

}
