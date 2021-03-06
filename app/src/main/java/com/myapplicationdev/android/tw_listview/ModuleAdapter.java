package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> modules;
    private Context context;
    private TextView tvName;
    private ImageView ivIcon;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        modules = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a rowSecond

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the rowSecond.xmll as the layout for the View object
        View rowView = inflater.inflate(R.layout.rowsecond, parent, false);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.tvModule);
        // Get the ImageView object
        ivIcon = (ImageView) rowView.findViewById(R.id.ivIcon);

        // The parameter "position" is the index of the
        //  rowSecond ListView is requesting.
        //  We get back the food at the same index.
        Module currentFood = modules.get(position);
        // Set the TextView to show the food

        tvName.setText(currentFood.getModule());
        // Set the image to star or nostar accordingly
        if(currentFood.isProgram()) {
            ivIcon.setImageResource(R.drawable.prog);
        }
        else {
            ivIcon.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}

