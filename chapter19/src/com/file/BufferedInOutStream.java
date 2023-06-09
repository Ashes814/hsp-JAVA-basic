package com.file;

import java.io.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class BufferedInOutStream {
    public static void main(String[] args) {
        String srcFliePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/bag.png";
        String destFliePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/bag_copy.png";

        // 创建BufferedOutputStream对象和BufferedInputStream对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;


        try {
            //使用对应的节点流创建Buffered包装流, FileInputStream是InputStream的子类
            bis = new BufferedInputStream(new FileInputStream(srcFliePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFliePath));

            //循环读取文件，并写入的destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;

            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流，关闭外层的处理流即可，底层会去关闭节点流

            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }



    }
}
