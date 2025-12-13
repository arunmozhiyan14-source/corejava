package task15To24;

public class ReverseRightAngledTriangle {

    public static void main(String[] args) {

        int row = 4;
        for(int i = 1; i<=row;i++){
            for(int j=4; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
