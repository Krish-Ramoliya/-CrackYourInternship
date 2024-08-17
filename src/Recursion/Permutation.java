package Recursion;

public class Permutation {

    public static void main(String[] args) {
        permutation("","abc");
    }

    static void permutation(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i =0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());
            permutation(f + ch + e,up.substring(1));
        }
    }
}
