package programs;

public class Closeto100 {
	
	public static int calculateDiff(int i,int j) {
		int diff1 = Math.abs(100-i);
		int diff2= Math.abs(100-j);
		
		if(diff1<diff2) {
			return i;
		}		
		else if(diff1==diff2) {
			return 1;
		}
		else {
			return j;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1:"+calculateDiff(50,90));
		System.out.println("case 2:"+calculateDiff(-50, -60));
		System.out.println("case 3:"+calculateDiff(102, 120));
		System.out.println("case 4:"+calculateDiff(110, 110));
		

	}

}
