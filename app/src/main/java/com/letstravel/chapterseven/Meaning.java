package com.letstravel.chapterseven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Meaning extends AppCompatActivity {
private TextView txtmen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meaning);

        txtmen=findViewById(R.id.txtmen);

        Bundle bundle=getIntent().getExtras();
        if(bundle !=null){
            String men=bundle.getString("meaning");
            txtmen.setText(men);
        }
    }
}
