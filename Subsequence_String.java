// import java.util.ArrayList;

// public class Subsequence_String {
//     public static void main(String[] args) {
//         String str = "abc";
//         System.out.println(sub(str));
//     }

//     static ArrayList<String > sub(String str){
//         ArrayList<String>  ans  = new ArrayList<>();
//         if(str.length()==0){
//             ans.add(" ");
//             return ans;

//         }
//         char curr = str.charAt(0);

//         ArrayList<String > smallans = sub(str.substring(1));
//         for(String ss : smallans){
//             ans.add(ss);
//             ans.add(curr + ss);

//         }
//         return ans;
//     }
// }

import java.util.ArrayList;

public class Subsequence_String {
    public static void main(String[] args) {
        String str = "abc";
sub(str ," ");
    }

    static void sub(String str , String currAns){
       
        
        if(str.length()==0){
            
            System.out.println(currAns);
            return;
           
    }
        char ch = str.charAt(0);

        String remAns = str.substring(1);
        sub(remAns , currAns + ch);
        sub(remAns , currAns);

       
       
       
        
    }
}

