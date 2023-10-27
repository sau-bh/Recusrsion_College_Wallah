public class Keypad_Combination {
    public static void main(String[] args) {
        
        String str = "23";
        String kp []={"","","abc","def","ghi","jkl","mno","pqrs","tuv" ,"wxyz"};
       
        kc(str, kp, " ");
    }

    static void kc(String str , String[] kp ,String res ){
      
        if(str.length()==0){
            System.out.print(res + " ");
            return;
        }

        int CurrNumber = str.charAt(0)-'0';
        String currChoices = kp[CurrNumber];

        for(int i =0;i<currChoices.length();i++){
            kc(str.substring(1), kp, res + currChoices.charAt(i));
        }

       
    }
}
