package com.example.myswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layout_1 ;
    ImageView   img_view ;
    Switch      switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_1 = findViewById(R.id.layout_1);
        img_view = findViewById(R.id.img_view);
        switch1 = findViewById(R.id.switch1);


        findViewById(R.id.switch1).setOnClickListener(this);
        findViewById(R.id.radio_button1).setOnClickListener(this);
        findViewById(R.id.radio_button2).setOnClickListener(this);
        findViewById(R.id.radio_button3).setOnClickListener(this);
        findViewById(R.id.btn_begin).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ( v.getId() ){
            case R.id.switch1: //클릭했으면 아래그림 보이게, 아니면 안보이게
                if (switch1.isChecked())
                    layout_1.setVisibility(View.VISIBLE);
                else
                    layout_1.setVisibility(View.INVISIBLE);
                break;

            case R.id.radio_button1: //그림바꾸기
                img_view.setImageResource(R.drawable.an8);
                break;

            case R.id.radio_button2: //그림바꾸기
                img_view.setImageResource(R.drawable.an9);
                break;

            case R.id.radio_button3: //그림바꾸기
                img_view.setImageResource(R.drawable.an10);
                break;

            case R.id.btn_begin:     //초기화(스위치가 클릭되지 않은 상태로)
 //               switch1.setChecked(false);
 //               layout_1.setVisibility(View.INVISIBLE);
                switch1.performClick();
                break;

            case R.id.btn_exit:
                finish();//종료
                break;

        }

    }
}