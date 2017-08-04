package com.mutatioapps.ovalrippleeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final OvalRipple rippleBackground=(OvalRipple) findViewById(R.id.content);
        rippleBackground.startRippleAnimation();
    }
}
