package com.oocool.multiThread.basic_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
    }
}
