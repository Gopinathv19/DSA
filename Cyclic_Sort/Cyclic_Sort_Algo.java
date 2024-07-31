package Cyclic_Sort;

import java.util.Arrays;

public class Cyclic_Sort_Algo {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(CyclicSort(arr)));
    }
    static int[] CyclicSort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]){
                changer(arr,i,correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }

    private static void changer(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }


}
