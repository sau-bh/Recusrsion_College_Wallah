import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        
   

        
       System.out.println(subseq(s) );

        
    }

    static ArrayList<String> subseq(String s  ){
       ArrayList<String> ans = new ArrayList<>();

        if(s.length()==0){
             ans.add("");
             return ans;

        }
        

        char current = s.charAt(0);
        ArrayList<String > smallans = subseq(s.substring(1));

        for(String ss : smallans){
            ans.add(ss);
            ans.add(current + ss);
        }

        return ans;


        

    }
    
}
