class Solution {
    public String findLongestWord(String s, List<String> d) {
        
        String word  = "";
        
        for(int i = 0; i < d.size(); i++){
            int count =0; 
            
            int j = 0; 
            int k = 0; 
            
            while(j < s.length() && k < d.get(i).length()){
                if(s.charAt(j) == d.get(i).charAt(k)){
                    count++;
                    k++;
                }
                j++;
            }
            
            if(count == d.get(i).length() && count >= word.length()){
                
                if(word.length() == 0){
                    word = d.get(i);
                }
                else{
                    
                    if(word.length() == d.get(i).length()){
                        if(d.get(i).compareTo(word) < 0){
                            word = d.get(i);
                        }
                    }
                    else{
                        word = d.get(i);
                    }
                    

                }
                
            }
            
        }
        
        return word;
    }
}