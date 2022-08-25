package dynamicProg;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	
	static String A="myinterviewtrainer";
	static String[] B= {"interview", "my", "trainer"};
	
	static Set<String> s=new HashSet<>();
	
	
	
	public static void main(String[] args) {
		for(int i=0;i<B.length;i++){
	        s.add(B[i]);
	    }
		//System.out.println("is valid word"+isValidWord("trainer"));
		System.out.println("result: " + iwb(A, B)); 
	}
	
	private static boolean iwb(String A,String[] B){

        int la=A.length();

        boolean[] dp=new boolean[la+1];
        dp[la]=true;

        for(int i=la-1;i>=0;i--){
            for(int j=i;j<la;j++){
                if(isValidWord(A.substring(j,la)) && dp[j+1]){
                    dp[i]=true;
                    break;
                }else{
                    dp[i]=false;
                }
            }
        }
        
        for(int i=0;i<=la;i++) {
        	System.out.println(dp[i]);
        }

        return dp[0];

    }

	
	private static boolean isValidWord(String str){

        if(s.contains(str)){
            return true;
        }
        return false;
    }


}
