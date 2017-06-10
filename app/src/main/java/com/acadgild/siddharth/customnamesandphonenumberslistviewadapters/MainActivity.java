package com.acadgild.siddharth.customnamesandphonenumberslistviewadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mlv;
    private ArrayList<String> name;
    private ArrayList<String> phno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlv = (ListView)findViewById(R.id.lv_view);
        name = new ArrayList<>();
        phno = new ArrayList<>();

        name.add("Sid");
        name.add("Rahul");
        name.add("Akshay");
        name.add("Apurv");
        name.add("Anshul");
        phno.add("9584436448");
        phno.add("9584796455");
        phno.add("8572467286");
        phno.add("9857851064");
        phno.add("7785499588");

        mlv.setAdapter(new MyAdapter());
    }

    class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return phno.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.name,viewGroup,false);
            TextView namee = (TextView)v.findViewById(R.id.one);
            TextView phnoo = (TextView)v.findViewById(R.id.two);
            namee.setText(name.get(i));
            phnoo.setText(phno.get(i));
            return v;
        }
    }
}
