package com.example.mvvmlistviewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvmlistviewbinding.adapter.NewsAdapter;
import com.example.mvvmlistviewbinding.databinding.ActivityMainBinding;
import com.example.mvvmlistviewbinding.viewmodel.NewsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    private NewsModel newsModel;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getArrayListNews();
        newsAdapter = new NewsAdapter(this, newsModelArrayList);
        activityMainBinding.listView.setAdapter(newsAdapter);

    }
}