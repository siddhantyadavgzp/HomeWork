package com.apress.gerber.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {
    private Button button;
    private TextView text;
    private String t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar1= findViewById(R.id.toolbar);
        setActionBar(toolbar1);
        if (getIntent().hasExtra("text"))
        t1=getIntent().getStringExtra("text");
    earthIsRound();
    thisIsHowWeDo();
    }
    public void earthIsRound()
    {
        text=(TextView)findViewById(R.id.textViewn);
        text.setText(t1);
    }
    public void thisIsHowWeDo(){

        button=(Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               finish();
            }
        });

    }



}
