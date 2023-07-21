package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    double ans = 0;
    Button lastClickedButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.cal);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        textView.startAnimation(animation);
        EditText e1 = findViewById(R.id.et1);
        EditText e2 = findViewById(R.id.et2);
        EditText e3 = findViewById(R.id.res);
        Button b1 = findViewById(R.id.add);
        Button b2 = findViewById(R.id.sub);
        Button b3 = findViewById(R.id.mul);
        Button b4 = findViewById(R.id.div);
        Button b5 = findViewById(R.id.percent);
        Button equal = findViewById(R.id.equals);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetLastClickedButtonColor();
                b1.setBackgroundColor(Color.WHITE);
                lastClickedButton = b1;
                double no1 = Double.parseDouble(e1.getText().toString());
                double no2 = Double.parseDouble(e2.getText().toString());
                ans = no1 + no2;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetLastClickedButtonColor();
                b2.setBackgroundColor(Color.WHITE);
                lastClickedButton = b2;
                double no1 = Double.parseDouble(e1.getText().toString());
                double no2 = Double.parseDouble(e2.getText().toString());
                ans = no1 - no2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetLastClickedButtonColor();
                b3.setBackgroundColor(Color.WHITE);
                lastClickedButton = b3;
                double no1 = Double.parseDouble(e1.getText().toString());
                double no2 = Double.parseDouble(e2.getText().toString());
                ans = no1 * no2;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetLastClickedButtonColor();
                b4.setBackgroundColor(Color.WHITE);
                lastClickedButton = b4;
                double no1 = Double.parseDouble(e1.getText().toString());
                double no2 = Double.parseDouble(e2.getText().toString());
                ans = no1 / no2;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetLastClickedButtonColor();
                b5.setBackgroundColor(Color.WHITE);
                lastClickedButton = b5;
                // Retrieve input values and convert to double
                double no1 = Double.parseDouble(e1.getText().toString());
                double no2 = Double.parseDouble(e2.getText().toString());
                // Perform percentage calculation
                ans = (no1 / no2) * 100;
                // Display the result
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String ans1 = String.valueOf(ans);
                e3.setText(ans1);
                ans = 0;
            }
        });
    }
    private void resetLastClickedButtonColor() {
        if (lastClickedButton != null) {
            lastClickedButton.setBackgroundColor(Color.TRANSPARENT); // Set the default color here
        }
    }
}