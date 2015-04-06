package sample;

/**
 * Created by Вероника on 21.03.2015.
 */
public class Oval extends  Shape {
    int x;
    int y;
    int r1;
    int r2;
    int getX(){
        return x;
    }

    int getY(){
        return y;
    }
    int getR1(){
        return r1;
    }
    int getR2(){
        return r2;
    }
    Oval(int x1,int y1, int r01,int r02){
        x=x1;
        y=y1;
        r1=r01;
        r2=r02;
    }
}
