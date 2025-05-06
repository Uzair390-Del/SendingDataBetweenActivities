package com.example.sendingdatabetweenactivities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editName,editEmail,editPhoneNumber;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
         editName=findViewById(R.id.editName);
         editEmail=findViewById(R.id.editEmail);
         editPhoneNumber=findViewById(R.id.editPhoneNumber);
         signUp=findViewById(R.id.button);
         signUp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 
             }
         });

            return insets;
        });
    }
}