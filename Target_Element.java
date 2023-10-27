public class Target_Element {
    public static void main(String[] args) {
        int [] arr ={4,12,54,14,3,8,6,1};
        int n = arr.length;
        int x = 54;
        if(TarElem(arr,n ,x , 0)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        
    }

   static boolean  TarElem(int arr[] , int n , int x , int idx){

    if(idx==n){
        return false ;


    }
    if(arr[idx]==x){
        return true;
    }
   
    if(TarElem(arr , n , x, idx+1)){
        return true;
    }
    return false;
    

    



    

    }
}
