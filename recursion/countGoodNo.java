package recursion;

public class countGoodNo {

    static boolean isGood(int i,int [] arr){
        if(i>arr.length-1){
            return true;
        }
        boolean goodChecker=false;
        if(i%2==0){
            if(arr[i]%2==0){
                goodChecker=true;
            }
        }
        else{
             goodChecker= isPrime(arr[i]);
        }

        return goodChecker && isGood(i+1,arr);
    }

    static boolean isPrime (int n){
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        if(n<=1){
            return false;
        }
        for(int i=3 ; i< Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int [] arr = {2,5,8,2};
        System.out.println(isGood(0,arr));
    }
}
