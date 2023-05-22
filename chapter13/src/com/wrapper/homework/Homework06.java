package com.wrapper.homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        News news1 = new News("新闻1: 新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("新闻2: 男子在家中跳只因你太美后被邻居举报为小黑子");

        ArrayList newsList = new ArrayList();
        newsList.add(news1);
        newsList.add(news2);

        for (int i = newsList.size() - 1; i >= 0; i--) {
            News newsObj = (News) newsList.get(i);
            if (newsObj.getTitle().length() > 15) {
                newsObj.setTitle(newsObj.getTitle().substring(0, 15)+"...");
            }
            System.out.println(newsList.get(i));
        }

    }
}


class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}