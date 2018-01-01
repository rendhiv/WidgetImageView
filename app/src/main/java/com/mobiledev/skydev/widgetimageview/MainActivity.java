package com.mobiledev.skydev.widgetimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button nextImage, previousImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
        nextImage = (Button) findViewById(R.id.next_image);
        previousImage = (Button) findViewById(R.id.previous_image);
        previousImage.setVisibility(View.INVISIBLE);
    }
    public void nextImage(View view) {
        imageView.setImageResource(R.mipmap.ic_launcher);
        previousImage.setVisibility(View.VISIBLE);
        nextImage.setVisibility(View.INVISIBLE);
    }
    public void previousImage(View view) {
        imageView.setImageResource(R.drawable.ic_launcher_background);
        previousImage.setVisibility(View.INVISIBLE);
        nextImage.setVisibility(View.VISIBLE);
    }
}
