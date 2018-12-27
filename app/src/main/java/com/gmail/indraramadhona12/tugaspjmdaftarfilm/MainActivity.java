package com.gmail.indraramadhona12.tugaspjmdaftarfilm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void login(View v) {

        Intent intent = new Intent(this, SecondActivity.class);
        this.startActivity(intent);

    }
    public void genre(View v) {

        Intent intent2 = new Intent(this, genre.class);
        this.startActivity(intent2);

    }
    public void judul(View v) {

        Intent intent3 = new Intent(this, judul.class);
        this.startActivity(intent3);

    }


}

