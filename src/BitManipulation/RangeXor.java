package BitManipulation;

public class RangeXor {

    public static void main(String[] args) {

        int a = 3;
                    // a and b are range
        int b = 9;
        int result = exor(b) ^ exor(a-1);
        System.out.println("Xor of all elements between this a and b  : "+ result);
    }

    static int exor(int a){

        if(a%4==0)
        {
            return a;
        }
        if(a%4==1)
        {
            return 1;
        }
        if(a%4==2)
        {
            return a+1;
        }
        return 0;
    }
}
