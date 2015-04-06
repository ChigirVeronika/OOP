package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import java.util.ArrayList;


public class Controller {
    @FXML AnchorPane MyAnchorPane;
    @FXML private Button btnDraw;
    @FXML public ToggleGroup groupOfShapes;
    @FXML RadioButton shPoint;
    @FXML RadioButton shLine;
    @FXML RadioButton shOval;
    @FXML RadioButton shTriangle;
    @FXML RadioButton shRectangle;
    @FXML TextField coorX;
    @FXML TextField coorY;
    @FXML TextField shWidth;
    @FXML TextField shHeight;
    @FXML Pane shPane;

    @FXML
    public void initialize(){
        coorX.setText("0");
        coorY.setText("0");
        shWidth.setText("0");
        shHeight.setText("0");

        //пробная ересь.блин!
        final Canvas canvas = new Canvas(250,250);
        GraphicsContext g = canvas.getGraphicsContext2D();
        g.setFill(Color.BLUE);
        g.fillRect(75,75,100,100);
        g.fillOval(40,40,40,40);
        shPane.getChildren().add(canvas);

        //ненужная ересь.вывод текста в консоль
        shPoint.setUserData("You draw point");
        shLine.setUserData("You draw line");
        shOval.setUserData("You draw oval");
        shTriangle.setUserData("You draw triangle");
        shRectangle.setUserData("You draw rectangle");


        shPane.setStyle("-fx-background-color: #F5DEB3;");


        ArrayList allShapes = new ArrayList();
        allShapes.add(shPoint);
        allShapes.add(shLine);
        allShapes.add(shOval);
        allShapes.add(shTriangle);
        allShapes.add(shRectangle);
//allShapes.get(0)

        btnDraw.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                //а вот и суть бытия этой проги, которая работает!!!!туц-туц-туц!!!

                //check the filling of fields
                int x = Integer.parseInt(coorX.getText());
                int y = Integer.parseInt(coorY.getText());
                int width = Integer.parseInt(shWidth.getText());
                int height = Integer.parseInt(shHeight.getText());

                if (groupOfShapes.getSelectedToggle() == shPoint) {
//                  draw point
                    Line userPoint = new Line(x,y,x,y);
                    userPoint.setFill(Color.ORANGE);
                    shPane.getChildren().addAll(userPoint);
                }
                if (groupOfShapes.getSelectedToggle() == shOval) {
                    Oval userOval = new Oval(x,y,width,height);
                    DrawOval userDrawOval = new DrawOval();

                    final Canvas canvas = new Canvas(250,250);
                    GraphicsContext g = canvas.getGraphicsContext2D();

                    //что делать с g

                    shPane.getChildren().add(canvas);

                    //userEllipse.setFill(Color.ORANGE);
                    //shPane.getChildren().addAll(userEllipse);
                }

                //JOptionPane.showMessageDialog(null,"Empty field!");

                //all is working. just create!
            }
        });
    }

}