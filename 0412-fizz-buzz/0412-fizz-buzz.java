class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> al = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(i%3==0 && i%5==0)
                al.add("FizzBuzz");
            else if(i%5==0)
                al.add("Buzz");
            else if(i%3 == 0)
                al.add("Fizz");
            else{
                String s = Integer.toString(i);  
                al.add(s);
            }
        }
        return al;
        
    }
}