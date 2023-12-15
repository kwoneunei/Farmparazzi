package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.test.Plant;
import com.example.test.R;

import java.util.List;

public class Rec_Plant_Adapter extends ArrayAdapter<Rec_Plant> {

    public Rec_Plant_Adapter(Context context, int resource, List<Rec_Plant> recplantList) {
        super(context, resource, recplantList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Rec_Plant rec_plant = getItem(position);

        // Fix the typo in the variable name (converView -> convertView)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.plant_item, parent, false);
        }

        TextView tv = convertView.findViewById(R.id.rec_plant_name);
        ImageView iv = convertView.findViewById(R.id.rec_plant_image); // Fix typo in the ImageView variable name

        // Make sure plant is not null before accessing its properties
        if (rec_plant != null) {
            tv.setText(rec_plant.getrecName());
            iv.setImageResource(rec_plant.getrecImage());
        }

        return convertView;
    }
}