package com.example.v9oikea;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class userViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;

    TextView userEtunimi, userSukunimi, userMeili, userTutkinto;
    public userViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        userEtunimi = itemView.findViewById(R.id.txtUserEtunimi);
        userTutkinto = itemView.findViewById(R.id.txtUserTutkinto);
        userMeili = itemView.findViewById(R.id.txtUserMeili);

    }
}
