import java.util.Scanner;

class Array {
    public static void main(String aa[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
