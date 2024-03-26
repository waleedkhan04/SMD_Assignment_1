package com.example.smd_assignment1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import com.example.smd_assignment1.ImageAdapter;

public class ProfileActivity extends AppCompatActivity {

    private GridView mGridView;

    // Dummy array of image resource IDs
    private final int[] mPostImages = {
            R.drawable.post_image_1,
            R.drawable.post_image_2,
            R.drawable.post_image_3,
            // Add more image resource IDs here as needed
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        // Initialize GridView
        mGridView = findViewById(R.id.postGrid);

        // Set adapter to populate GridView
        mGridView.setAdapter(new ImageAdapter(this, mPostImages));

        ImageButton homeButton = findViewById(R.id.homeIcon);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ProfileActivity
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
