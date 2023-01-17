package Palindrome;
public class Palindrome{
    int num;
    int rvsnum;
    public Palindrome(int x)
    {
        num=x;

    }
    public boolean PalindromeCheck()
    {
        if(Math.abs(num)!=num)
            return false;
        Reversenum(num);
        if(num/rvsnum==1)
            return true;
        return false;
    }
    public int Reversenum(int number)
    {
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            rvsnum = rvsnum * 10 + remainder;
        }
        return rvsnum;
    }


}
