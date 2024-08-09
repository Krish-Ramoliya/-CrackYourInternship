package BitManipulation;
import java.util.*;

public class FlipImage {

    public static void main(String[] args) {

        int [][] nums = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        reverseandxor ob = new reverseandxor();
        ob.flipAndInvertImage(nums);
    }


}
class reverseandxor{

    public void flipAndInvertImage(int[][] image) {

        for(int[] row : image)
        {
            for(int i = 0;i<(image[0].length+1)/2;i++)
            {
                int temp = row[i] ^ 1 ;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;

            }
        }

        for(int[] row : image)
        {
            for(int i =0;i<image[0].length;i++)
            {
                System.out.print(row[i]);
            }
            System.out.println("\n");
        }


    }
}