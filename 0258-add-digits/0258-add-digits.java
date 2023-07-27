class Solution {
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        
        int sum = 0;
        int temp = 0;
        do{
            while(num!=0){
                sum += num%10; // 8 11
                num /= 10; // 3 0
            }
            temp += sum%10; // 1 2
            sum /= 10;  // 1 0
        }while(sum != 0);
        switch(temp){
            case 10: return 1;
            case 11: return 2;
            case 12: return 3;
            case 13: return 4;
            case 14: return 5;
            case 15: return 6;
            case 16: return 7;
            case 17: return 8;
            case 18: return 9;
            default: return temp;
        }
    }
}