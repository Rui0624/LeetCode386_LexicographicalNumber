import java.util.ArrayList;

public class Solution {
	public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        int cur = 1;
        for(int i = 0; i < n; i++){
        	res.add(cur);
        	if(cur * 10 <= n){
        		cur *= 10;
        	}else{
        		if(cur >= n)
        			cur /= 10;
        		cur++;
        		while(cur % 10 == 0)
        			cur /= 10;
        	}
        }
        
        return res;
    }
}
