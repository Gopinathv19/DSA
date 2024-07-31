public class maxfinderinarrary {
     int max ;
     int maxfinding(int[]arr)
       {
        max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]> max){
            max=arr[i];
           
        }
    }
    return max;
}
    public static void main(String[] args)
     {
       int[] arr={200,2,34,4,5,6};
       maxfinderinarrary a=new maxfinderinarrary();
       System.out.println(a.maxfinding(arr));
 
    
    }
 
}
