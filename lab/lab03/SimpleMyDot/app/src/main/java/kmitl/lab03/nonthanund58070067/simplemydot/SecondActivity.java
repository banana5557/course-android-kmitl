package kmitl.lab03.nonthanund58070067.simplemydot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kmitl.lab03.nonthanund58070067.simplemydot.model.DotParcelable;
import kmitl.lab03.nonthanund58070067.simplemydot.model.DotSerializable;

public class SecondActivity extends AppCompatActivity {
    private Button button;
    private DotSerializable dot2;
    private DotParcelable dot3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = (Button)findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView text = (TextView)findViewById(R.id.textView);
        TextView text2 = (TextView)findViewById(R.id.textView2);
        int x = getIntent().getIntExtra("xValue",0);
        //text.setText(getStringExtra(x));
        dot2 = (DotSerializable)getIntent().getSerializableExtra("dot");
        dot3 =  getIntent().getParcelableExtra("dot1");
        text.setText(String.valueOf(x));
        //text2.setText(dot2.toString());
        text2.setText(dot3.toString());




    }
}
