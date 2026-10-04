class Solution {
    public boolean isSubsequence(String s, String t) {
        Integer leftBound = s.length(),rightBound = t.length();
        Integer pLeft=0,pRight=0;

        while(pLeft<leftBound && pRight<rightBound){
            if(s.charAt(pLeft)==t.charAt(pRight)){
                pLeft++;
            
            }

            pRight++;
        }

        return pLeft==leftBound;

    }
}