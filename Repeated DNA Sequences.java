class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i <= s.length() -10; i++){
            
            String sub = s.substring(i, i+10);
            if(map.containsKey(sub)){
                int count = map.get(sub);
                count++;
                map.put(sub, count);
            }
            else{
                map.put(sub, 1);
            }
        }
        
        List<String> retList = new ArrayList<String>();
        
        for(String entry : map.keySet()){
            if(map.get(entry) > 1){
                retList.add(entry);
            }
        }
        
        return retList;
    }
}