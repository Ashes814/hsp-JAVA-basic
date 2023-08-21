package com.tankBattle.game;

import java.awt.*;
import java.io.*;
import java.util.Vector;

/**
 * @author 欧欧
 * @version 1.0
 * record information and intereactive with file
 */
public class Recoder {

    private static int allEnemyTankNum = 0;

    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static Vector<EnemyTank> enemyTanks = new Vector<>();
    private static String recordFile = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/tank90/myRecord.txt";
    private static Vector<Node> nodes = new Vector<>();

    public static Vector<Node> getNodesAndEnemyTankRec() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());

            String line = "";
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]),
                         Integer.parseInt(xyd[1]),
                         Integer.parseInt(xyd[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return nodes;
    }


    // save enemyTank Loc and Direct
    public static void keepRecord()  {

        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum+ "\r\n");

            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    bw.write(record + "\r\n");
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }


    public static void addAllEnemyTankNum() {
        Recoder.allEnemyTankNum++;
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recoder.enemyTanks = enemyTanks;
    }
}
