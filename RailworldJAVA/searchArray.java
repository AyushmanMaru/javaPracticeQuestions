public class searchArray {
    
    public static void main(String[] args) {
        int arr[] = {7,4,2,6,9,5};

        int target = 9;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }    
        
            
    }
}
