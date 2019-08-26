package com.example.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PhoneBook> phoneBookList;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        PhoneBook phoneBook1 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-0011");
        PhoneBook phoneBook2 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1011");
        PhoneBook phoneBook3 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1111");
        PhoneBook phoneBook4 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1211");
        PhoneBook phoneBook5 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1311");
        PhoneBook phoneBook6 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1411");
        PhoneBook phoneBook7 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1511");
        PhoneBook phoneBook8 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1611");
        PhoneBook phoneBook9 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1711");
        PhoneBook phoneBook10 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1811");
        PhoneBook phoneBook11 = new PhoneBook("https://st4.depositphotos.com/5128971/20662/i/1600/depositphotos_206624478-stock-photo-shanghai-china-jan-2017-night.jpg",
                "홍길동",
                "010-1111-1911");


        phoneBookList = new ArrayList<>();
        phoneBookList.add(phoneBook1);
        phoneBookList.add(phoneBook2);
        phoneBookList.add(phoneBook3);
        phoneBookList.add(phoneBook4);
        phoneBookList.add(phoneBook5);
        phoneBookList.add(phoneBook6);
        phoneBookList.add(phoneBook7);
        phoneBookList.add(phoneBook8);
        phoneBookList.add(phoneBook9);
        phoneBookList.add(phoneBook10);
        phoneBookList.add(phoneBook11);

        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        for(int i=0; i < phoneBookList.size(); i++) {
            View view = layoutInflater.inflate(R.layout.phone_book_item_view, null, false);
            TextView name = view.findViewById(R.id.name);
            TextView number =  view.findViewById(R.id.number);
            ImageView imageView = view.findViewById(R.id.imageView);

            name.setText(phoneBookList.get(i).name);
            number.setText(phoneBookList.get(i).number);
            RequestOptions circleOption = new RequestOptions().circleCrop();
            Glide.with(MainActivity.this)
                    .load(phoneBookList.get(i).image)
                    .apply(circleOption)
                    .into(imageView);
            final int finalI = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String number = phoneBookList.get(finalI).number;
                    Log.d("test","number: " + number);
                }
            });
            container.addView(view);
        }
    }
}
