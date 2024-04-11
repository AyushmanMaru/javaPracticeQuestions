import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        System.out.println("Smallest elements is");
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
