package kmitl.lab03.nonthanund58070067.simplemydot.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

import kmitl.lab03.nonthanund58070067.simplemydot.model.Dot;


public class DotView extends View {

    private Paint paint;
    private Dot dot;

    public ArrayList<Dot> getDot_list() {
        return dot_list;
    }

    public void setDot_list(ArrayList<Dot> dot_list) {
        this.dot_list = dot_list;
    }

    private ArrayList<Dot> dot_list = new ArrayList<>();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(Dot dot: dot_list) {
            if (dot != null) {
                paint.setARGB(210,dot.getRed(),dot.getGreen(),dot.getBlue());
                canvas.drawCircle(dot.getCenterX(), dot.getCenterY(), 30, paint);
            }
        }

    }

    public DotView(Context context) {
        super(context);
        paint = new Paint();
    }

    public DotView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public DotView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }


}
