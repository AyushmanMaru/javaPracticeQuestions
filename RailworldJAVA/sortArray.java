public class sortArray {
  public static void main(String[] args) {
    int arr[] = {3,1,4,5,2};

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    System.out.println("Sorted array in ascending order");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
  }
}
