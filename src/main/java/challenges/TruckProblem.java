package challenges;

import java.util.Scanner;

public class TruckProblem {
    public static int getStartIndex(int[] petrol,int[] dist){

        int nPumps= petrol.length;
        int start , currentPetrol;
        int i=start=0;

        while(start < nPumps) {
            currentPetrol= petrol[i] - dist[i] ;

            while(currentPetrol >= 0)	{

                i= (i+1) % nPumps ;

                currentPetrol += petrol [i] - dist[i] ;

                if(i==start)
                    return start;
            }
            start = ++i ;
            i= i % nPumps ;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        TruckProblem p = new TruckProblem();
        p.splittingArray();
    }

    public void splittingArray() throws Exception {
        int[] inputArray =getStringFromConsole();
        int [] petrolPumps = new int[inputArray.length];
        int[] distance = new int[inputArray.length];
        int j =0;
        int k=0;
        for(int i=0;i<inputArray.length;i++) {

            if(i%2==0) {
                petrolPumps[j]=inputArray[i];
                j++;
            } else {
                distance[k]=inputArray[i];
                k++;
            }
        }
        int index= getStartIndex(petrolPumps,distance);
        System.out.println(index);
    }

    public int[] getStringFromConsole() throws Exception {

        Scanner s = new Scanner(System.in);
        int noOfPumps;

        noOfPumps = s.nextInt();
        //System.out.println(noOfPumps);
        int [] inputData = new int[noOfPumps * 2];

        for(int i=0;i<(noOfPumps*2);i++) {
            inputData[i] = s.nextInt();
        }
        return inputData;
    }
}


