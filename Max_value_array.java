public class Max_value_array {
    public static void main(String[] args) {
        int arr[] = {-3,-4,-6};
        System.out.println(maxx(arr ,0));
    }

    public static int maxx(int[] arr , int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        return Math.max(maxx(arr ,idx+1) , arr[idx]);
    }
}
