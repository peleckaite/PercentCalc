package ems.vtvpmc.percentcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    SeekBar seekBar;
    TextView textViewPercent;
    TextView textViewFirst;
    TextView textViewSecond;
    TextView textViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        seekBar = findViewById(R.id.seekBar);
        textViewPercent = findViewById(R.id.textViewFirst);
        textViewSecond = findViewById(R.id.textViewSecond);
        textViewTotal = findViewById(R.id.textViewTotal);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            textViewPercent.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
