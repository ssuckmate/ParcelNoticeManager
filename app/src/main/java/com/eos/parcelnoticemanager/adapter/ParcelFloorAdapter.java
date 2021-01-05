package com.eos.parcelnoticemanager.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eos.parcelnoticemanager.R;
import com.eos.parcelnoticemanager.tools.OnFloorItemClickListener;

import java.util.ArrayList;

public class ParcelFloorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements OnFloorItemClickListener {

    static public ArrayList<Integer> floors;
    private Context context;
    private LayoutInflater layoutInflater;

    public ParcelFloorAdapter(Context context, int floor){
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        floors = new ArrayList<>();
        for(int i=0; i<floor; i++){
            floors.add(i+1);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.parcel_floor, parent, false);
        return new ParcelFloorAdapter.GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((GridViewHolder)holder).rvRoom.setAdapter(new ParcelRoomAdapter(context,floors.get(position)));
        ((GridViewHolder)holder).rvRoom.setLayoutManager(new GridLayoutManager(context, 5));
        ((GridViewHolder)holder).rvRoom.setHasFixedSize(true);
        ((ParcelFloorAdapter.GridViewHolder)holder).tvFloorNum.setText(String.valueOf(floors.get(position))+"층");
    }

    @Override
    public int getItemCount() {
        return floors.size();
    }

    @Override
    public void onItemClick(RecyclerView.ViewHolder holder, View view, int position) {
    }


    public class GridViewHolder extends RecyclerView.ViewHolder {
        RecyclerView rvRoom;
        TextView tvFloorNum;

        public GridViewHolder(View itemView) {
            super(itemView);
            rvRoom = itemView.findViewById(R.id.parcel_recyclerView_room);
            tvFloorNum = itemView.findViewById(R.id.parcel_textView_floor);
        }
    }
}
