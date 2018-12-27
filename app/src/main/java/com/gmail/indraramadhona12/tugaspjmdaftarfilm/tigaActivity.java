package com.gmail.indraramadhona12.tugaspjmdaftarfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
public class tigaActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextNama;
    private EditText editTextTahun;
    private EditText editTextGenre;
    private EditText editTextDesc;
    private EditText editTextLink;

    private Button buttonAdd;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);
        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextTahun = (EditText) findViewById(R.id.editTextTahun);
        editTextGenre = (EditText) findViewById(R.id.editTextGenre);
        editTextDesc = (EditText) findViewById(R.id.editTextDesc);
        editTextLink = (EditText) findViewById(R.id.editTextLink);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonView = (Button) findViewById(R.id.buttonView);

        //Setting listeners to button
        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);
    }


    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addEmployee(){

        final String nama = editTextNama.getText().toString().trim();
        final String desc = editTextDesc.getText().toString().trim();
        final String genre = editTextGenre.getText().toString().trim();
        final String tahun = editTextTahun.getText().toString().trim();
        final String link = editTextLink.getText().toString().trim();

        class AddEmployee extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(tigaActivity.this,
                        "Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(tigaActivity.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(konfigurasi.KEY_EMP_NAMA,nama);
                params.put(konfigurasi.KEY_EMP_DESKRIPSI,desc);
                params.put(konfigurasi.KEY_EMP_GENRE,genre);
                params.put(konfigurasi.KEY_EMP_TAHUN,tahun);
                params.put(konfigurasi.KEY_EMP_LINK,link);

                RequestHandler rh = new RequestHandler(

                );
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }

        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonAdd){
            addEmployee();
        }

        if(v == buttonView){
            startActivity(new Intent(this,tampilSemuaPgw.class));
        }
    }
}
