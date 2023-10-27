public class Print_Array {
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6};
        // int n = arr.length;
        Print(arr ,0);

    }


    // static void Print(int[] arr ,int n){
    //     if(n==-1){
    //         // System.out.print(arr[n] + " ");
    //         return;

    //     }


    //     Print(arr, n-1);
    //     System.out.print(arr[n] + " ");

    // }

     static void Print(int[] arr ,int idx){
        if(idx == arr.length ){
            // System.out.print(arr[n] + " ");
            return;

        }

        System.out.print(arr[idx] + " ");

        Print(arr,idx+1);
        

    }
}
