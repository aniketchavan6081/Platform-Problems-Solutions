class Solution {
    public String capitalizeTitle(String title) {
       StringBuilder sb = new StringBuilder();
        for(String s : title.toLowerCase().split(" ")){
            if(s.length() > 2){
                sb.append(s.substring(0,1).toUpperCase()).append(s.substring(1)).append(" ");
            }                
            else {
                sb.append(s).append(" ");
            }
        }
        return sb.toString().trim();
    }
}