package com.example.antons.translationapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by antons on 30/11/2017.
 */

public class PhoneAdapter extends BaseAdapter {

    private List<Phone> phoneList;
    private LayoutInflater layoutInflater;
    private int color;

    public PhoneAdapter(Context context,List<Phone> phoneList, int color) {
        this.phoneList = phoneList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.color = color;
    }

    @Override
    public int getCount() {
        return phoneList.size();
    }

    @Override
    public Phone getItem(int position) {
        return phoneList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view==null){
            view = layoutInflater.inflate(R.layout.phone_layout, viewGroup,false);
        }

        view.setBackgroundColor(color);

        ImageView pictureImageView = view.findViewById(R.id.phone_device_picture);
        pictureImageView.setImageResource(getItem(position).getResourceIDPicture());

        TextView idTextView = view.findViewById(R.id.phone_device_id);
        idTextView.setText(Integer.toString(getItem(position).getId()));

        TextView nameTextView = view.findViewById(R.id.phone_device_name);
        nameTextView.setText(getItem(position).getName());

        TextView priceTextView = view.findViewById(R.id.phone_device_price);
        priceTextView.setText(Double.toString(getItem(position).getPrice()));



        return view;
    }
}
