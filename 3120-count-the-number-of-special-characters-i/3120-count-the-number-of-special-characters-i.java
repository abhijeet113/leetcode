class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet <Character> hs = new HashSet<>();
        char [] arr =word.toCharArray();
        for(char c : arr){
            hs.add(c);
        };
        int count=0;
        for(char c : arr){
            char lower = Character.toLowerCase(c);
        char upper = Character.toUpperCase(c);
            if(hs.contains(lower)&&hs.contains(upper)){
                count++;
                hs.remove(lower);
                hs.remove(upper);
            }
        }
        return count;
    }
}