package Recursion;

public class SubSeq {

    public static void main(String[] args) {
        subseq("","abc");
        String s[]={"sd","sd"};
        System.out.println(s.length);
    }
    static void subseq(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }
}

