class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> al = new ArrayList<>();
        for(int i = 0; i < words.size(); i++)
        {
            String a[] = words.get(i).split("[" + separator + "]");
            for(int j = 0; j < a.length; j++)
            {
                
                if(a[j].length() > 0)
                {
                    al.add(a[j]);
                }
            }
        }
        return al;   
    }
}