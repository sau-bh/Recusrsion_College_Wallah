public class Frog_Jump {
    public static void main(String args[]){
        int[] arr = {10,30,40,20};
        System.out.println(frog(arr ,0));

    }
    static int frog(int[] arr , int idx){
        if(idx==arr.length-1) return 0;
        int op1 = Math.abs(arr[idx]-arr[idx+1]) + frog(arr, idx+1);
        if(idx==arr.length-2) return op1;
        int op2 = Math.abs(arr[idx]-arr[idx+2]) + frog(arr, idx+2);

       


        
        
        return Math.min(op1,op2);
    }
    
}


