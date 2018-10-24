package com.example.xie.locationwork.Adapter;

/**
 * Created by xie on 2018/10/24.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import com.loopj.android.image.SmartImageView;
import android.widget.TextView;

import com.example.xie.locationwork.Pager.Friend;
import com.example.xie.locationwork.R;

import java.util.ArrayList;
import java.util.List;


public class MyBaseAdapter extends BaseAdapter {

    List<Friend> str=new ArrayList<Friend>();
    Context context;



    public MyBaseAdapter(List<Friend> str,Context context){
        this.str=str;
        this.context=context;

    }
    @Override
    public int getCount() {
        return str.size();//计算item的总数
    }

    @Override
    public Object getItem(int i) {
        return str.get(i);//获得item对象
    }

    @Override
    public long getItemId(int i) {
        return i;//获得对象的具体位置
    }

    @Override
    public View getView(int i, View vw, ViewGroup parent) {
        vw=View.inflate(context, R.layout.friend_item,null);
        SmartImageView image=(SmartImageView) vw.findViewById(R.id.img);
        image.setImageUrl(str.get(i).getImage());
        TextView textView2=(TextView)vw.findViewById(R.id.name);
        textView2.setText(str.get(i).getName());

        return vw;
    }
}