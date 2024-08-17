package Backtracking;

public class MazewithBT {

    public static void main(String[] args) {
        boolean[][] maze ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        findpath("",maze,0,0);

    }

    static void findpath(String p , boolean maze[][] , int r , int c){

        if(r==maze.length-1&&c==maze[0].length-1){

            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        // I am considering this block in my path

        maze[r][c] = false;
        if(r < maze.length-1 )
        {
            findpath(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            findpath(p+'R',maze , r , c+1);
        }
        if(r>0)
        {
            findpath(p+'U',maze,r-1,c);
        }
        if(c>0)
        {
            findpath(p+'L',maze,r,c-1);
        }

        // line where function is over
        // so before the function gets removed , also remove the changes that were  made in the function
        maze[r][c]=true;
    }
}
