Two pointer Approach:


Rotating an array 


class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }


      public void rev(int []nums,int a,int b){
           while(a<b){
           int t=nums[a];
           nums[a]=nums[b];
           nums[b]=t;
           a++;
           b--;
       }
      }
       
       
    
}