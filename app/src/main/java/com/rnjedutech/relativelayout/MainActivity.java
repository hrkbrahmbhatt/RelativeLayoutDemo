package com.rnjedutech.relativelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);


        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams relativePrams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(relativePrams);
        setContentView(relativeLayout);

        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams textViewParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        textViewParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        textViewParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textViewParams.setMargins(0,82,0,0);
        textView.setText(R.string.Hello);
        textView.setLayoutParams(textViewParams);

        relativeLayout.addView(textView);


        ImageView imageView = new ImageView(this);
        RelativeLayout.LayoutParams imageViewParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);


        //imageView.setX();

        imageView.setLayoutParams(imageViewParams)  ;
        imageView.getLayoutParams().height = 500;
        imageView.getLayoutParams().width = 500;
        imageViewParams.addRule(RelativeLayout.CENTER_IN_PARENT);
       // imageView.setX(250);
       // imageView.setY(250);
        imageView.setImageResource(R.drawable.pinguin1);
        relativeLayout.addView(imageView);









    }
}
