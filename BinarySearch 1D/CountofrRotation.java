public class CountofrRotation {
    public static void main(String[] args) {
   int[]arr ={15,18,2,3,6,12};
        System.out.println(pivot(arr)+1);
    }
   /*
   static  int reccurencecounter(int[]arr){       //think wise
        int count=0;
        int n=pivot(arr);
        int newn=n;
        if(pivot(arr)==-1){
             return -1;
         }
         else{
             while(arr[n+1]<arr[newn]&&newn>=0){
                  count++;
                  newn--;
             }
         }
         return count;
    }*/
    static int pivot(int[]arr){
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]>arr[mid+1])
           {
               return mid;
           }
           if(arr[mid-1]>arr[mid]){
               return mid-1;
           }
           if(arr[start]>=arr[mid]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
       }
       return -1;
    }
}
