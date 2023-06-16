package com.tankBattle.game;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 * @author 欧欧
 * @version 1.0
 * record information and intereactive with file
 */
public class Recoder {

    private static int allEnemyTankNum = 0;

    private static BufferedWriter bw = null;
    private static Vector<EnemyTank> enemyTanks = new Vector<>();
    private static String recordFile = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/tank90/myRecord.txt";
    private static Vector<Node> nodes = new Vector<>();

    public static Vector<Node> getNodesAndEnemyTankRec() {

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
