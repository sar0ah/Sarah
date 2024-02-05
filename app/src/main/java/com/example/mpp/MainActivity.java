package com.example.mpp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;
    TextView receiver_msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button=findViewById(R.id.send_button_id);
        send_text=findViewById(R.id.received_value);
        receiver_msg=(TextView) findViewById(R.id.send_text_id);
        send_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str ="Hello "+send_text.getText().toString();
                receiver_msg.setText(str);
            }
            });



    }


}