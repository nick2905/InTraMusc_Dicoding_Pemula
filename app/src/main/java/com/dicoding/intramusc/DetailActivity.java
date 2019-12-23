package com.dicoding.intramusc;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_page);
        Log.d(TAG,"onCreate: started.");
        getIncomingIntent();
    }
    private void getIncomingIntent(){
        Log.d(TAG,"getIncomingIntent: checking for incoming intents.");
        if(getIntent().hasExtra("Image_url") && getIntent().hasExtra("Name") && getIntent().hasExtra("Remarks") && getIntent().hasExtra("Deskri")){
            Log.d(TAG,"getIncomingIntent: found intent extras.");
            String imageUrl = getIntent().getStringExtra("Image_url");
            String name = getIntent().getStringExtra("Name");
            String remarks = getIntent().getStringExtra("Remarks");
            String desc = getIntent().getStringExtra("Deskri");
            setImage(imageUrl,name,remarks,desc);
        }
    }

    private void setImage(String Image_Url, String Name, String Remarks, String Deskri){
        Log.d(TAG, "setImage: setting te image and name to widgets.");
        TextView nama = findViewById(R.id.tv_item_name);
        nama.setText(Name);
        TextView descripsi = findViewById(R.id.tv_item_remarks);
        descripsi.setText(Remarks);
        TextView deskrip = findViewById(R.id.tv_item_desc);
        deskrip.setText(Deskri);

        ImageView image = findViewById(R.id.img_item_photo);
        Glide.with(this)
                .asBitmap()
                .load(Image_Url)
                .into(image);
    }
}
