import java.util.*;
class Solution {
    public static void main(String[] args) {
        int[] arr={3,-3,4,1,6,6};
        Arrays.sort(arr);
        int[] count=new int[arr.length];
        int j=0;
        count[j]=1;
        for(int i=0;i<arr.length-1;i++)
        {
          
            if(arr[i]==arr[i+1])
            {
             count[j]++;
            }
              System.out.println(count[j]);
        j++;
       count[j]=1;
        }
        Arrays.sort(count);
      
/* 
        for(int i=0;i<count.length-1;i++)
        {
            if(count[i]!=count[i+1])
            {
                return true;
            }
        }
        return false;*/
    }
}
