//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class leetcode1295 {
    public static void main(String[] args) 
    {
       int[] array={1,12,234,25,67,87};
       System.out.println(answer(array) );
    }
 
        static int answer(int[] array)
    {
        int count =0;
        for(int num:array)
        if(numeven(num))
        {
            count++;
        }
        return count;
    }
    static Boolean numeven(int num)
    {
        if(checker(num)%2==0)
        {
            return true;
        }
        return false;
    }
    static int checker(int num)
    {   int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }
}     
   


