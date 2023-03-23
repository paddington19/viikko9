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
    }


        public void addUser(View view) {
            RadioGroup radioGrouppi = findViewById(R.id.radioGrouppi);
            textInput = findViewById(R.id.textInputEtunimi);
            textInput2 = findViewById(R.id.textInputSukunimi);
            textInput3 = findViewById(R.id.textInputMeili);

            switch (radioGrouppi.getCheckedRadioButtonId()) {
                case R.id.rbTITE:
                    UserStorage.getInstance().addUser(new User(
                            textInput.getText().toString(),
                            textInput2.getText().toString(),
                            textInput3.getText().toString(),
                            "tietotekniikka"));
                    break;

                case R.id.rbTUTA:
                    UserStorage.getInstance().addUser(new User(
                            textInput.getText().toString(),
                            textInput2.getText().toString(),
                            textInput3.getText().toString(),
                            "tuotantotalous"));
                    break;

                case R.id.rbLATE:
                    UserStorage.getInstance().addUser(new User(
                            textInput.getText().toString(),
                            textInput2.getText().toString(),
                            textInput3.getText().toString(),
                            "laskennallinen tekniikka"));
                    break;

                case R.id.rbSATE:
                    UserStorage.getInstance().addUser(new User(
                            textInput.getText().toString(),
                            textInput2.getText().toString(),
                            textInput3.getText().toString(),
                            "sähkötekniikka"));
                    break;
            }
            Intent intent = new Intent(this, ListUserActivity.class);
            startActivity(intent);
        }
}




