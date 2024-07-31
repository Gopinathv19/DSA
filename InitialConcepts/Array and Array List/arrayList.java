
import java.util.*;
public class arrayList {
    public static void main(String[] args) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }
        System.out.println(list); 
        in.close();  
    }
}
// Size was fixed internally
// say arraylist is fills by some amount , it will create a new arraylist of doubled the size of the old arraylist 
// then the element in the old array list is copied in that newly created arraylist