package com.letstravel.chapterseven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AddWords extends AppCompatActivity {
EditText txtword, txtmeaning;
Button btnAddWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_words);

        txtword=findViewById(R.id.txtWord);
        txtmeaning=findViewById(R.id.txtMeaning);
        btnAddWord=findViewById(R.id.btnAddWord);
        btnAddWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();
            }
        });
    }
   private void Save()

    {
        try {
          PrintStream  printStream = new PrintStream(openFileOutput("words.txt", MODE_PRIVATE | MODE_APPEND));
            printStream.println(txtword.getText().toString() +"->" +txtmeaning.getText().toString());
            Toast.makeText(this, "Saved Successfully", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            Log.d("Dictionary app", "Error" + e.toString());
            e.printStackTrace();
        }
    }
}
