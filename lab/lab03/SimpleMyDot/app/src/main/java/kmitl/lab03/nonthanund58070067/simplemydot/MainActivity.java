package kmitl.lab03.nonthanund58070067.simplemydot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import kmitl.lab03.nonthanund58070067.simplemydot.model.Dot;
import kmitl.lab03.nonthanund58070067.simplemydot.view.DotView;

public class MainActivity extends AppCompatActivity implements Dot.DotChangedListener{
    private Dot dot;
    private DotView dotView;
    private ArrayList<Dot> dot_list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dot = new Dot(this,0,0,20);

        dotView = (DotView)findViewById(R.id.DotView);
    }

    public void onRandomDot(View view) {
        Dot new_dot = new Dot(this,0,0,20);
        Random random = new Random();
        new_dot.setCenterX(random.nextInt(dotView.getWidth()));
        new_dot.setCenterY(random.nextInt(dotView.getHeight()));
        new_dot.setRed(random.nextInt(256));
        new_dot.setGreen(random.nextInt(256));
        new_dot.setBlue(random.nextInt(256));

        dot_list.add(new_dot);

    }

    public void deleteDot(View view)
    {
        dot_list.clear();
        dotView.invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();
        Dot dot_touch = new Dot(this,0,0,20);
        Random random = new Random();

        dot_touch.setCenterX(x);
        dot_touch.setCenterY(y);
        dot_touch.setRed(random.nextInt(256));
        dot_touch.setGreen(random.nextInt(256));
        dot_touch.setBlue(random.nextInt(256));

        dot_list.add(dot_touch);

        return false;
    }



    @Override
    public void onDotChangedListener(Dot dot) {
//        TextView center_x = (TextView)findViewById(R.id.CenterX);
//        TextView center_y = (TextView)findViewById(R.id.CenterY);
//        center_x.setText(String.valueOf(dot.getCenterX()));
//        center_y.setText(String.valueOf(dot.getCenterY()));
        dotView.setDot_list(dot_list);
        dotView.invalidate();
    }
}