package sample;

import javafx.scene.shape.Line;

/**
 * Created by Вероника on 22.03.2015.
 */
public abstract class Point extends Shape{
    int x;
    int y;
    int getX(){
        return  x;
    }
    int getY(){
        return  y;
    }

    public void draw(int x1, int y1){

    }
}
