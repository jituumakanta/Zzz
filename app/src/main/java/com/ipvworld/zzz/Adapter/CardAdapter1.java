package com.ipvworld.zzz.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.ipvworld.zzz.BeanClass.ListItem;
import com.ipvworld.zzz.Main.MySingleton;
import com.ipvworld.zzz.R;

import java.util.List;

/**
 * Created by jitu on 11/25/2016.
 */

public class CardAdapter1 extends RecyclerView.Adapter<CardAdapter1.ViewHolder> {
    List<ListItem> listSuperHeroes1;
    private ImageLoader imageLoader;
    public Context context;

    public CardAdapter1(List<ListItem> listSuperHeroes1, Context context) {
        this.listSuperHeroes1 = listSuperHeroes1;
        this.context=context;
        //Toast.makeText(context,""+listSuperHeroes,Toast.LENGTH_LONG).show();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_card_view2, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }////////////////////////////////////////////////////////////////////////////////////////initiate views for layout files

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //LauncherActivity.ListItem list =  ListItem.get(position);
        try {
            final ListItem obj = listSuperHeroes1.get(position);
            imageLoader = MySingleton.getInstance(context).getImageLoader();
            imageLoader.get(obj.geturlToImage(), ImageLoader.getImageListener(holder.imageView, R.mipmap.noicon, android.R.drawable.ic_dialog_alert));

            holder.imageView.setImageUrl(obj.geturlToImage(), imageLoader);
            holder.textViewName.setText(obj.getSouce());
            holder.textViewName1.setText(obj.getTitle());
            holder.textViewName2.setText(obj.getpPublishedAt());

        }catch(Exception e){
        }
    }

    @Override
    public int getItemCount() {
        return listSuperHeroes1.size();
    }///////////////

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public TextView textViewName1;
        public TextView textViewName2;
        public NetworkImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (NetworkImageView) itemView.findViewById(R.id.imageViewHero);
            textViewName = (TextView) itemView.findViewById(R.id.aa);
            textViewName1 = (TextView) itemView.findViewById(R.id.bb);
            textViewName2 = (TextView) itemView.findViewById(R.id.cc);

        }
    }///////////////////////////////////////////////////////////////////////////////////////////// create viewes

}
