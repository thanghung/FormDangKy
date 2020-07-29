package com.example.formdangky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class HienThi extends AppCompatActivity {

    Button back;
    TextView ten,sdt,gt,Qtich,Cthich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi);
        back = (Button) findViewById(R.id.Trolai);
        ten = (TextView) findViewById(R.id.htdlTen);
        sdt= (TextView) findViewById(R.id.htdlSDT);
        gt = (TextView) findViewById(R.id.htdlGT);
        Qtich = (TextView) findViewById(R.id.htdlQT);
        Cthich = (TextView) findViewById(R.id.htdlCT);

        Show_Data();
    }

    public void Show_Data()
    {
        try {
            Intent intent = getIntent();
            ten.setText(intent.getStringExtra("Ten"));
            sdt.setText(intent.getStringExtra("SDT"));
            gt.setText(intent.getStringExtra("GT"));
            Qtich.setText(intent.getStringExtra("QT"));
            Cthich.setText(intent.getStringExtra("CT"));
        }
       catch (Exception v)
       {
           Toast.makeText(HienThi.this, "loi ", Toast.LENGTH_SHORT).show();
       }
    }

    public void Back_Click(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
