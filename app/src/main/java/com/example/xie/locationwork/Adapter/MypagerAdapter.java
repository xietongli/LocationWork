package com.example.xie.locationwork.Adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xie on 2018/10/24.
 */
public class MypagerAdapter extends PagerAdapter {
    List<View> vL;

    public MypagerAdapter(List v){
        this.vL=v;
    }

    @Override
    public int getCount() {
        return vL.size();
    }
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView(vL.get(position));//删除卡页
    }

    public Object instantiateItem(ViewGroup container,int position){
        container.addView(vL.get(position),0);
        return  vL.get(position);//添加卡页
    }
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0==arg1;
    }
}