package programs;

import java.util.Scanner;

public class RotateStringWithoutFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1= scan.next();
		
		System.out.println("Enter string to be matched: ");
		String s2= scan.next();
		
		System.out.println("Enter the number of bits to rotate");
		int r = scan.nextInt();
		
		isStringSameAfterRotation(s1,s2,r);
	}
	
	public static void isStringSameAfterRotation(String s1, String s2,int r) {
		char[] array1= s1.toCharArray();
		StringBuilder b = new StringBuilder();
		StringBuilder b1= new StringBuilder();
		
		for(int i=r;i<array1.length;i++) {
			b.append(array1[i]);
		}
		for(int i=0;i<r;i++) {
			b.append(array1[i]);
		}
		
		for(int i=(array1.length-r);i<array1.length;i++ ) {
			b1.append(array1[i]);
		}
		
		for(int i=0;i<array1.length-r;i++) {
			b1.append(array1[i]);
		}
				
		if(s2.equals(b.toString()) || s2.equals(b1.toString())) {
			System.out.println("Same");
		}
		
		else {
			System.out.println("not same");
		}
	}
	
		


}
