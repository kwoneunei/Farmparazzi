package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<List_Item> list_itemArrayList;

    public ListAdapter(Context context, ArrayList<List_Item> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }

    @Override
    public int getCount() {
        return list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            holder = new ViewHolder();
            holder.nickname_textView = convertView.findViewById(R.id.nickname);
            holder.content_textView = convertView.findViewById(R.id.content);
            holder.date_textView = convertView.findViewById(R.id.date);
            holder.title_textView = convertView.findViewById(R.id.title);
            holder.profile_imageView = convertView.findViewById(R.id.photo);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Set data to views based on the item at the given position
        List_Item currentItem = (List_Item) getItem(position);
        holder.nickname_textView.setText(currentItem.getNickname());
        holder.content_textView.setText(currentItem.getContent());
        holder.date_textView.setText(currentItem.getDate());
        holder.title_textView.setText(currentItem.getTitle());
        holder.profile_imageView.setImageResource(currentItem.getProfile_image());

        return convertView;
    }

    static class ViewHolder {
        TextView nickname_textView;
        TextView content_textView;
        TextView date_textView;
        TextView title_textView;
        ImageView profile_imageView;
    }
}
