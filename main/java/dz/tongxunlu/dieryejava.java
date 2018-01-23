package dz.tongxunlu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by 天瀑 on 2017/11/11.
 */

public class dieryejava extends AppCompatActivity {
    private TextView textView2;
    private Button button3,button4,button5,button6,button7,button8,button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dierye);
        textView2 = (TextView) findViewById(R.id.textView2);
        button3=(Button)findViewById(R.id.button13);
        button4=(Button)findViewById(R.id.button14);
        button5=(Button)findViewById(R.id.button15);
        button6=(Button)findViewById(R.id.button16);
        button7=(Button)findViewById(R.id.button17);
        button8=(Button)findViewById(R.id.button18);
        button1=(Button)findViewById(R.id.button11);
        button1=(Button)findViewById(R.id.button12);

    }


    protected void dianjirenming11(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15028835190"));
        dieryejava.this.startActivity(intent);
    }
    protected void dianjirenming12(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"4152081"));
        dieryejava.this.startActivity(intent);
    }
    protected void dianjirenming13(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15647201004"));
        dieryejava.this.startActivity(intent);
    }
    protected void dianjirenming14(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"05914118844"));
        dieryejava.this.startActivity(intent);
    }
    protected void dianjirenming15(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13337199921"));
        dieryejava.this.startActivity(intent);
    }
    protected void dianjirenming16(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15034733810"));
        dieryejava.this.startActivity(intent);
    }

    protected void shangyiye1(View view){
        Intent intent = new Intent();
        intent.setClass(dieryejava.this,MainActivity.class);
        dieryejava.this.startActivity(intent);
    }
    protected void xiayiye1(View view){
        Intent intent = new Intent();
        intent.setClass(dieryejava.this,disanyejava.class);
        dieryejava.this.startActivity(intent);
    }
}
