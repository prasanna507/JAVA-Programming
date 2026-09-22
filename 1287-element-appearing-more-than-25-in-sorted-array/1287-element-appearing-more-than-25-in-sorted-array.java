class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=1;
        int max=1;
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            
            }
            else{
                if(count>max){
                    max=count;
                    m=arr[i-1];
                    count=1;
                }
                count=1;
            }
        }
          if (count > max) {
            m = arr[arr.length - 1];
        }
        return m;
    }
}