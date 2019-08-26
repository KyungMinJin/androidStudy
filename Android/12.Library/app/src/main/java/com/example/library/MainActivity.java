package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewOne;
    ImageView imageViewTwo;
    ImageView imageViewThree;
    ImageView imageViewFour;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        imageViewOne = findViewById(R.id.image_one);
        imageViewTwo = findViewById(R.id.image_two);
        imageViewThree = findViewById(R.id.image_three);
        imageViewFour = findViewById(R.id.image_four);

        //웹 이미지 넣기
        Glide.with(context)
                .load("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/golden-retriever-royalty-free-image-506756303-1560962726.jpg?crop=1.00xw:0.752xh;0,0.0625xh&resize=600:*")
                .into(imageViewOne);

        //옵션 사용방법
        RequestOptions cropOption = new RequestOptions().centerCrop();
        Glide.with(context)
                .load("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/golden-retriever-royalty-free-image-506756303-1560962726.jpg?crop=1.00xw:0.752xh;0,0.0625xh&resize=600:*")
                .apply(cropOption)
                .into(imageViewTwo);

        //원 옵션 사용
        RequestOptions circleCrop = new RequestOptions().circleCrop();
        Glide.with(context)
                .load("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/golden-retriever-royalty-free-image-506756303-1560962726.jpg?crop=1.00xw:0.752xh;0,0.0625xh&resize=600:*")
                .apply(circleCrop)
                .into(imageViewThree);

        //로컬 이미지 불러오는 방법
        Glide.with(context).load(R.drawable.ic_launcher_background).into(imageViewFour);
    }
}
