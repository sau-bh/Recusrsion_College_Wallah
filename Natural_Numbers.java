class Natural_Numbers{
    public static void main(String args[]){
        System.out.println("Hi");
        pI(5);
        System.out.println("BIiii");
       
        
    }
     public static  int pI(int n){
            if(n==1){
                System.out.println(1);
                return 1;
            }
            System.out.println(n);
            pI(n-1);
            
            return n;

        }
}