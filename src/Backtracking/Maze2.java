package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze2 {

    // printing path of 3X3 maze
    public static void main(String[] args) {
        path("",3,3);
        System.out.println("Result By Returning the ArrayList : ");
        List<String> ans = pth("",3,3);
        for(String result : ans){
            System.out.println(result);
        }
    }

    static void path(String p , int r , int c)
    {
        if(r==1&&c==1)
        {
            System.out.println(p);
        }

        if(r>1)
        {
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }

    }

    static ArrayList<String>  pth(String p , int r , int c){

        if(r==1&&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
             list.addAll(pth(p+'D',r-1,c));
        }
        if(c>1)
        {
             list.addAll(pth(p+'R',r,c-1));
        }

        return list;
    }
}
