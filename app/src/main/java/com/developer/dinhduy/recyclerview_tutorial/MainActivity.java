package com.developer.dinhduy.recyclerview_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    BookAdapter adapter;
    List<Book> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recylerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        list.add(new Book("Book 1","Let me See",R.drawable.sach1));
        list.add(new Book("Book 2","Let me See",R.drawable.sach2));
        list.add(new Book("Book 3","Let me See",R.drawable.sach3));
        list.add(new Book("Book 4","Let me See",R.drawable.sach4));
        list.add(new Book("Book 5","Let me See",R.drawable.sach5));
        list.add(new Book("Book 6","Let me See",R.drawable.sach6));
        list.add(new Book("Book 7","Let me See",R.drawable.sach8));
        list.add(new Book("Book 8","Let me See",R.drawable.sach9));
        list.add(new Book("Book 9","Let me See",R.drawable.sach10));
        adapter=new BookAdapter(list,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}
