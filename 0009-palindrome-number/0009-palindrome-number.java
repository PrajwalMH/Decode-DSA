class Solution {
    public boolean isPalindrome(int x) {
        int digits=0;// this is to count how many integers/digits are there
        int y=x;
        while(y>0){
            y/=10;
            digits+=1;
        }
        int g=0;//reversed number
        y=x;
        for(int i=0;i<digits;i++){
            g=g*10+(y%10);
            y/=10;
        }
        
        if(x==g){
            return true;
        }
        return false;

    }
}