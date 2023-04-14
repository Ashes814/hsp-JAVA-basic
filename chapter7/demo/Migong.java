public class Migong {
    public static void main(String[] args) {
        Tools tool = new Tools();
        int[][] map = new int[8][7];

        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;


        // map[2][1] = 1;
        // map[1][2] = 1;

        map[5][2] = 1;
        map[6][2] = 1;
        map[5][4] = 1;
        map[6][4] = 1;

        System.out.println("当前地图情况2");
        tool.printArray(map);

        // tool.findway(map, 1, 1);
        // System.out.println("Path");
        // tool.printArray(map);

        tool.findway2(map, 1, 1);
        System.out.println("Path2");
        tool.printArray(map);

    }
}


class Tools {
    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean findway(int[][] map, int initRow, int initCol) {
        System.out.println("Current location" + initRow + " " + initCol);
        printArray(map);
        if (map[6][5] == 2) {
            return true;
        } else {
            if(map[initRow][initCol] == 0) {
                map[initRow][initCol] = 2;
                if(findway(map, initRow + 1, initCol)){
                    return true;
                } else if (findway(map, initRow, initCol + 1)) {
                    return true;
                } else if (findway(map, initRow - 1, initCol)) {
                    return true;
                }  else if (findway(map, initRow, initCol - 1)) {
                    return true;
                } else {
                    map[initRow][initCol] = 3;
                    return false;
                }


            } else {
                return false;
            }
        }
    }

    public boolean findway2(int[][] map, int initRow, int initCol) {
        // System.out.println("Current location" + initRow + " " + initCol);
        // printArray(map);
        if (map[6][5] == 2) {
            return true;
        } else {
            if(map[initRow][initCol] == 0) {
                map[initRow][initCol] = 2;
                if(findway2(map, initRow - 1, initCol)){
                    return true;
                } else if (findway2(map, initRow, initCol + 1)) {
                    return true;
                } else if (findway2(map, initRow + 1, initCol)) {
                    return true;
                }  else if (findway2(map, initRow, initCol - 1)) {
                    return true;
                } else {
                    map[initRow][initCol] = 3;
                    return false;
                }


            } else {
                return false;
            }
        }
    }

    
}