package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view) {
        ImageView picture=(ImageView) findViewById(R.id.android_cookie_image_view);
        TextView tv=(TextView)findViewById(R.id.status_text_view);
        picture.setImageResource(R.drawable.after_cookie);
        tv.setText("I'm so full");
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}
