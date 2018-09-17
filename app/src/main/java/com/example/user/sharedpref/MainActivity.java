package com.example.user.sharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById((R.id.edittext1));
        ok=(Button)findViewById(R.id.okbutton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String et1text=et1.getText().toString();
                SharedPreferences shared = getApplicationContext().getSharedPreferences("Pref",MODE_PRIVATE);
                SharedPreferences.Editor editor=shared.edit();
                editor.putString("key",et1text);
                editor.apply();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);


            }
        });
    }
}

