package com.codingblocks.noida.googleimagesearch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView textView;
    private EditText editText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("testing", "onCreate");

        textView = findViewById(R.id.text);
        editText = findViewById(R.id.edit);
        submitButton = findViewById(R.id.submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "I clicked this", Toast.LENGTH_SHORT).show();

                String line = editText.getText().toString();
                textView.setText(line);

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("testing", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("testing", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("testing", "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("testing", "onRestart");

    }
}
