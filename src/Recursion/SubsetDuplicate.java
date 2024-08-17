package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetDuplicate {

    public static void main(String[] args) {

        int arr[] = {4,4,4,1,4};
        List<List<Integer>> op = Dupliactesubset(arr);

        for(List<Integer> list : op)
        {
            System.out.println(list);
        }
    }

    static List<List<Integer>> Dupliactesubset (int arr[])
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0 ;
        int end = 0;

        for(int i = 0 ;i< arr.length ;i++)
        {
            start = 0;
            if(i>0  && arr[i] == arr[i-1])
            {
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j = start;j<n;j++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
