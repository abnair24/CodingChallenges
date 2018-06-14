package programs;

public class LargestArrayNum {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {0,8,9,-1,6,5,7,9,10,3,0,11,1,2};
		int index =0;
		int large =arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=large) {
				large =arr[i];
				index=i;
				
			}
		}
	 System.out.println("Largest:"+large);
	}

}
