package com.example.v9oikea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;


public class userListAdapter extends RecyclerView.Adapter<userViewHolder> {
    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public userListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
        Collections.sort(this.users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    @NonNull
    @Override
    public userViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userViewHolder(LayoutInflater.from(context).inflate(R.layout.userview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolder holder, int position) {
        holder.userEtunimi.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        //holder.userSukunimi.setText(users.get(position).getLastName());
        holder.userMeili.setText(users.get(position).getEmail());
        holder.userTutkinto.setText(users.get(position).getDegreeProgram());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
