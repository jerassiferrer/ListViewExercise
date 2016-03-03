package com.mobileappscompany.trainning.listviewexercise;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

// Listview
        listView = (ListView) findViewById(R.id.sportsList);
//metemos la lista aqui
        String[] sports = getResources().getStringArray(R.array.lista);

// ponemos el adapter
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,sports ));
        listView.setOnItemClickListener(this);
    }
//Onclick
    public void onItemClick(AdapterView<?> adapter, View view,
                            int position, long id) {
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                Toast.LENGTH_SHORT).show();
    }

}
