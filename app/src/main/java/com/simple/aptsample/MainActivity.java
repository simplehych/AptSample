package com.simple.aptsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.simple.apt_annotaion.BindView;
import com.simple.apt_libarary.BindViewTools;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindViewTools.bind(this);
        mTextView.setText("women");
    }
}
