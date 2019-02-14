package com.example.hp.implicitintenet;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btncamera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivity(i);
            }
        });
        findViewById(R.id.btnbrowser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent();
                b.setAction(Intent.ACTION_VIEW);
                b.setData(Uri.parse("http://www.google.com/"));
                startActivity(Intent.createChooser(b,"Title"));
            }
        });
        findViewById(R.id.btncall).setOnClickListener(new View.OnClickListener() {
            final EditText et=findViewById(R.id.etno);
            @Override
            public void onClick(View v) {
                Intent c=new Intent();
                c.setAction(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:"+et.getText()));
                startActivity(c);
            }
        });
        findViewById(R.id.btnmessage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent();
                s.setAction(Intent.ACTION_VIEW);
                s.setData(Uri.parse("sms:"));
                startActivity(s);
            }
        });
    }
}
