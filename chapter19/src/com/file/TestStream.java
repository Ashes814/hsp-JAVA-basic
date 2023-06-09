package com.file;

/**
 * @author 欧欧
 * @version 1.0
 */



abstract class Reader_ { //抽象类

    public void readFile() {}
    public void readString() {}
}


class FileReader_ extends  Reader_ {
    public void readFile() {
        System.out.println("对文件进行读取");
    }

}

class StringReader_ extends  Reader_ {
    public void readString() {
        System.out.println("对字符串进行读取");
    }
}

//做成处理流
class BufferedReader_ extends Reader_{
    private Reader_ reader_; //创建一个私有的reader_

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }


    public void readFile() {
        reader_.readFile();
    }

    public void readString() {
        reader_.readString();
    }

    //扩展File节点流readFile，多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    //扩展String节点流readString，批量处理字符串
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }


}

public class TestStream {
    public static void main(String[] args) {
//        BufferedReader__ bufferedReader = new BufferedReader__(new FileReader_());// 使用File节点流
//        bufferedReader.readFile(); // //可以调用File节点流本来的readFile方法
//        bufferedReader.readFiles(10); //也可以调用扩展的方法多次readFile
//
//        BufferedReader__ bufferedReaderString = new BufferedReader__(new StringReader_()); // 变换成String节点流
//        bufferedReaderString.readString(); //调用String节点流本来的readString方法
//        bufferedReaderString.readStrings(10); //调用扩展的方法多次readString

    }
}