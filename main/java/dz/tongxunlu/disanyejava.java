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

public class disanyejava extends AppCompatActivity {

    private TextView textView;
    private Button button23,button24,button25,button26,button27,button28,button21,button22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disanye);
        textView = (TextView) findViewById(R.id.textView3);
        button23=(Button)findViewById(R.id.button23);
        button24=(Button)findViewById(R.id.button24);
        button25=(Button)findViewById(R.id.button25);
        button26=(Button)findViewById(R.id.button26);
        button27=(Button)findViewById(R.id.button27);
        button28=(Button)findViewById(R.id.button28);
        button21=(Button)findViewById(R.id.button21);
        button21=(Button)findViewById(R.id.button22);

    }

    protected void dianjirenming21(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15174905230"));
        disanyejava.this.startActivity(intent);
    }
    protected void dianjirenming22(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13296913915"));
        disanyejava.this.startActivity(intent);
    }
    protected void dianjirenming23(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13514895253"));
        disanyejava.this.startActivity(intent);
    }
    protected void dianjirenming24(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15661339441"));
        disanyejava.this.startActivity(intent);
    }
    protected void dianjirenming25(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15647210312"));
        disanyejava.this.startActivity(intent);
    }
    protected void dianjirenming26(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13011562496"));
        disanyejava.this.startActivity(intent);
    }
    protected void shangyiye2(View view) {
        Intent intent = new Intent();
        intent.setClass(disanyejava.this, dieryejava.class);
        disanyejava.this.startActivity(intent);
    }
    protected void xiayiye2(View view) {
        Intent intent = new Intent();
        intent.setClass(disanyejava.this, disiyejava.class);
        disanyejava.this.startActivity(intent);
    }

}
