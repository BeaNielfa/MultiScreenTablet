package com.example.multiscreentablet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layoutContenedor = (LinearLayout) findViewById(R.id.contenedor);

        if (layoutContenedor != null){
            //TABLET
        }else{
            //MOVUL
        }
    }
}
