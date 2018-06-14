package programs;

public class SelectionSortpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= new int[]{10,34,2,7,6,88,67,0};
		int[] arr2 = selectionSort(arr1);
		
		for(int i: arr2)
		{
			System.out.println(i + " ");
		}

	}

	
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
				
				int small=arr[index];
			    arr[index]=arr[i];
				arr[i]=small;
			}
		}
		return arr;
	}
}
