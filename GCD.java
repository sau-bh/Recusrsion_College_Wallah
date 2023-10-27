// public class GCD {
//     public static void main(String[] args) {
//         System.out.println(gcd( 12,16 ));
        
//     }

//     static int gcd(int x , int y ){
//        for(int i =x;i>0;i--){
//         if(x%i ==0 && y%i ==0){
//             return i;
//         }
//        }
//        return -1;

//     }
// }

// public class GCD {
//     public static void main(String[] args) {
//         System.out.println(gcd( 25,10 , 10 ));
        
//     }

//     static int gcd(int x , int y , int k){
//       if(x % k ==0 && y% k==0){
//         return k;
//       }
      

//       return gcd(x , y ,k-1 );
//     }
// }



// public class GCD {
//     public static void main(String[] args) {
//         System.out.println(gcd( 11,7));
        
//     }

//     static int gcd(int x , int y ){
//         while(x%y!=0){
//             int rem =x%y;
//             x=y;
//             y=rem;
//         }

//         return y;
     
//     }
// }


public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd( 11,7));
        
    }

    static int gcd(int x , int y ){
       if(y==0){
        return x ;

       }

       return gcd(y , x%y);
     
    }
}