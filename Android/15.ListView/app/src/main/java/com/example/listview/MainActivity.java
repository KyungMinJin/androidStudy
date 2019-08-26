package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        ArrayList<String> list = new ArrayList<>();
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, list);
        listView.setAdapter(myAdapter);

    }

    class MyAdapter extends BaseAdapter{

        private  ViewHolder viewHolder;
        private LayoutInflater inflater;
        private ArrayList<String> itemList;

        public MyAdapter(Context context, ArrayList<String> itemList)  {
            this.itemList = itemList;
            this.inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return itemList.size();
        }

        @Override
        public String getItem(int i) {
            return itemList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            View view = convertView;
            if(view == null) {
                Log.d("test", "new");
                viewHolder = new ViewHolder();
                view = inflater.inflate(R.layout.list_item_view, null);
                viewHolder.textView = view.findViewById(R.id.item_view_text);
                view.setTag(viewHolder);
            } else {
                Log.d("test", "recycle");
                viewHolder = (ViewHolder) view.getTag();
            }

            viewHolder.textView.setText(getItem(i));
            return view;

        }

        class ViewHolder {
            public TextView textView = null;
        }
    }

}
