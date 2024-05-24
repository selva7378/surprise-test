public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 5;
        int arr[][] = new int[n][n];
        boolean r = true;
        boolean l = false;
        boolean u = false;
        boolean d = false;
        int i = 0;
        int j = 0;
        for(int k = 1; k <= (n * n); k++){
            arr[i][j] = k;
            if(r){
                j++;
            }else if(l){
                j--;
            }else if(d){
                i++;
            }else{
                i--;
            }

            if(i < 0 || i >= n || j < 0 || j >= n || arr[i][j] != 0){
                if(r){
                    r = false;
                    d = true;
                    j--;
                    i++;
                }else if(d){
                    d = false;
                    l = true;
                    i--;
                    j--;
                }else if(l){
                    l = false;
                    u = true;
                    j++;
                    i--;
                }else if(u){
                    u = false;
                    r = true;
                    i++;
                    j++;
                }
            }
        }
        print(arr);
    }

    public static void print(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
