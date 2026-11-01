class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        int original[] = new int[26];

        for(Character c : s.toCharArray()){
            original[c-'a'] +=1;
        }

        for(Character c: t.toCharArray()){
            original[c-'a'] -=1;
        }

        for(int c : original){
            if(c != 0){
                return false;
            }
        }
        return true;

    }
}
