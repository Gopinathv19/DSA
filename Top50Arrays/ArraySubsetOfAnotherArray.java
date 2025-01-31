package Top50Arrays;

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {

    public static void main(String[] args) {

        int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int a2[] = {11, 3, 7, 1, 7};
        System.out.println(isArraySubset(a1,a2));
    }

    public static String isArraySubset(int[] arr1, int[] arr2){
        HashMap<Long,Integer> FreqMap = new HashMap<>();
        for(long element:arr1){
             FreqMap.put(element,FreqMap.getOrDefault(element,0)+1);
        }
        for(long element : arr2){
            if(FreqMap.containsKey(element) && FreqMap.get(element)>0){
                FreqMap.put(element,FreqMap.get(element)-1);
            }else{
                return "No";
            }
        }


        return "Yes";
    }
}
