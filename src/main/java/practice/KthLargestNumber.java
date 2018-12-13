package practice;

/*
ind the kth largest element in an unsorted array.
This will be the kth largest element in sorted order, not the kth distinct element.

Example

For nums = [7, 6, 5, 4, 3, 2, 1] and k = 2, the output should be
kthLargestElement(nums, k) = 6;
For nums = [99, 99] and k = 1, the output should be
kthLargestElement(nums, k) = 99.
 */
public class KthLargestNumber {


    public static void main(String[] args) {
        int[] array = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] temp = new int[array.length];


        KthLargestNumber k = new KthLargestNumber();
        System.out.println(k.largest(array,2,temp));
    }

    public int largest(int[] array,int k,int[] temp) {
        sort(array,temp);
        return array[array.length-k];
    }

    public void sort(int[] array,int[] temp) {
        mergeSort(array,0,array.length-1,temp);
    }

    public void mergeSort(int[] array,int left, int right,int[] temp) {
        if(left< right) {
            int middle = (left + right)/2;
            mergeSort(array,left,middle,temp);
            mergeSort(array,middle+1,right,temp);
            merge(array,left,middle,right,temp);
        }
    }

    public void merge(int[] array,int left,int middle,int right,int[] temp){
        for(int i= left;i<=right;i++){
            temp[i]=array[i];
        }

        int le =left;
        int mid = middle+1;
        int k =left;

        while(le <= middle && mid <= right) {
            if(temp[le]<=temp[mid]){
                array[k]=temp[le];
                le++;
            } else {
                array[k]= temp[mid];
                mid++;
            }
            k++;
        }

        while(le<=middle) {
            array[k] = temp[le];
            le++;
            k++;
        }
    }
}
