package recursion;

public class binaryExponention {

    static int  pow(int x , int n,int[] ans){
        if(n==0){
            return 1;
        }
        if(n%2==1){
            ans[0]*=x;
            return ans[0]* pow(x,n-1,ans);
        }
        else if(n%2==0){
            x=x*x;
            return pow(x,n/2,ans);
        }
        return 1;
    }
    public static  void main(String[] args){
        int [] ans = {1};
        int answer = pow(3,2,ans);
        System.out.println(ans[0]);
    }
}
