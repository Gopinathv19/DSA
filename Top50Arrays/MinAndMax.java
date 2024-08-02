package Top50Arrays;//{ Driver Code Starts
// Initial Template for Java

import java.lang.*;


record Pair<K, V>(K key, V value) {
}



class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        long max=arr[0];
        long min=arr[0];
        for(int i=1 ; i< arr.length ; i++)
        {
            if (arr[i]>max)
            {
                max=(long)arr[i];
            }
            if(arr[i]<min)
            {
                min=(long)arr[i];
            }
        }
        return new Pair<>(min,max);
    }
}