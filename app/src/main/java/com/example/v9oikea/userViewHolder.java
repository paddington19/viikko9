package com.example.v9oikea;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class userViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView, removeImage, editImage;

    TextView userEtunimi;
    public userViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        userEtunimi = itemView.findViewById(R.id.txtUserEtunimi);
        editImage = itemView.findViewById(R.id.imgEdit);
        removeImage = itemView.findViewById(R.id.imgRemove);

    }
}
