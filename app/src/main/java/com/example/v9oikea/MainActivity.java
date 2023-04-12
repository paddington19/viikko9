package com.example.v9oikea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private EditText textInput2;
    private EditText textInput3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Load the user list from file
        UserStorage.getInstance().loadUsers(this);
    }

    public void SwitchToAddUserReal(View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }

    public void SwitchToAddUser(View view) {
        Intent intent = new Intent(this, ListUserActivity.class);
        startActivity(intent);
    }


}




