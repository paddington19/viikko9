package com.example.v9oikea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {
    private EditText textInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser(View view) {
        textInput = findViewById(R.id.productName);
        //textInput2 = findViewById(R.id.textInputSukunimi);
        //textInput3 = findViewById(R.id.textInputMeili);
        UserStorage.getInstance().addUser(new User(textInput.getText().toString()));


        // saving the stuff into a file

        UserStorage.getInstance().saveUsers(this);

        Intent intent = new Intent(this, ListUserActivity.class);
        startActivity(intent);
        finish();
    }
}
