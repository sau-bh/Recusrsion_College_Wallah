class Multiples_ofNum{
    public static void main(String args[]){
        int n =12;
        int k =5;
       
        sequence(  n , k);
    }
    static void sequence(int n , int k){
        if(k==0){
            return ;
    
        }

        sequence( n, k-1);
        System.out.print( n*k + " ");
    

    }
}