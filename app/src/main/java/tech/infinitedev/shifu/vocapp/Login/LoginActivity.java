package tech.infinitedev.shifu.vocapp.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import tech.infinitedev.shifu.vocapp.R;

public class LoginActivity extends Activity implements OnClickListener {

    private EditText etFName, etLName;

    Button btnSubmit;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etFName = (EditText) findViewById(R.id.etFName);
        etLName = (EditText) findViewById(R.id.etLName);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, tech.infinitedev.shifu.vocapp.MainActivity.class);
        intent.putExtra("fname", etFName.getText().toString());
        intent.putExtra("lname", etLName.getText().toString());
        startActivity(intent);
        finish();
    }
}