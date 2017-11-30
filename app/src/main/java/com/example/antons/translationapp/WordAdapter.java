package com.example.antons.translationapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by antons on 29/11/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> word) {
        super(context, 0, word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

            Word currentWordPosition = getItem(position);
            TextView numberTextView = listItemView.findViewById(R.id.first_text_view);
            numberTextView.setText(currentWordPosition.getNumber());

            TextView antiNumberTextView = listItemView.findViewById(R.id.second_text_view);
            antiNumberTextView.setText(currentWordPosition.getAntiNumber());

         return listItemView;


    }
}
