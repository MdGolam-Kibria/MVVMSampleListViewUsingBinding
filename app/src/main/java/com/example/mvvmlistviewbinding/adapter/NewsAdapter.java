package com.example.mvvmlistviewbinding.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.mvvmlistviewbinding.R;
import com.example.mvvmlistviewbinding.databinding.ListRowBinding;
import com.example.mvvmlistviewbinding.viewmodel.NewsModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsModel> {
    private ArrayList<NewsModel> newsModelArrayList;
    Context context;

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.list_row, newsModelArrayList);
        this.context = context;
        this.newsModelArrayList = newsModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListRowBinding listRowBinding = DataBindingUtil.inflate(layoutInflater,R.layout.list_row,parent,false);
        listRowBinding.setNewsList(newsModelArrayList.get(position));
        return listRowBinding.getRoot();
    }
}
