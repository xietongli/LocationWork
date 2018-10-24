package com.example.xie.locationwork;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.xie.locationwork.Adapter.MyBaseAdapter;
import com.example.xie.locationwork.Adapter.MypagerAdapter;
import com.example.xie.locationwork.Pager.Friend;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private View view1, view2,view3,view4,view5;
    private ViewPager viewPager;
    private List<View> viewList;
    private List<Friend> friendList;
    private Button My_location,friend,group,mine,more;
    static Context context;
    private LinearLayout layout;
    private ListView listView;
    private MyBaseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        click();
        context=this;
        viewPager = (ViewPager) findViewById(R.id.vp);
        view();
        friendList=new ArrayList<>();
        adapter = new MyBaseAdapter(friendList,MainActivity.this);
        listView=(ListView)findViewById(R.id.lv_friends);
        listView.setAdapter(adapter);

    }
    public void view(){
        LayoutInflater inflater=getLayoutInflater();
        view1 = View.inflate(this, R.layout.location_me, null);
        view2 = View.inflate(this, R.layout.friends, null);
        view3 = View.inflate(this, R.layout.groups, null);
        view4 = View.inflate(this, R.layout.mine, null);

        viewList = new ArrayList<View>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);

        MypagerAdapter adapter = new MypagerAdapter(viewList);
        viewPager.setAdapter(adapter);

    }
    public void init(){
        My_location=(Button)findViewById(R.id.My_location);
        friend=(Button)findViewById(R.id.friend);
        group=(Button)findViewById(R.id.group);
        mine=(Button)findViewById(R.id.main);
        more=(Button)findViewById(R.id.more);
        layout=(LinearLayout)findViewById(R.id.layout_more);
    }
    public void click(){
        My_location.setOnClickListener(this);
        friend.setOnClickListener(this);
        group.setOnClickListener(this);
        mine.setOnClickListener(this);
        more.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.My_location:
               My_location.setBackgroundResource(R.drawable.location_me);
               friend.setBackgroundResource(R.drawable.friend);
               group.setBackgroundResource(R.drawable.group);
               mine.setBackgroundResource(R.drawable.mine);
               layout.setVisibility(View.INVISIBLE);
               viewPager.setCurrentItem(0);
              break;
           case R.id.friend:
               My_location.setBackgroundResource(R.drawable.color_location);
               friend.setBackgroundResource(R.drawable.color_friend);
               group.setBackgroundResource(R.drawable.group);
               mine.setBackgroundResource(R.drawable.mine);
               layout.setVisibility(View.INVISIBLE);
               viewPager.setCurrentItem(1);
               break;
           case R.id.group:
               My_location.setBackgroundResource(R.drawable.color_location);
               friend.setBackgroundResource(R.drawable.friend);
               group.setBackgroundResource(R.drawable.color_group);
               mine.setBackgroundResource(R.drawable.mine);
               layout.setVisibility(View.INVISIBLE);
               viewPager.setCurrentItem(2);
               break;
           case R.id.main:
               My_location.setBackgroundResource(R.drawable.color_location);
               friend.setBackgroundResource(R.drawable.friend);
               group.setBackgroundResource(R.drawable.group);
               mine.setBackgroundResource(R.drawable.color_me);
               layout.setVisibility(View.INVISIBLE);
               viewPager.setCurrentItem(3);
               break;
           case R.id.more:
               layout.setVisibility(View.VISIBLE);
               break;
       }
    }
}
