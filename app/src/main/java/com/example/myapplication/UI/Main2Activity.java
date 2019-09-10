package com.example.myapplication.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Database.guys;
import com.example.myapplication.R;

public class Main2Activity extends AppCompatActivity {

    private Button button;
    private EditText Name;
    private EditText Stat;
    private EditText Boolean;
    private String NameST;
    private String had;
    private String statST;
    private int stat;
    private int counter = 0 ;
    private guys[] allguys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        allguys = new guys[65];

        Name = findViewById(R.id.edittextName);
        Stat = findViewById(R.id.edittextStatus);
        Boolean = findViewById(R.id.edittextHad);
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click();
            }
        });

    }

    private void click() {
        NameST = Name.getText().toString();
        statST = Stat.getText().toString();
        had = Boolean.getText().toString();
         boolean pizza = (had.equals("true") );
        int finalValue = Integer.parseInt(statST);
        allguys[counter] = new guys(NameST,finalValue,pizza);
        Toast.makeText(this, pizza + "", Toast.LENGTH_SHORT).show();
        counter++;

    }
}
