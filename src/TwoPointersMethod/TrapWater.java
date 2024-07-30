package TwoPointersMethod;

public class TrapWater {

    public static void main(String[] args)
    {
        int []num={0,2,0,3,1,0,1,3,2,1};
        water ob = new water();
        int result = ob.trap(num);
        System.out.println("Max area :"+result);
    }
}
class water {

    public int trap(int[] height) {

        int maxarea=0;
        int n = height.length;
        int[] left= new int[n];
        int[] right = new int[n];
        left[0]=height[0];
        right[n-1]=height[n-1];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
        {
            maxarea=maxarea+(Math.min(left[i],right[i])-height[i]);
        }
        return maxarea;
    }

}





/*  public int trap(int[] height) {


        int prev;
        int next;
        int maxarea = 0;
        for(int i = 0;i<height.length;i++)
        {
            if(height[i]==0&&(i-1>0&&i+1<height.length))
            {
                prev = i-1;
                next = i+1;
                int left = 0;
                int right = height.length-1;

                while(prev>=0&&next<height.length-1)
                {
                    if(height[prev]!=height[next])
                    {
                        maxarea = maxarea + Math.min(height[prev],height[next]);
                    }
                }

                else{
                    while((prev<prev-1||next>next=0)&&(prev>0&&next<height.length))
                    {
                        if(height[prev]==height[next])
                        {
                            maxarea = maxarea + (next-prev-1)*(height[prev]-height[prev+1]);
                            prev--;
                            next++;
                        }
                        else{

                            maxarea = maxarea + (next-prev-1)*((Math.min(prev,next))-height[prev+1]);
                            prev--;
                            next++;
                        }

                    }
                }

            }
        }

        return maxarea;
    }

 */