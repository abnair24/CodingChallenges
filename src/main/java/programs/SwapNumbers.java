package programs;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b= 5;
		System.out.println("Before reverse: "+a+","+b );
		a=a+b;
		b=a-b;
		
		a= a-b;
		
		System.out.println("After reverse: "+a +","+ b);

	}

}
