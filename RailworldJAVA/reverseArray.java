public class reverseArray {
    public static void main(String aa[]){
        int arr[] = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[arr.length-i-1]);
        }
    }
}
