// public class RemoveA {
//     public static void main(String[] args) {
//         String s ="abcax";
//         System.out.println(remove(s));
        
//     }

//     static String remove(String s ){

//         String ss = "";
//         for(int i =0;i<s.length();i++){
//             char ch =s.charAt(i);
//             if(ch!='a'){
//                 ss+=ch;


//             }
//         }
//         return ss;

//     }
// }

public class RemoveA {
    public static void main(String[] args) {
        String s ="abcax";
        System.out.println(remove(s,0));
        
    }

    static String remove(String s,int idx ){
        String ans="";

        if(idx==s.length()){
            return ans;
        }
        if(s.charAt(idx) !='a'){
            ans+=s.charAt(idx);
        }

        String smallans = remove(s, idx+1);
         return ans + smallans;
    }
}

