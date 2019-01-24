package programs;

public class MergeSortPgm {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {38,27,48,3,19,82,10};
        MergeSortPgm mms = new MergeSortPgm();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
        System.out.println("Main :" + lowerIndex + " : "+ higherIndex);
        if (lowerIndex < higherIndex) {
        	
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            
            System.out.println("\n");
            
            System.out.println("left merge : "+lowerIndex+" : "+ middle);
            
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            
            // Below step sorts the right side of the array
          
            System.out.println("right merge : "+(middle+1)+" : "+higherIndex);
            
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            System.out.println("merge :"+lowerIndex +" : "+middle +" : "+higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
    	System.out.println("\n");

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
        	System.out.println("\n");
        	System.out.println("i:"+i+" "+"j:"+j+" "+"k:"+k);
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}