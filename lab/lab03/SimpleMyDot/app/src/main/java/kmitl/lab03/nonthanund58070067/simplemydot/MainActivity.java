package kmitl.lab03.nonthanund58070067.simplemydot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import kmitl.lab03.nonthanund58070067.simplemydot.model.Dot;
import kmitl.lab03.nonthanund58070067.simplemydot.view.DotView;

public class MainActivity extends AppCompatActivity implements Dot.DotChangedListener{
    private Dot dot;
    private DotView dotView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dot = new Dot(this,0,0,20);

        dotView = (DotView)findViewById(R.id.DotView);
    }

    public void onRandomDot(View view) {
        Random random = new Random();
        dot.setCenterX(random.nextInt(dotView.getWidth()));
        dot.setCenterY(random.nextInt(dotView.getHeight()));


    }



    @Override
    public void onDotChangedListener(Dot dot) {
//        TextView center_x = (TextView)findViewById(R.id.CenterX);
//        TextView center_y = (TextView)findViewById(R.id.CenterY);
//        center_x.setText(String.valueOf(dot.getCenterX()));
//        center_y.setText(String.valueOf(dot.getCenterY()));
        dotView.setDot(dot);
        dotView.invalidate();
    }
}
