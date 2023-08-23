class Solution {
    public int balancedStringSplit(String s) {
        int cR = 0, cL = 0, cnt=0;
        char arr[] = s.toCharArray();
        for(int i : arr)
        {
            if(i == 'R'){
                 cR++;
            }else if(i == 'L'){
                cL++;
            }
            
            if(cR == cL){
                cnt++;
                cR = 0;
                cL = 0;
            }   
        }
        
        return cnt;
    }
}