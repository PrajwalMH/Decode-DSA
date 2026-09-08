class Solution {
    public int countCommas(int n) {
        int result=0;
        for(int i=0;i<=n;i++){
            if(i>999){
                result+=1;
            }
        }
        return result;
    }
}