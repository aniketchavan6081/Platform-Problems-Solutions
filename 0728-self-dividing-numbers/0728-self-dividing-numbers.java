class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            int temp = i;
            int cnt = 0;

            while(temp!=0){
                int len = String.valueOf(i).length();
                int rem = temp%10;
                temp /= 10;
                if(rem == 0){
                    continue;
                }
                
                if(i%rem == 0){
                    cnt++;
                }
                
                if(cnt == len){
                    ans.add(i);
                } 

            }
        }
        return ans;
    }
}