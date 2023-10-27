// public class SquareOfNumber {
//     public static void main(String args[]){
//         System.out.println(mult(3,3));

//     }
//     static int mult(int n , int sq){
//         if(sq==1){
//             return n;
//         }
//         return n* mult(n,sq-1);

//     }
// }

public class SquareOfNumber {
    public static void main(String args[]){
        System.out.println(mult(3,3));

    }
    static int mult(int n , int sq){
       if(sq==1){
        return n;
       }

       if(sq % 2 ==0){
        return mult(n ,sq/2) * mult(n,sq/2);
       }

       return  n * mult(n ,sq/2) * mult(n,sq/2);

    }
}
