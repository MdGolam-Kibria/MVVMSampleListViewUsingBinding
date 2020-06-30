package com.example.mvvmlistviewbinding.viewmodel;

import com.example.mvvmlistviewbinding.model.News;

import java.util.ArrayList;

public class NewsModel {
    public String header;
    public String desc;

    public NewsModel() {
    }

    public NewsModel(News news) {
        this.header = news.header;
        this.desc = news.desc;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<NewsModel> getArrayListNews() {
        ArrayList<NewsModel> newsModelArrayList = new ArrayList<>();
        NewsModel newsModel1 = new NewsModel(new News("first header","This is first News"));
        NewsModel newsModel2 = new NewsModel(new News("second header","This is second News"));
        NewsModel newsModel3 = new NewsModel(new News("third header","This is third News"));
        NewsModel newsModel4 = new NewsModel(new News("fourth header","This is fourth News"));
        newsModelArrayList.add(newsModel1);
        newsModelArrayList.add(newsModel2);
        newsModelArrayList.add(newsModel3);
        newsModelArrayList.add(newsModel4);
        return newsModelArrayList;
    }
}
