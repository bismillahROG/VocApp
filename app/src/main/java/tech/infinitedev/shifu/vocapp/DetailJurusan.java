package tech.infinitedev.shifu.vocapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by shifu on 7/12/17.
 */

public class DetailJurusan extends AppCompatActivity {
    TextView tvJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_jurusan);

        tvJurusan = (TextView) findViewById(R.id.tvJurusan);

        Intent pindah = getIntent();

        tvJurusan.setText(pindah.getStringExtra("jurusan"));

    }

}
