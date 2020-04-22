package com.example.gestos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView norte;
    private StringBuilder builder=new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        norte=findViewById(R.id.norte);
        norte.setOnTouchListener(new Maneja());
    }

    private class Maneja implements View.OnTouchListener{


        @Override
        public boolean onTouch(View v, MotionEvent event) {


            switch (event.getAction()){
                case MotionEvent.ACTION_DOWN:{
                    builder.append("Down");
                    break;
                }

                case MotionEvent.ACTION_MOVE:{
                    builder.append("Mover");
                    break;
                }

                case MotionEvent.ACTION_UP:{
                    builder.append("UP");
                    break;
                }

            }
            norte.setText(builder);

            return true;
        }
    }

}
