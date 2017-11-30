package com.example.antons.translationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        displayList(createArrayList());
    }


        private ArrayList createArrayList (){

            ArrayList<Word> arrayList = new ArrayList<>();
            int j =20;

            for (int i = 0; i<20;i++){


                arrayList.add(new Word(Integer.toString(i),Integer.toString(j)));
                j--;
            }
            return arrayList;
        }

        private void displayList (ArrayList arrayList){

            WordAdapter adapter = new WordAdapter(this,arrayList);

            ListView listView =  findViewById(R.id.list);

            listView.setAdapter(adapter);

        }



}
