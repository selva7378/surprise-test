import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int number = 7;
        int mid = number / 2;
        int s1 = mid;
        int hn = 1;
        int vn = 1;
        boolean vNumberIncrease = true;
        boolean hNumberDecrease = true;
        boolean spaceDecrease = true;
        for(int i = 0; i < number; i++){
            for(int s = 1; s <= s1; s++){
                System.out.print(" ");
            }
            int ihn = hn;
            for(int n = 1; n <= vn; n++){
                System.out.print(ihn);
                if(ihn == 1){
                    hNumberDecrease = false;
                }

                if(hNumberDecrease){
                    ihn--;
                }else{
                    ihn++;
                }
            }
            hNumberDecrease = true;
            if(s1 == 0){
                spaceDecrease = false;
            }

            if(spaceDecrease){
                s1--;
            }else{
                s1++;
            }

            if(i == mid){
                vNumberIncrease = false;
            }
            if(vNumberIncrease){
                vn = vn + 2;
                hn++;
            }else{
                vn = vn - 2;
                hn--;
            }

            System.out.println();

        }
    }
}
