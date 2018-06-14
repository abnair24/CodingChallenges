package programs;

import java.util.Scanner;

public class SumOfPrime {
	
	public static int isPrime(int i) {
		int flag=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag=1;
				break;
			}
			
		}
		
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		int sum=-1;
		for(int i=2,c=1;c<=limit;i++) {
			if(isPrime(i)==0) {
				System.out.println(i);
				sum=sum+i;
				c++;
			}
		}
		System.out.println(sum);

	}

}
