package com.example.formdangky;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button DK;
    Spinner spinner;
    EditText tbTen, tbSdt;
    RadioButton nam, nu;
    TextInputEditText hint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DK = (Button) findViewById(R.id.Dangky);
        tbTen= (EditText) findViewById(R.id.tbTen);
        tbSdt= (EditText) findViewById(R.id.tbSDT);
        spinner = (Spinner) findViewById(R.id.chonquoctich);
        nam= (RadioButton) findViewById(R.id.Nam);
        nu= (RadioButton) findViewById(R.id.Nu);
        hint = (TextInputEditText) findViewById(R.id.hint) ;

        List<String> list = new ArrayList<>();
        list.add("Việt Nam");
        list.add("Mỹ");
        list.add("Canada");

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(adapter);
    }

    public void DK_Click(View v)
    {
        String a;
        Intent intent = new Intent(this, HienThi.class);
        intent.putExtra("Ten",tbTen.getText().toString());
        intent.putExtra("SDT", tbSdt.getText().toString());

        if(nam.isChecked())
            intent.putExtra("GT",nam.getText().toString());
        else
            if(nu.isChecked())
                intent.putExtra("GT",nu.getText().toString());

            intent.putExtra("QT",spinner.getSelectedItem().toString());
        intent.putExtra("CT",hint.getText().toString());
        startActivity(intent);

    }

    public void Huy_Click(View v)
    {
        System.exit(0);
    }
}
