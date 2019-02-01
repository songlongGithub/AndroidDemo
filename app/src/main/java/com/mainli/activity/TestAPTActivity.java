package com.mainli.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mainli.R;
import com.mainli.annotations.BindView;


/**
 * Created by Mainli on 2018-3-26.
 * 日志文件 放在D:\processor-log.txt
 */
public class TestAPTActivity extends AppCompatActivity {
    @BindView(R.id.bottom)
    TextView tx;
    @BindView(88888)
    TextView helloWorld;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText(com.mainli.processor.Log.log);
        setContentView(textView);
    }
}