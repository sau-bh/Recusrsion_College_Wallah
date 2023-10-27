public class Sum_Of_Integer {
    public static void main(String args[]){
        int n =531123;
       System.out.println( sumof(n));


    }

    static int sumof(int n ){
        if(n>=0 && n<=9){
            return n;

        }
        return  sumof(n/10)+ n%10 ;
        

    }
}
