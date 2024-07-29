package com.example.camerapreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.camerapreview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'camerapreview_' library on application startup.
    static {
        System.loadLibrary("songstudio");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText("1111111");
        startActivity(new Intent(this,CameraPreviewActivity.class));
    }

    /**
     * A native method that is implemented by the 'camerapreview_' native library,
     * which is packaged with this application.
     */

}