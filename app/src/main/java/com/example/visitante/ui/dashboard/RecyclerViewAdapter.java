package com.example.visitante.ui.dashboard;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.visitante.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG="RecylerViewAdapter";

    private ArrayList<String> t1=new ArrayList<>();
    private ArrayList<String> t2=new ArrayList<>();
    private ArrayList<String> t3=new ArrayList<>();
    private ArrayList<String> t4=new ArrayList<>();
    private ArrayList<String> t5=new ArrayList<>();
    private ArrayList<String> t6=new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<String> t1, ArrayList<String> t2, ArrayList<String> t3, ArrayList<String> t4, ArrayList<String> t5, ArrayList<String> t6) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_visitors,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder : called.");
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView a;
        TextView b;
        TextView c;
        TextView d;
        TextView e;
        TextView f;
        LinearLayout v1;
        CardView v2;
        LinearLayout v3;
        LinearLayout v4;
        LinearLayout v5;
        LinearLayout v6;
        Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            a=itemView.findViewById(R.id.tv);
            b=itemView.findViewById(R.id.tv1);
            c=itemView.findViewById(R.id.tv2);
            d=itemView.findViewById(R.id.tv3);
            e=itemView.findViewById(R.id.tv4);
            f=itemView.findViewById(R.id.tv5);
            v1=itemView.findViewById(R.id.v1);
            v2=itemView.findViewById(R.id.v2);
            v3=itemView.findViewById(R.id.v3);
            v4=itemView.findViewById(R.id.v4);
            v5=itemView.findViewById(R.id.v5);
            v6=itemView.findViewById(R.id.v6);
            button=itemView.findViewById(R.id.button1);
        }
    }

}
