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
import java.util.List;

public class PlantAdapter extends ArrayAdapter<Plant> {
    public PlantAdapter(Context context, int resource, List<Plant> plantList) {
        super(context, resource, plantList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Plant plant = getItem(position);

        // Fix the typo in the variable name (converView -> convertView)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.plant_item, parent, false);
        }

        TextView tv = convertView.findViewById(R.id.plant_name);
        ImageView iv = convertView.findViewById(R.id.plant_image); // Fix typo in the ImageView variable name

        // Make sure plant is not null before accessing its properties
        if (plant != null) {
            tv.setText(plant.getName());
            iv.setImageResource(plant.getImage());
        }

        return convertView;
    }
}
