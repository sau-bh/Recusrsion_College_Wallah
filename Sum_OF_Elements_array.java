public class Sum_OF_Elements_array {
    public static void main(String[] args) {
        int [] arr = {100};
       System.out.print( sum (arr , 0));
    }

    static int sum(int [] arr , int idx){
        
        if(idx==arr.length-1){
            return arr[idx];

        }
        if(idx==arr.length){
            return 0;
        }

        return arr[idx]+sum(arr,idx+1);
    }
}
