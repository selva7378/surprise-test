import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        // int n = sc.nextInt();
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == arr.length-1 || j == 0){
                    recPrint(arr, i, j);
                    System.out.println();
                }
            }
        }
    }

    private static void recPrint(int arr[][], int i, int j){
        if(i < 0 || j > arr.length - 1 ){
            return;
        }
        System.out.print(arr[i][j] + ",");
        recPrint(arr, i - 1, j + 1);
    }
}
