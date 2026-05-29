class Solution {
    public int minElement(int[] nums) {
        int mn=Integer.MAX_VALUE;
        for( int i : nums){
            String a = i+"";
            int k =0;
            for( int j=0;j<a.length();j++){
                k+=(a.charAt(j)-'0');
            }
            mn=Math.min(k,mn);
        }
        return mn;
    }
}