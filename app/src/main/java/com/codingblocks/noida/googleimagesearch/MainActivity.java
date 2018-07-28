package com.codingblocks.noida.googleimagesearch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private TextView textView;
    private EditText editText;
    private Button submitButton;
    private ImageView imageView;


    private Button left;
    private Button right;

    private ArrayList<String> images;   // create list ref

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("testing", "onCreate");

        images = new ArrayList<>();  // create empty list

        images.add("http://rabbits.life/wp-content/uploads/2013/06/Background-rabbits-life-little.jpg");
        images.add("https://caldervets.co.uk/wp-content/uploads/2016/06/Dental-Hygiene-For-Rabbits-970x546.jpg");
        images.add("http://112vet.ro/wp-content/uploads/112vet-Mixomatoza-.jpg");

        textView = findViewById(R.id.text);
        editText = findViewById(R.id.edit);
        submitButton = findViewById(R.id.submit);
        imageView = findViewById(R.id.image);

        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "I clicked this", Toast.LENGTH_SHORT).show();

                String line = editText.getText().toString();
                textView.setText(line);

            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index > 0){
                    index--;

                    Picasso.get().load(images.get(index)).into(imageView);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < images.size() - 1){
                    index++;

                    Picasso.get().load(images.get(index)).into(imageView);
                }
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
