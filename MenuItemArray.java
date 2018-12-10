import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.event.EventHandler;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.geom.Point2D;
import java.awt.Point;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.Alert;

import java.util.EventObject;

import javafx.event.Event;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.control.Control;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.ColorPicker;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.Object;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Control;
import javafx.scene.control.ChoiceBox;

import java.lang.Object;

import javafx.stage.Window;
import javafx.stage.PopupWindow;
import javafx.scene.control.PopupControl;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

/*
Elliot's MenuItemArray class (Circle subclass, Vertex superclass)
*/

public class MenuItemArray extends Circle {
    public String[] colorArray = ColorArray.getColorArray();
    public MenuItem[] menuItemArray = new MenuItem[92];
    public int[][] ar = RandomNodes.array;
    protected int index;
    public int colorIndex = 100;
//	protected boolean error = true;

    public MenuItemArray(double RADIUS) {
        super(RADIUS);

        MenuItem item0 = new MenuItem("Neon Red");
        item0.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(0);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[0]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }

            }
        }));
        menuItemArray[0] = item0;

        MenuItem item1 = new MenuItem("Dark Green");
        item1.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(1);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    error = true;
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[1]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }

            }
        }));
        menuItemArray[1] = item1;

        MenuItem item2 = new MenuItem("Neon Yellow");
        item2.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;

                setColorIndex(2);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[2]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[2] = item2;

        MenuItem item3 = new MenuItem("Blue");
        item3.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;

                setColorIndex(3);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[3]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[3] = item3;

        MenuItem item4 = new MenuItem("Neon Orange");
        item4.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(4);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[4]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[4] = item4;

        MenuItem item5 = new MenuItem("Purple");
        item5.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(5);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[5]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[5] = item5;

        MenuItem item6 = new MenuItem("Neon Light Blue");
        item6.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(6);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[6]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[6] = item6;

        MenuItem item7 = new MenuItem("Neon Pink");
        item7.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                setColorIndex(7);
                boolean error = true;

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[7]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[7] = item7;

        MenuItem item8 = new MenuItem("Neon Green");
        item8.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(8);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[8]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[8] = item8;

        MenuItem item9 = new MenuItem("Neon Dark Pink");
        item9.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;

                setColorIndex(9);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[9]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[9] = item9;

        MenuItem item10 = new MenuItem("Sea Green");
        item10.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(10);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[10]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[10] = item10;

        MenuItem item11 = new MenuItem("Brown");
        item11.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(11);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[11]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[11] = item11;

        MenuItem item12 = new MenuItem("Swamp Green");
        item12.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(12);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[12]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[12] = item12;

        MenuItem item13 = new MenuItem("Navy Blue");
        item13.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(13);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[13]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[13] = item13;

        MenuItem item14 = new MenuItem("Honeysuckle");
        item14.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(14);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[14]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[14] = item14;

        MenuItem item15 = new MenuItem("Light Sea Green");
        item15.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setFill(Color.web(colorArray[15]));
                error = connectedColor(ar, index);
                setColorIndex(15);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                } else {
                    setFill(Color.web(colorArray[15]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[15] = item15;

        MenuItem item16 = new MenuItem("Dark Grey");
        item16.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(16);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[16]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[16] = item16;

        MenuItem item17 = new MenuItem("Intense Orange");
        item17.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(17);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[17]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[17] = item17;

        MenuItem item18 = new MenuItem("Intense Baby Blue");
        item18.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(18);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[18]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[18] = item18;

        MenuItem item19 = new MenuItem("Metallic Yellow");
        item19.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(19);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[19]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[19] = item19;

        MenuItem item20 = new MenuItem("Sky Blue");
        item20.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(20);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[20]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[20] = item20;

        MenuItem item21 = new MenuItem("Light Liliac");
        item21.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(21);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[21]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[21] = item21;

        MenuItem item22 = new MenuItem("Vibrant Purple");
        item22.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(22);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[22]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[22] = item22;

        MenuItem item23 = new MenuItem("Royal Blue");
        item23.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(23);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[23]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[23] = item23;

        MenuItem item24 = new MenuItem("Pastel Blue");
        item24.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(24);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[24]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[24] = item24;

        MenuItem item25 = new MenuItem("Vampire Purple");
        item25.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(25);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[25]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[25] = item25;

        MenuItem item26 = new MenuItem("Powder Blue");
        item26.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(26);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[26]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[26] = item26;

        MenuItem item27 = new MenuItem("Green Algae");
        item27.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(27);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[27]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[27] = item27;

        MenuItem item28 = new MenuItem("Neon Light Green");
        item28.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(28);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[28]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[28] = item28;

        MenuItem item29 = new MenuItem("Carrot Orange");
        item29.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(29);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[29]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[29] = item29;

        MenuItem item30 = new MenuItem("Mysterious Purple");
        item30.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(30);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[30]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[30] = item30;

        MenuItem item31 = new MenuItem("Spring Green");
        item31.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(31);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[31]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[31] = item31;

        MenuItem item32 = new MenuItem("Cadet Blue");
        item32.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(32);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[32]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[32] = item32;

        MenuItem item33 = new MenuItem("Orange Red");
        item33.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(33);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[33]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[33] = item33;

        MenuItem item34 = new MenuItem("Pastel Yellow");
        item34.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(34);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setColorIndex(34);
                    setFill(Color.web(colorArray[34]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[34] = item34;

        MenuItem item35 = new MenuItem("Baby Pink");
        item35.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(35);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[35]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[35] = item35;

        MenuItem item36 = new MenuItem("Light Sea Blue");
        item36.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(36);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[36]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[36] = item36;

        MenuItem item37 = new MenuItem("Firebrick");
        item37.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(37);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[37]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[37] = item37;

        MenuItem item38 = new MenuItem("Light Sea Green");
        item38.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(38);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[38]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[38] = item38;

        MenuItem item39 = new MenuItem("Cornflower Blue");
        item39.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(39);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[39]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[39] = item39;

        MenuItem item40 = new MenuItem("Tan Orange");
        item40.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(40);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[40]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[40] = item40;

        MenuItem item41 = new MenuItem("Dim Grey");
        item41.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(41);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[41]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[41] = item41;

        MenuItem item42 = new MenuItem("Empress");
        item42.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(42);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[42]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[42] = item42;

        MenuItem item43 = new MenuItem("Peach Puff");
        item43.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(43);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[43]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[43] = item43;

        MenuItem item44 = new MenuItem("Magenta");
        item44.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(44);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[44]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[44] = item44;

        MenuItem item45 = new MenuItem("Indian Red");
        item45.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(45);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[45]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[45] = item45;

        MenuItem item46 = new MenuItem("Coral");
        item46.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(46);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[46]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[46] = item46;

        MenuItem item47 = new MenuItem("Maroon");
        item47.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(47);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[47]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[47] = item47;

        MenuItem item48 = new MenuItem("Yellow Green");
        item48.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(48);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[48]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[48] = item48;

        MenuItem item49 = new MenuItem("Rosy Brown");
        item49.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(49);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    setFill(Color.web(colorArray[49]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[49] = item49;

        MenuItem item50 = new MenuItem("Azure");
        item50.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                setColorIndex(50);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {

                    setFill(Color.web(colorArray[50]));
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[50] = item50;


    }

    public MenuItem[] getMenuItemArray() {
        return menuItemArray;
    }

    public boolean connectedColor(int[][] adjar, int index) { // method that takes in the adj matrix and the index of file we want to check
        for (int j = 0; j < adjar.length; j++) {
            if (j != index && adjar[index][j] == 1) {
                if (VertexArray.vertexArray[index].getColorIndex() == VertexArray.vertexArray[j].getColorIndex() && VertexArray.vertexArray[index].getColorIndex() != 100) {
                    return false;
                }
            }

        }
        return true;
    }


    public void setColorIndex(int color) {
        colorIndex = color;

    }

    public int getColorIndex() {
        return colorIndex;
    }

    public int getIndex() {
        return index;
    }

    public boolean isFinished(Vertex[] vArray, int vertices) {
        int doneCount = 0;
        for (int i = 0; i < vertices; i++) {
            if (vArray[i].getColorIndex() != 100) {
                doneCount++;
            }
        }
        System.out.println("doneCount is  " + doneCount);
        if (doneCount == vertices) {
            Alert errorAlert = new Alert(AlertType.INFORMATION);
            errorAlert.setHeaderText("you fucking genius");
            errorAlert.setContentText("you managed to finish");
            errorAlert.showAndWait();
            return true;
        }
        return false;
    }

    public static int highestSaturation(int[][] adjMat){
        int highestIndex = 0;
        int currentHigh = 0;
        int connectionCounter =0;

        for(int i = 0;i<adjMat[0].length;i++){
            for (int j = 0;j<adjMat.length;j++){
                if (adjMat[i][j] == 1){
                    if(VertexArray.vertexArray[j].getColorIndex() != 100){
                        connectionCounter++;
                    }
                }

            }
            if(connectionCounter > currentHigh && VertexArray.vertexArray[i].getColorIndex() == 100 ){
                currentHigh = connectionCounter;
                highestIndex = i;
            }
            connectionCounter =0;
        }
     return highestIndex;
    }

    public void resetColorIndex() {
        colorIndex = 100;
    }

    public static void setWhite(int index) {
        VertexArray.vertexArray[index].setFill(Color.ANTIQUEWHITE);
        VertexArray.vertexArray[index].setStroke(Color.BLACK);
        VertexArray.vertexArray[index].setColorIndex(100);
    }
    public static void setSalmon(int index) {
        VertexArray.vertexArray[index].setFill(Color.DARKSALMON);
        VertexArray.vertexArray[index].setStroke(Color.BLACK);
        VertexArray.vertexArray[index].setColorIndex(100);
    }


}
	

