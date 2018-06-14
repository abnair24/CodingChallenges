package programs;

public class PushZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{0,5,6,0,0,2,4,0};
		int start = 0;
		int end = arr.length-1;
		
		while(start < end)
		{
			if(arr[start] != 0)
			{
				System.out.println(start);
				++start;
			}
			if(arr[end]==0) {
				System.out.println(end);
				--end;
			}
			if(arr[start] == 0 && arr[end]!=0) {
				int temp = arr[end];
				arr[end]=arr[start];
				arr[start]=temp;
				System.out.println(arr[start]+":"+arr[end]+":"+temp);
				++start;
				--end;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
