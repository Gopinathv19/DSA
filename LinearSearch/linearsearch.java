// search is something to search inside an array.
// start searching from start of an array until you got a search element.
// best case o(1) when element is found at very first position.
// worst case : when the element is not found means if the size of the array is 100k then the comparision takes here is 100k.
/*public class linearsearch
{
    public static void main(String[] args) 
    {
        int[] arr={0,1,2,3,4,200,6,7,8,9};
        System.out.println(searcher(arr, 2000));
        

    }
    static int searcher (int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element =arr[i];
            if(element ==target)
            {
                return i;
            }
              
        }
        return -1;
    }
}*/

// linear search in strings 
/*import java.util.Arrays;
public class linearsearch
{
public static void main(String[] args)
{
    String str="gopinath";
    char target='a';
    System.out.println(Arrays.toString(str.toCharArray()));
    System.out.println(searcher(str,target,2,5));
    
}
static boolean searcher(String str, char targrt,int start,int end)
{
    if(str.length()==0)
    {
        return false;
    }
    for(int i=start;i<=end;i++)
    {
        if(targrt==str.charAt(i))
        {
return true;
        }
    }
    return false;
}
}*/
