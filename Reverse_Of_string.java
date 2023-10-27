// class Reverse_Of_string{
//     public static void main(String[] args) {
//         String s = "saurabh";
//         System.out.println(reverse(s, 0));

//     }
//     public static String reverse(String s, int idx){

//         String ans="";
//         if(idx==s.length()){
//             return ans;
//         }

//         ans = reverse(s, idx+1)+s.charAt(idx);
//         return ans;
//     }
// }

class Reverse_Of_string{
    public static void main(String[] args) {
        String s = "saurabh";
        System.out.println(reverse(s));

    }
    public static String reverse(String s){

    
        if(s.length()==0){
            return "";
        }

       String smallans = reverse(s.substring(1));
        return smallans + s.charAt(0);
    }
}

// class Reverse_Of_string{
//     public static void main(String[] args) {
//         String s = "saurabh";
//         System.out.println(reverse(s, 0));

//     }
//     public static String reverse(String s, int idx){

//       String ans="";
//       for(int i =s.length()-1;i>=0;i--){
//         char ch = s.charAt(i);
//         ans+=ch;

//       }
//       return ans;
//     }
// }