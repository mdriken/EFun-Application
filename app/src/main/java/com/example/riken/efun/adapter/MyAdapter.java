package com.example.riken.efun.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.riken.efun.BendaActivity;
import com.example.riken.efun.BuahActivity;
import com.example.riken.efun.HewanActivity;
import com.example.riken.efun.R;

/**
 * Created by RIKEN on 4/21/2018.
 */

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyHolder> {

    private Context context;
    private int images[];
    private String names[];


    public MyAdapter(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
        this.names = names;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout,null);
        MyHolder myHolder = new MyHolder(layout);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

     holder.img.setImageResource(images[position]);
     holder.txt.setText(names[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;

    }

    public class  MyHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;

        public  MyHolder (View itemView) {
            super(itemView);
            context = itemView.getContext();
            img = (ImageView) itemView.findViewById(R.id.imageView);
            txt = (TextView) itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                public void onClick(View view) {

                    final Intent intent;
                    switch ((getPosition())){
                        case 0:
                            intent =  new Intent(context, BuahActivity.class);
                            break;

                        case 1:
                            intent =  new Intent(context, HewanActivity.class);
                            break;
                        default:
                            intent =  new Intent(context, BendaActivity.class);
                            break;
                    }
                    context.startActivity(intent);


                }
            });

        }

    }
}
