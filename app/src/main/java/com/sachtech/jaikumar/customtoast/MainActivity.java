package com.sachtech.jaikumar.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflater=getLayoutInflater();
    }
    public void callToast(String message)
    {
        Toast toast=new Toast(MainActivity.this);
        View view=inflater.inflate(R.layout.custom_toast_layout,null);
        TextView textView=(TextView)view.findViewById(R.id.toast_tv);
        textView.setText(message);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }
    public void buttonClick(View view)
    {
        callToast("Custom Toast Display");
    }
}
