package programs;

public class ZeroesInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int number =100;
		int p =5;
		while(number/p > 0)
		{
			count+=number/p;
			p*=5;
			
		}
		
		System.out.println(count);
		
	}

}


