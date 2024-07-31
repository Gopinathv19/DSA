package mypatterns;

public class plusPattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==n/2+1||col==n/2+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\lib\idea_rt.jar=63709:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\gopin\OneDrive\Desktop\Gopinath\TopDSA's\out\production\TopDSA's" mypatterns.plusPattern
    *
    *
* * * * *
    *
    *

Process finished with exit code 0

 */