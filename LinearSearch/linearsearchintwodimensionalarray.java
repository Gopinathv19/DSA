public class linearsearchintwodimensionalarray
{
    public static void main(String[] args)
     {
        int[][] arr={{1,2,3,4},{69,46,66},{36,378}};
        int target=46;
        System.out.println(searcher(arr,target));
        int min=Integer.MIN_VALUE;
        System.out.println(min);
    }
    static int[] searcher(int[][]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr[i].length;j++)
          {
            if(arr[i][j]==target)
            {
                int[]a=new int[]{i,j};
                return a;
            }
          }
    }
    return new int[]{-1,-1};
}
}