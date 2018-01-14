package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) throws Exception {
        UtopianTree ut = new UtopianTree();
        ut.getDataFromConsole();
    }

    public static int growthInEachCycle(int cycles){

        int growth =0;

        if(cycles==0) {
            return 1;
        }

        if(cycles%2==1) {
            growth = growth + (2 * growthInEachCycle(cycles -1));
        } else {
            growth = growth + (growthInEachCycle(cycles -1) + 1);
        }
        return growth;
    }

    public void getDataFromConsole() throws Exception {
        Scanner s = new Scanner(System.in);
        int noOfTrees = s.nextInt();

        List<Integer> ht = new ArrayList<Integer>();

        for(int i=0;i<noOfTrees;i++)
        {
            ht.add(s.nextInt());
        }
        for(int h: ht) {

            System.out.println(growthInEachCycle(h));
        }
        s.close();
    }

}
