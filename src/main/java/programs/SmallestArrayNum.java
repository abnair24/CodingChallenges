package programs;

public class SmallestArrayNum {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {0,8,9,-1,6,5,7,9,10,3,0,11,1,2};
		int index =0;
		int index1=0;
		int second=arr[0];
		int small =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=small) {
				small =arr[i];
				index=i;
			}
		
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<=second && arr[j]>small) {
				second=arr[j];
				index1=j;
			}
		}
		
		System.out.println("Smallest:"+second);
	}

	}


