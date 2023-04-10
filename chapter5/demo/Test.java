import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[][] yhTri = new int[10][];
        for (int i = 0; i < yhTri.length;i++) {
            yhTri[i] = new int[i + 1];
           

            


            for (int j = 0; j < i + 1 ; j++) {
                if (j == 0 || j == i) {
                    yhTri[i][j] = 1;
                } else {
                    yhTri[i][j] = yhTri[i-1][j] + yhTri[i-1][j-1];
                }
                
            }
        
           
            
        }


        for (int i = 0; i<yhTri.length; i++) {
            for (int j = 0; j<yhTri[i].length;j++) {
                System.out.print(yhTri[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
       
}