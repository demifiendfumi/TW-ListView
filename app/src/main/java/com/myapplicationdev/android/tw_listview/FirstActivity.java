package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvYear);

        final String[] year = new String[] { "Year 1","Year 2","Year 3"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.row2, R.id.tv_Year, year);


        // Assign adapter to ListView
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedYear = String.valueOf(lv.getItemIdAtPosition(position));
                String selectedYearArray = year[Integer.valueOf(selectedYear)];

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                i.putExtra("year",selectedYearArray);
                startActivity(i);
            }
        });


    }
}
