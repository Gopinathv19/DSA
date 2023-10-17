public class nanturalnumbers{
    public void add(int n){
        if(n==0){
            
        }
        else{
            add(n-1);
            System.out.println(n+" ");
        }
    }
    public static void main(String[] args){
        nanturalnumbers obj=new nanturalnumbers();

       obj. add(10);
    }
       
}