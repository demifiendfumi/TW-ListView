package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvM;
    TextView tvYear;

    ArrayAdapter aa;
    ArrayList<Module> modules;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvM = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        // Create a few objects in array
        modules = new ArrayList<Module>();

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        if(tvYear.getText().equals("Year 1")) {
            modules.add(new Module( "A113", false));
            modules.add(new Module( "C102", true));
            modules.add(new Module( "B102", true));
        }else if(tvYear.getText().equals("Year 2")) {
            modules.add(new Module( "C208", true));
            modules.add(new Module( "C200", false));
            modules.add(new Module( "C346", true));
        }else if(tvYear.getText().equals("Year 3")) {
            modules.add(new Module("C302", true));
            modules.add(new Module("C347", true));
            modules.add(new Module("C349", true));
        }
        aa = new ModuleAdapter(this, R.layout.rowsecond, modules);
        lvM.setAdapter(aa);



    }

}
