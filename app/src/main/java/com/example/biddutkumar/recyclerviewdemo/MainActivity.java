package com.example.biddutkumar.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView userRecyclerView;
    private List<User> userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userList=new ArrayList<>();
        userList.add(new User("Mash","Male","01233454",R.drawable.mashrafe));
        userList.add(new User("Asraful","Male","01233454",R.drawable.ashraful));
        userList.add(new User("Rafiq","Male","01233454",R.drawable.rafique));
        userList.add(new User("Riyad","Male","01233454",R.drawable.riyad));
        userList.add(new User("Nanu","Male","01233454",R.drawable.nanu));
        userList.add(new User("Saif","Male","01233454",R.drawable.saif));

        userRecyclerView=findViewById(R.id.userRecyclerViewId);
        userRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter customAdapter=new CustomAdapter(this,userList);
        userRecyclerView.setAdapter(customAdapter);


    }
}
