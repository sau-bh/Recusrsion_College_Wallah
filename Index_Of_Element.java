import java.util.ArrayList;


class Index_Of_Element{
    public static void main(String[] args) {
        int [] arr ={4,12,54,14,54,8,54,54};
        int n = arr.length;
        int x = 54;
        ArrayList<Integer> ans =new ArrayList<>();
        targetInd(arr,ans, n, x, 0);
        System.out.println(ans);
    }

    // static int targetInd(int arr[] , int n , int x , int idx){
    //     if(idx==n){
    //         return -1;
    //     }

    //     if(arr[idx]==x){
    //         return idx;
    //     }
        

    //     return targetInd(arr, n, x, idx+1);
    // }

    // static void targetInd(int arr[] , int n , int x , int idx){
    //     if(idx==n){
    //         // System.out.println("Element is not present");
    //         return ;
    //     }

        
    //     if(arr[idx]==x){
    //         System.out.print(idx + " ");
            
    //     }
    //      targetInd(arr, n, x, idx+1);

        
    // }

     static ArrayList<Integer> targetInd(int arr[] ,ArrayList<Integer> ans,  int n , int x , int idx ){
        if(idx==n){
            // System.out.println("Element is not present");
            return ans ;
        }
         if(arr[idx]==x){
            ans.add(idx);
    }
        return  targetInd(arr,ans, n, x, idx+1 );
         

        
    }
}