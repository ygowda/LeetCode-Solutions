class Solution {
    public int countBattleships(char[][] board) {
        
        int i = 0; 
        int j = 0; 
        int count = 0;
        
        while(i < board.length){
            j = 0;
            while(j < board[0].length){
                
                if(board[i][j] == 'X'){

                    
                    	if(i==0){
                    		count++;
                    	}
                    	else if(i > 0 && board[i-1][j] != 'X'){
                            count++;
                        }  
                    	
                        while(j < board[0].length && board[i][j] == 'X'){
                            j++;
                        }
                        j--;
                    
                }
                j++;
            }
            i++;
        }
        
        return count;
    }
}