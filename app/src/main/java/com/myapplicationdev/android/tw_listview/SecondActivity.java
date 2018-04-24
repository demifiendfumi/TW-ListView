package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> modules;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        modules = new ArrayList<Module>();
        modules.add(new Module("Year 1", "A113", false));
        modules.add(new Module("Year 1", "B102", false));
        modules.add(new Module("Year 1", "C207", true));

        modules.add(new Module("Year 2", "C208", true));
        modules.add(new Module("Year 2", "C200", false));
        modules.add(new Module("Year 2", "C346", true));

        modules.add(new Module("Year 3", "C347", true));
        modules.add(new Module("Year 3", "C302", true));
        modules.add(new Module("Year 3", "C349", true));

        if(tvYear.equals("Year 1")){
            aa = new ModuleAdapter(this, R.layout.row2, modules);
            lv.setAdapter(aa);
        } else if(tvYear.equals("Year 2")){
            aa = new ModuleAdapter(this, R.layout.row2, modules);
            lv.setAdapter(aa);
        }else{
            aa = new ModuleAdapter(this, R.layout.row2, modules);
            lv.setAdapter(aa);
        }

    }



}
