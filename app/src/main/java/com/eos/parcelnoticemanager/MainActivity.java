package com.eos.parcelnoticemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnParcelRegister, btnRoomRegister, btnRewardRegister, btnNoticeRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnParcelRegister = findViewById(R.id.button_main_parcel);
        btnRoomRegister = findViewById(R.id.button_main_room);
        btnRewardRegister = findViewById(R.id.button_main_reward);
        btnNoticeRegister = findViewById(R.id.button_main_notice);

        /*btnParcelRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParcelRegisterActivity.class);
                startActivity(intent);
            }
        });

        btnRoomRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RoomRegisterActivity.class);
                startActivity(intent);
            }
        });

        btnRewardRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RewardRegisterActivity.class);
                startActivity(intent);
            }
        });

        btnNoticeRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoticeRegisterActivity.class);
                startActivity(intent);
            }
        });*/
    }
}