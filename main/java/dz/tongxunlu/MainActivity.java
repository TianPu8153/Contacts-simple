package dz.tongxunlu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button3,button4,button5,button6,button7,button8,button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button1=(Button)findViewById(R.id.button1);
        button1=(Button)findViewById(R.id.button2);

    }

    protected void dianjirenming1(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13171243822"));
        MainActivity.this.startActivity(intent);
        }
    protected void dianjirenming2(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"18647385511"));
        MainActivity.this.startActivity(intent);
    }
    protected void dianjirenming3(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"18586108602"));
        MainActivity.this.startActivity(intent);
    }
    protected void dianjirenming4(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13664776475"));
        MainActivity.this.startActivity(intent);
    }
    protected void dianjirenming5(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"13780393210"));
        MainActivity.this.startActivity(intent);
    }
    protected void dianjirenming6(View view){
        Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"15833659942"));
        MainActivity.this.startActivity(intent);
    }
    protected void xiayiye(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,dieryejava.class);
        startActivity(intent);
    }
    protected void shangyiye(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,diwuyejava.class);
        startActivity(intent);
    }

    }


