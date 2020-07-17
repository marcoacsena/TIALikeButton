package com.example.tialikebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.like.LikeButton;
import com.like.OnLikeListener;

public class MainActivity extends AppCompatActivity {

    private LikeButton star_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        star_button = findViewById(R.id.star_button);

        star_button.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
    }
}