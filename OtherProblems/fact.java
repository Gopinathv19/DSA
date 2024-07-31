public class fact{
    public static void main(String[] args) 
    {
       System.out.println(fact1(5));
    }
    public static int fact1(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return n*fact1(n-1);
        }
    }

}