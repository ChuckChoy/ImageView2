package com.example.nikol.imageview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView catview,dogView;
    //create an array that holds the resource ids in the drawable
    public Integer[] catResources = {
            R.drawable.cat0, R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5,
            R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9, R.drawable.cat10, R.drawable.cat11, R.drawable.cat12,
            R.drawable.cat13, R.drawable.cat14
    };
    public Integer[] dogResources = {
            R.drawable.sample_1, R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catview = findViewById(R.id.imgViewCatAct2);
        Button buttonRandCat = findViewById(R.id.buttonRandCat);
        buttonRandCat.setOnClickListener(new View.OnClickListener() {
            Random rand = new Random();

            @Override
            public void onClick(View v) {
                //generate a random value between 0 and cats.length
                int index = rand.nextInt(catResources.length);
                //use the setImageResource method defined in
                //ImageView class
                catview.setImageResource(catResources[index]);
            }
        });

        dogView = findViewById(R.id.imgDog);
        Button btnRandDog = findViewById(R.id.btnRandDog);
        btnRandDog.setOnClickListener(new View.OnClickListener() {
            Random rand = new Random();

            @Override
            public void onClick(View v) {
                //generate a random value between 0 and cats.length
                int index = rand.nextInt(dogResources.length);
                //use the setImageResource method defined in
                //ImageView class
                dogView.setImageResource(dogResources[index]);
            }
        });
    }
}


