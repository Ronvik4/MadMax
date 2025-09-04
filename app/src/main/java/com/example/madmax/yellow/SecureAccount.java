package com.example.madmax.yellow;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.madmax.R;

import android.app.DatePickerDialog;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class SecureAccount extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secure_account);

        EditText birthdayInput = findViewById(R.id.birthdayInput);

        birthdayInput.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(
                    this,
                    (view, selectedYear, selectedMonth, selectedDay) -> {

                        Calendar selectedDate = Calendar.getInstance();
                        selectedDate.set(selectedYear, selectedMonth, selectedDay);

                        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy", Locale.getDefault());
                        birthdayInput.setText(sdf.format(selectedDate.getTime()));
                    },
                    year, month, day
            );

            dialog.getDatePicker().setMaxDate(System.currentTimeMillis());

            dialog.show();
        });

    }

}
