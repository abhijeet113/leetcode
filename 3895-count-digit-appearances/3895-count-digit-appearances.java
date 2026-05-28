class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String a = "";
        for(int i : nums){
            a+=i;
        }
        int count=0;
        for( int i=0;i<a.length();i++){
            if(a.charAt(i)-'0'==digit){
                count++;
            }
        }
        return count;
    }
}