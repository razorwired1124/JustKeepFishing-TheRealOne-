package com.example.s530671.gallery;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void camera(View v){
        Intent cameraIntent= new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        startActivity(cameraIntent);
    }

    public void gallery(View v){
        Intent gallery=new Intent(this,MainActivity.class);
        startActivity(gallery);
    }
}
