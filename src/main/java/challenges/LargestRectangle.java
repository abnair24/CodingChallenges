package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) throws Exception {
        LargestRectangle r = new LargestRectangle();
        List<Integer> histo= new ArrayList<Integer>();
        histo =r.getStringFromConsole();

        System.out.println(r.getMaxArea(histo,histo.size() ));

    }

    public int getMaxArea(List<Integer> hist, int n)
    {

        Stack<Integer> s=new Stack<Integer>();


        int max_area = 0;
        int tp;
        int area_with_top;

        int i = 0;
        while (i < n)
        {
            if (s.empty() || hist.get(s.peek())<= hist.get(i))
                s.push(i++);
            else
            {
                tp = s.peek();  // store the top index
                s.pop();  // pop the top
                area_with_top = hist.get(tp) * (s.empty() ? i : i - s.peek() - 1);
                if (max_area < area_with_top)
                {
                    max_area = area_with_top;
                }
            }
        }

        while (!s.empty())
        {
            tp = s.peek();
            s.pop();
            area_with_top = hist.get(tp) * (s.empty() ? i : i - s.peek() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;
    }

    public List<Integer> getStringFromConsole() throws Exception {

        Scanner s = new Scanner(System.in);
        List<Integer>ht = new ArrayList<Integer>();

        while(s.hasNextInt())
        {
            ht.add(s.nextInt());
        }

        return ht;

    }
}
