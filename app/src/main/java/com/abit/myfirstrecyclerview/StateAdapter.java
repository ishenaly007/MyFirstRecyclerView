package com.abit.myfirstrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<State> states;


    StateAdapter(Context context, List<State> states){
        this.states=states;
        this.inflater=LayoutInflater.from(context);
    }
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateAdapter.ViewHolder holder, int position) {
        State state =states.get(position);
        holder.nameState.setText(state.getName());
        holder.numState.setText(state.getNum());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameState;
        TextView numState;
        public ViewHolder(View view) {
            super(view);
            nameState=view.findViewById(R.id.name);
            numState=view.findViewById(R.id.num);
        }
    }
}
