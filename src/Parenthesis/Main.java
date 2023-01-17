package Parenthesis;
public class Main {

    static long findDigits(long n)
    {
        long s=0;
        // Changing number to String
        for(int x=0;x<=n;x++) {
            s+=countDig(x);
        }

        // add length of number to  total_sum
        return s;
    }
    public static int countDig(int n)
    {
        int count = 0;
        while(n != 0)
        {
// removing the last digit of the number n
            n = n / 10;
// increasing count by 1
            count = count + 1;
        }
        return count;
    }
    public static void main(String[] args)
    {
        long n = 1000000;
        System.out.println(findDigits(n));
    }
}