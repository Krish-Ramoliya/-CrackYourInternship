package Backtracking;

import java.util.Arrays;

public class FindingPath {

    public static void main(String[] args) {
        boolean[][] maze ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        printpath("",maze,0,0,path,1);
    }

    private static void printpath(String p, boolean[][] maze, int r, int c, int[][] path, int step) {

        if(r==maze.length-1&&c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        // I am considering this block in my path

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1 )
        {
            printpath(p+'D',maze,r+1,c,path,step+1);
        }
        if(c < maze[0].length-1){
            printpath(p+'R',maze , r , c+1,path,step+1);
        }
        if(r>0)
        {
            printpath(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0)
        {
            printpath(p+'L',maze,r,c-1,path,step+1);
        }

        // line where function is over
        // so before the function gets removed , also remove the changes that were  made in the function
        maze[r][c]=true;
        path[r][c]= 0;
    }
}
