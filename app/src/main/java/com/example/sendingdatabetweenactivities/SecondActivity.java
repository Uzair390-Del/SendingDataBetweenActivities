package com.example.sendingdatabetweenactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    TextView name,email,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            name= findViewById(R.id.textViewName);
            email= findViewById(R.id.textViewEmail);
            phone=findViewById(R.id.editPhoneNumber);
            Intent i = getIntent();
            String userName=i.getStringExtra("name");
            String userEmail= i.getStringExtra("email");
            int userPhone= i.getIntExtra("phone",0);
            name.setText("Hello"+ userName);
            email.setText("Your email is "+ userEmail);
            phone.setText("Your phone Number is "+ userPhone);




            return insets;
        });
    }
}