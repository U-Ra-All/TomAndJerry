package com.android.uraall.tomandjerry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {

        /*if (isTomVisible) {
            ImageView tomImageView = findViewById(R.id.tomImageView);
            tomImageView.animate().alpha(0).rotation(tomImageView.getRotation() + 3600)
            .scaleY(0).scaleX(0).setDuration(3000);

            ImageView jerryImageView = findViewById(R.id.jerryImageView);
            jerryImageView.animate().alpha(1).rotation(jerryImageView.getRotation() + 3600)
                    .scaleY(1).scaleX(1).setDuration(3000);

            isTomVisible = false;
        } else {
            ImageView tomImageView = findViewById(R.id.tomImageView);
            tomImageView.animate().alpha(1).rotation(tomImageView.getRotation() + 3600)
                    .scaleY(1).scaleX(1).setDuration(3000);

            ImageView jerryImageView = findViewById(R.id.jerryImageView);
            jerryImageView.animate().alpha(0).rotation(jerryImageView.getRotation() + 3600)
                    .scaleY(0).scaleX(0).setDuration(3000);

            isTomVisible = true;
        }*/

        ImageView tom = findViewById(R.id.tomImageView);
        ImageView jerry = findViewById(R.id.jerryImageView);
        tom.animate().alpha(jerry.getAlpha()).rotation(tom.getRotation()+3600).scaleX((jerry.getScaleX())).scaleY((jerry.getScaleY())).setDuration(2000);
        jerry.animate().alpha(tom.getAlpha()).rotation(jerry.getRotation()+3600).scaleX((tom.getScaleX())).scaleY((tom.getScaleY())).setDuration(2000);




    }
}
