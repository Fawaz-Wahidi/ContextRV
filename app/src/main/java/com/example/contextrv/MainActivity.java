package com.example.contextrv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // كلمة this تعبر عن اوبجيكت
        // معناها هي السياق
//  بقدر استعمل ال This من داخل احد دوال الكلاس و ما بقدر ادخله من مكان داخل الكلاس
        // الفرق بين ال getApplicationContext و getBaseContext
        // بالصور بتلاقيه
        Button btn = findViewById(R.id.Butiion_id);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getBaseContext(), "Hello From Activity", Toast.LENGTH_SHORT).show();
                }
            });
    }
}