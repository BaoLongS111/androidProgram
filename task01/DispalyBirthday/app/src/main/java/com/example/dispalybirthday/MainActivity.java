package com.example.dispalybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class MainActivity extends AppCompatActivity {

    private TextView tvBirthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
    }

    private void initComponent(){
        tvBirthday = findViewById(R.id.text_birthday);

        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
        Date date = new Date();
        tvBirthday.setText("祝生日为"+formatter.format(date)+"的同学生日快乐！");
    }
}