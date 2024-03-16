package com.example.midtermgevariyajalak;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputMeters = findViewById(R.id.input_meters);
        Button convertButton = findViewById(R.id.convert_button);
        TextView resultTextView = findViewById(R.id.result_text_view);
        TextView developerInfoTextView = findViewById(R.id.developer_info);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String metersStr = inputMeters.getText().toString();
                if (!metersStr.isEmpty()) {
                    double meters = Double.parseDouble(metersStr);
                    double millimeters = meters * 1000;
                    resultTextView.setText(String.format("%.2f meters = %.2f millimeters", meters, millimeters));
                } else {
                    resultTextView.setText("Please enter a value in meters.");
                }
            }
        });
    }
}
