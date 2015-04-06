package sample;

import javafx.scene.canvas.GraphicsContext;


/**
 * Created by Вероника on 22.03.2015.
 */
public class DrawOval extends ShapeDraw{
    @Override
    public void drawShape(GraphicsContext g, Shape sh){
        Oval oval = (Oval)sh;
        g.fillOval(oval.getX(), oval.getY(), oval.getR1(), oval.getR2());
    }
}
