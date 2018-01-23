package dz.tongxunlu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static dz.tongxunlu.R.id.button24;
import static dz.tongxunlu.R.id.button4;
import static dz.tongxunlu.R.id.button5;
import static dz.tongxunlu.R.id.button6;
import static dz.tongxunlu.R.id.button7;
import static dz.tongxunlu.R.id.button8;

/**
 * Created by 天瀑 on 2017/11/11.
 */

public class diwuyejava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diwuye);


    }

    protected void dianjirenming21(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15661453686"));
        diwuyejava.this.startActivity(intent);
    }
    protected void dianjirenming22(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15947329330"));
        diwuyejava.this.startActivity(intent);
    }
    protected void dianjirenming23(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"3347860"));
        diwuyejava.this.startActivity(intent);
    }
    protected void dianjirenming24(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13947233826"));
        diwuyejava.this.startActivity(intent);
    }
    protected void dianjirenming25(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13084724178"));
        diwuyejava.this.startActivity(intent);
    }
    protected void dianjirenming26(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15247294132"));
        diwuyejava.this.startActivity(intent);
    }
    protected void shangyiye2(View view) {
        Intent intent = new Intent();
        intent.setClass(diwuyejava.this, disiyejava.class);
        diwuyejava.this.startActivity(intent);
    }
    protected void xiayiye2(View view) {
        Intent intent = new Intent();
        intent.setClass(diwuyejava.this, MainActivity.class);
        diwuyejava.this.startActivity(intent);
    }

}
