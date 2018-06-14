package programs;

public class BubbleSortPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[] {4,1,5,6,3,2,-1,9};
		
		bubbleSort(intArr);
		System.out.println("After Sort \n");
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]+",");
		}

	}
	
	public static void bubbleSort(int[] intArr)
	{
		int n= intArr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i)-1;j++) {
				if(intArr[j-1] > intArr[j]) {
					temp=intArr[j-1];
					intArr[j-1]=intArr[j];
					intArr[j]=temp;
				}
				
			}
		}
	}

}
