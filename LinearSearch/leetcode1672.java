
//https://leetcode.com/problems/richest-customer-wealth/description/
class Solution {
 int maximumWealth(int[][]accounts){
     int ans=0;

     for(int i=0;i<accounts.length;i++){
         int sum=0;
         for(int j=0;j<accounts[i].length;j++){
             sum+=accounts[i][j];
         if(sum>ans){
             ans=sum;
         }

         }

     }
     return ans;
 }
}

public class leetcode1672
{
 public static void main(String[] args) 
{
    int[][]accounts = {{1,2,3},{3,5,1}};
    Solution a =new Solution();
    System.out.println(a.maximumWealth(accounts));

 }
}
