// public class Palindrome_String {
//     public static void main(String[] args) {
//         String s ="abcba";
//         System.out.println(Palindrome(s));

//     }

//     static boolean Palindrome(String s){
//         int i =0;
//         int j =s.length()-1;
//         while(i<j){
//             if(s.charAt(i)==s.charAt(j)){
//                 i++;
//                 j--;
//             }
//             else {
//                 return false;
//             }
//         }
//         return true;
//     }
    
// }


// public class Palindrome_String {
//     public static void main(String[] args) {
//         String s ="abcba";
//         System.out.println(Palindrome(s));
//     //    System.out.println( reverse(s, 0));

//     }
//     static boolean Palindrome(String s){
//         String ans = reverse(s, 0);
//     //    for(int i =0;i<s.length();i++){
//     //     if(s.charAt(i)!=ans.charAt(i)){
//     //         return false;
//     //     }
//     //    }
//     //    return true;
//    if(ans.equals(s)){
//     return true;
//    }
//    return false;
//     }

//     static String  reverse (String s , int idx){
//        if(idx==s.length()){
//         return "";
//        }

//        String smallans = reverse(s ,idx+1);

//        return smallans + s.charAt(idx);
//     }
    
// }


public class Palindrome_String {
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(Palindrome(s , 0 , s.length()-1));
    

    }
    static boolean Palindrome(String s, int i , int j  ){
        if(i>j){
            return true;
        }

        if(s.charAt(i)==s.charAt(j)){
             return Palindrome(s , i+1 , j-1);
        }

        return false;
        

  
    
}
}

