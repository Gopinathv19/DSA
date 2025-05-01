package patterns;

public class fullTriangle {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int space=0;space<=n-i;space++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print(i);
            }
            else{
                int val=i;
                for(int j=1;j<=i+(i-1);j++){
                    if(val>1){
                        System.out.print(val);
                        val--;
                    }

                }
            }
            System.out.println();
        }
    }
}
