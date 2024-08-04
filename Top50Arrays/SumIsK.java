package Top50Arrays;

import java.util.HashMap;

public class SumIsK {
    public static void main(String[] args) {

        int [] arr={1,5,7,1,5};
        int k=6;
        int n=arr.length;
        System.out.println(solution1(arr,n,k) +"\n");
        System.out.println(solution2(arr,n,k) +"\n");


    }
    public  static  int solution1(int[] arr,int n , int k)
    {
        int res=0;
        HashMap<Integer,Integer> freqMap= new HashMap<>();
        for(int i=0;i<n;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                continue;
            }
            int secondVal=k-arr[i];
            if(freqMap.getOrDefault(secondVal,0)>0){
                res+=freqMap.get(secondVal);
                freqMap.put(arr[i],freqMap.get(arr[i])-1);
            }
            if(arr[i]==secondVal){
                res-=1;
            }
        }
        return res;
    }
    public  static  int solution2(int[] arr,int n , int k){
        int res=0;
        HashMap<Integer,Integer> freqMap= new HashMap<>();
        for(int i=0;i<n;i++){
            int secondVal=k-arr[i];
            res+=freqMap.getOrDefault(secondVal,0);
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        return res;
    }
}
