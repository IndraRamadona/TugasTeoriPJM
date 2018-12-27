package com.gmail.indraramadhona12.tugaspjmdaftarfilm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class genre extends AppCompatActivity {

    private Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_1);

    }

    public void pilih(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.action:
                if (checked)
                    intent = new Intent(genre.this, genreAction.class);
                startActivity(intent);
                break;
            case R.id.comedy:
                if (checked)
                    intent = new Intent(genre.this, genreComedy.class);
                startActivity(intent);
                break;
            case R.id.horor:
                if (checked)
                    intent = new Intent(genre.this, genreHoror.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

