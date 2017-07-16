package tech.infinitedev.shifu.vocapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by shifu on 7/11/17.
 */

public class HasilTes extends AppCompatActivity {
    TextView tvSkor;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_tes);

        tvSkor = (TextView) findViewById(R.id.tv_skor);

        Intent pindah = getIntent();
        tvSkor.setText(pindah.getStringExtra("skor"));
    }
}
