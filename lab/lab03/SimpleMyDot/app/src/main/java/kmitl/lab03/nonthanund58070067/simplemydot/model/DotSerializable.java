package kmitl.lab03.nonthanund58070067.simplemydot.model;

import java.io.Serializable;

/**
 * Created by student on 9/8/2017 AD.
 */

public class DotSerializable implements Serializable {
    public interface DotChangedListener{
        void onDotChangedListener(DotSerializable dot);
    }
    private DotChangedListener listener;

    public void setListener(DotChangedListener listener) {
        this.listener = listener;
    }
    private int centerX;
    private int centerY;
    private int radius;
    private int red;
    private int green;
    private int blue;

    @Override
    public String toString() {
        return "DotSerializable{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }



    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public DotSerializable(DotChangedListener listener, int centerX, int centerY, int radius) {
        this.listener = listener;
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;


    }
    public DotSerializable()
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
