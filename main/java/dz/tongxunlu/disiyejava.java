package dz.tongxunlu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static dz.tongxunlu.R.id.button4;
import static dz.tongxunlu.R.id.button5;
import static dz.tongxunlu.R.id.button6;
import static dz.tongxunlu.R.id.button7;
import static dz.tongxunlu.R.id.button8;
import static dz.tongxunlu.R.id.textView;


/**
 * Created by 天瀑 on 2017/11/11.
 */

public class disiyejava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disiye);

    }


    protected void dianjirenming11(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13644729590"));
        disiyejava.this.startActivity(intent);
    }
    protected void dianjirenming12(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13948423912"));
        disiyejava.this.startActivity(intent);
    }
    protected void dianjirenming13(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15849289181"));
        disiyejava.this.startActivity(intent);
    }
    protected void dianjirenming14(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"6887530"));
        disiyejava.this.startActivity(intent);
    }
    protected void dianjirenming15(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"6887536"));
        disiyejava.this.startActivity(intent);
    }
    protected void dianjirenming16(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"6887539"));
        disiyejava.this.startActivity(intent);
    }

    protected void shangyiye1(View view){
        Intent intent = new Intent();
        intent.setClass(disiyejava.this,disanyejava.class);
        disiyejava.this.startActivity(intent);
    }
    protected void xiayiye1(View view){
        Intent intent = new Intent();
        intent.setClass(disiyejava.this,diwuyejava.class);
        disiyejava.this.startActivity(intent);
    }
}