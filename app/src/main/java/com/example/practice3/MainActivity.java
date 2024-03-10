package com.example.practice3;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.firstText);
        textView.setBackgroundColor(getColor(R.color.green));
        textView.setTextColor(getColor(R.color.black));
        textView.setText("Какой то текст");

        TextView secondText = findViewById(R.id.secondText);
        secondText.setBackgroundColor(getColor(R.color.blue));
        secondText.setTextColor(getColor(R.color.white));

        TextView thirdText = findViewById(R.id.thirdText);
        thirdText.setBackgroundColor(getColor(R.color.yellow));
        thirdText.setTextColor(getColor(R.color.black));
        thirdText.setText("Ну а что поделать");


        ConstraintLayout.LayoutParams layoutParamsTextView = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT);

        layoutParamsTextView.verticalWeight = 10;


        ConstraintLayout.LayoutParams layoutParamsSecondText =
                (ConstraintLayout.LayoutParams) secondText.getLayoutParams();


        ConstraintLayout.LayoutParams layoutParamsThreeText =
                (ConstraintLayout.LayoutParams) thirdText.getLayoutParams();

        int margin60InDP = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,60,getResources().getDisplayMetrics());

        int margin20InDP = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,20,getResources().getDisplayMetrics());

        layoutParamsTextView.setMargins(
                margin60InDP,
                margin20InDP,
                margin60InDP,
                margin20InDP);



        layoutParamsTextView.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParamsTextView.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParamsTextView.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParamsTextView.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

        layoutParamsTextView.verticalBias = 1f;

        textView.setLayoutParams(layoutParamsTextView);
        secondText.setLayoutParams(layoutParamsSecondText);
        thirdText.setLayoutParams(layoutParamsThreeText);
    }

}