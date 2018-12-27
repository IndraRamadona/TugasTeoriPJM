package com.gmail.indraramadhona12.tugaspjmdaftarfilm;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class judulDua extends AppCompatActivity{
    private EditText editTextId;
    private EditText editTextNama;
    private EditText editTextDesc;
    private EditText editTextGenre;
    private EditText editTextTahun;
    private EditText editTextLink;


    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.judul_2);

        Intent intent = getIntent();

        id = intent.getStringExtra(konfigurasi.EMP_ID);

        editTextId = (EditText) findViewById(R.id.editTextId);
        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextTahun = (EditText) findViewById(R.id.editTextTahun);
        editTextGenre = (EditText) findViewById(R.id.editTextGenre);
        editTextDesc = (EditText) findViewById(R.id.editTextDesc);
        editTextLink = (EditText) findViewById(R.id.editTextLink);

        editTextId.setText(id);

        getEmployee();
    }

    private void getEmployee() {
        class GetEmployee extends AsyncTask<Void, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(judulDua.this, "Fetching...", "Wait...",
                        false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showEmployee(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(konfigurasi.URL_GET_EMP, id);
                return s;
            }
        }
        GetEmployee ge = new GetEmployee();
        ge.execute();
    }

    private void showEmployee(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(konfigurasi.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String nam = c.getString(konfigurasi.TAG_NAMA);
            String des = c.getString(konfigurasi.TAG_DESKRIPSI);
            String genr = c.getString(konfigurasi.TAG_GENRE);
            String tahu = c.getString(konfigurasi.TAG_TAHUN);
            String lin = c.getString(konfigurasi.TAG_LINK);

            editTextNama.setText(nam);
            editTextDesc.setText(des);
            editTextGenre.setText(genr);
            editTextTahun.setText(tahu);
            editTextLink.setText(lin);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
