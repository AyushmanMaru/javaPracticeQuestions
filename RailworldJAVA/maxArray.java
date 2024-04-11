import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        System.out.println("max elements is");
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}

