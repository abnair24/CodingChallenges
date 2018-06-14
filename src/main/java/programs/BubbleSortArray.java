package programs;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = new int[] {30,12,18,0,-5,72,44};
		int len= values.length;
		
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(values[j]>values[j+1]) {
					swap(values,j,j+1);
				}
			}
		}
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);

		}
		
	}
	
	public static void swap(int[] array,int k,int l) {
		int temp= array[k];
		array[k]=array[l];
		array[l]=temp;
	}

}
