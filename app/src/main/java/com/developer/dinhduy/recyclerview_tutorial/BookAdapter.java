package com.developer.dinhduy.recyclerview_tutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.Bookhoder> {
    private List<Book> List;
    private Context context;

    public BookAdapter(java.util.List<Book> list, Context context) {
        List = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Bookhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view=LayoutInflater.from(context).inflate(R.layout.custom_recylerview,parent,false);

        return new Bookhoder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull Bookhoder holder, int position) {
        final Book book=List.get(position);
        holder.NameBook.setText(book.getNamebook());
        holder.Titlebook.setText(book.getTitle());
        holder.imageView.setImageResource(book.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Get Item" +book.getNamebook(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class Bookhoder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView NameBook,Titlebook;
        public Bookhoder(View itemView) {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.image);
            NameBook=(TextView) itemView.findViewById(R.id.textView);
            Titlebook=(TextView)itemView.findViewById(R.id.textView2);
        }
    }
}
