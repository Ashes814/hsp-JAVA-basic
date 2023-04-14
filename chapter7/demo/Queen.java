public class Queen {
    public static void main(String[] args) {
        Tool tool = new Tool();
        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1};
        
        tool.deployQueen(arr,0);

    }
    
}


class Tool {
    int count = 0;

    public boolean isSafe(int[]arr, int row, int col) {
        for (int i = 0; i < row ; i++) {
            if (arr[i] == col || Math.abs(arr[i] - col) == row - i) {
                return false;
            }
        }

        return true;
      
    }


    public void deployQueen(int[] arr, int row) {
        if (row == 8) {
            count++;
            System.out.println("Success:" + count);
            for (int i = 0; i < 8; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < 8; col++ ) {
            if (isSafe(arr, row, col)) {
                arr[row] = col;
                deployQueen(arr, row + 1);
                arr[row] = -1;
            }
        }

    }
}
