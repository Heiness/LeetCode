class Solution {
    public boolean isPalindrome(String s) {
        char[] cs = s.toLowerCase().toCharArray();
        int i=0;
        int j=cs.length-1;

        while(i<j){
            if(!Character.isLetterOrDigit(cs[i])) i++;
            else if(!Character.isLetterOrDigit(cs[j])) j--;
            else if(cs[i++]!=cs[j--]) return false;
        }
        return true;
    }
}