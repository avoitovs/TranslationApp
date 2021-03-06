package com.example.antons.translationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        displayList();

    }


    private List<Phone> createListOfPhone (){
        List<Phone> phoneList = new ArrayList<>();

        phoneList.add(new Phone(123,"iPhone", 1239.45,R.drawable.family_daughter));
        phoneList.add(new Phone(234,"Samsung", 1623.45,R.drawable.family_father));
        phoneList.add(new Phone(12345,"LG", 12390.45,R.drawable.family_grandfather));
        phoneList.add(new Phone(876,"Huawei", 12763.45,R.drawable.family_grandmother));
        phoneList.add(new Phone(9867,"Oppo", 1293.85,R.drawable.family_mother));
        phoneList.add(new Phone(453647,"Meizu", 1238.45,R.drawable.family_older_brother));
        phoneList.add(new Phone(12356,"OnePlus", 12388.45,R.drawable.family_older_sister));
        phoneList.add(new Phone(0,"Asus", 121233.45,R.drawable.family_son));
        phoneList.add(new Phone(986644,"Nokia", 127653.45,R.drawable.family_daughter));
        phoneList.add(new Phone(345678,"Sony", 12387.45,R.drawable.family_younger_brother));
        phoneList.add(new Phone(9999,"Google Pixel", 127643.45,R.drawable.family_younger_sister));
        phoneList.add(new Phone(112344,"Doodle", 12763.45,R.drawable.family_mother));

        return phoneList;
    }


    private void displayList (){

        PhoneAdapter adapter = new PhoneAdapter(this,createListOfPhone(),R.color.phoneColor);
        ListView view = findViewById(R.id.listView_second_page);
        view.setAdapter(adapter);
    }






}
