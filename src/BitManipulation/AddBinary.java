package BitManipulation;

public class AddBinary {

    public static void main(String[] args) {
        binadd ob = new binadd();
       String ans =  ob.addBinary("1011","1101");
        System.out.println(ans);

    }


}
class binadd
{
    public String addBinary(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1)
        {
            if(i >= 0)
                carry += a.charAt(i--) - '0';
            if(j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}