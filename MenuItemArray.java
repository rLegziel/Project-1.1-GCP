package group2;
/*
Elliot's MenuItemArray class (Circle subclass, Vertex superclass)
*/

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/*
This class extends the circle class.
This is so that the Vertex class (Which inherit from this class) can use circle's methods for node coloring
 */

public class MenuItemArray extends Circle {
    public static String[] colorArray = ColorArray.getColorArray(); //Array containing colors (See ColorArray)
    public MenuItem[] menuItemArray = new MenuItem[51];
    public int[][] ar = RandomNodes.array; //The AdjArray of the current game
    protected int index; //Index of this vertex
    public int colorIndex = 100; //Default uncolored colorindex
    public boolean selected = false; //Used in gamemode 3
    public static int currentVertex; //Used in gamemode 3
    public static int[] doneColors = new int[51]; //Initialised in Menu
    private int oldColor = 100;
    public static int userChromatic; //Current user Chromatic Number

//	protected boolean error = true;


    /*
    Each vertex also constructs a context menu. This is the menu where you choose the color of a vertex.
    We have added 51 different Color options. Each of these options is 1 of the MenuItems.
    When clicked, a menuItem first checks to see if the color selection is legal. This is done with
    the connectedColor method. If the chosen option was illegal (Choosing a color that is equal to the
    color of a connected vertex), the color gets reset and the menu is closed. If the chosen option is legal
    the following happens:
    First we check the old color to potentially remove it from the doneColor array (Uses checkRemoveColor method)
    We then color the vertex in the color corresponding to the chosen menu item.
    Then we check the gamemode that's being played. If gamemode 3 was selected in the Menu Class, the menu item
    also tells the program to select the next vertex to be colored and set it's stroke (To show which one has
    to be colored). Also resets the current stroke.
    Finally we add the chosen color to our doneColor array with the checkDoneColor method and checks if the game
    has finished with the isFinished method.
     */
    public MenuItemArray(double RADIUS) {
        super(RADIUS);

        MenuItem item0 = new MenuItem("Neon Red");
        item0.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                oldColor = colorIndex;
                setColorIndex(0);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");

                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[0]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(1);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    error = true;
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[1]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(2);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[2]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(3);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[3]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(4);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[4]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(5);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[5]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(6);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[6]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(7);
                boolean error = true;

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[7]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(8);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[8]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(9);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[9]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(10);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[10]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(11);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[11]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(12);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[12]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(13);

                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[13]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
                }
                boolean end = isFinished(VertexArray.vertexArray, RandomNodes.vertices);
                System.out.println(end);
                if (end == true) {
                    System.out.println("DONE!!!!!!!!!!");
                }
            }
        }));
        menuItemArray[13] = item13;

        MenuItem item14 = new MenuItem("Black");
        item14.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                boolean error = true;
                oldColor = colorIndex;
                setColorIndex(14);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[14]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(15);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[15]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(16);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[16]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(17);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[17]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(18);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[18]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(19);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[19]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(20);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[20]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(21);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[21]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(22);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[22]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(23);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[23]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(24);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[24]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(25);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[25]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(26);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[26]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(27);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[27]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(28);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[28]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(29);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[29]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(30);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[30]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(31);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[31]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(32);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[32]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(33);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[33]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(34);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[34]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(35);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[35]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(36);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[36]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(37);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[37]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(38);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[38]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(39);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[39]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(40);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[40]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(41);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[41]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(42);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[42]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(43);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[43]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(44);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[44]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(45);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[45]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(46);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[46]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(47);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[47]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(48);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[48]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(49);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[49]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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
                oldColor = colorIndex;
                setColorIndex(50);
                error = connectedColor(ar, index);
                System.out.println("this index is " + index);
                System.out.println("this color index is " + getColorIndex());
                if (error == false) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("you fucking idiot");
                    errorAlert.setContentText("you cannot choose this color");
                    errorAlert.showAndWait();
                    System.out.println("nah");
                    resetColorIndex();
                } else {
                    checkRemoveColor(oldColor);
                    setFill(Color.web(colorArray[50]));
                    if (Menu.gamemode == 3) {
                        selected = false;
                        currentVertex++;
                        setStroke(Color.web(colorArray[colorIndex]));
                        VertexArray.vertexArray[currentVertex].select();
                    }
                    checkDoneColor(colorIndex);
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

    /**
     * does xyz
     * @return  the menuItemArray
     */
    public MenuItem[] getMenuItemArray() {
        return menuItemArray;
    }
    /*
    a method that checks if the vertex is connected to another with the same color, takes in 2 @params
    1)int[][] adjMat is the adjacency matrix of our graph
    2)int index is the index of the vertex we want to check

    return false if there is another vertex connected in the same colors, otherwise returns true.
     */

    public static boolean connectedColor(int[][] adjMat, int index) {
        for (int j = 0; j < adjMat.length; j++) {
            if (j != index && adjMat[index][j] == 1) {
                if (VertexArray.vertexArray[index].getColorIndex() == VertexArray.vertexArray[j].getColorIndex() && VertexArray.vertexArray[index].getColorIndex() != 100) {
                    return false;
                }
            }

        }
        return true;
    }

    /*
    a method that sets the colorIndex, takes in 1 @param:
    1)int color, the new colorIndex we want to set.
     */

    public void setColorIndex(int color) {
        colorIndex = color;

    }
    /*
    a method that returns the colorIndex.
     */

    public int getColorIndex() {
        return colorIndex;
    }


                 /*
                 isFinished is the method that checks if the user finished coloring, it takes 2 @params
                 1)Vertex[] vArray, the vertexArray
                 2)int vertices, the amount of vertices
                 it checks if all vertices are colored, and will go through the whole vArray to check.
                 if its game mode is 1, it will only return true if the amount of colors the user used is the actual
                 chromatic number.
                 this method will return true if the game is finished, and false if not.

                  */
    public static boolean isFinished(Vertex[] vArray, int vertices) {
        int doneCount = 0;
        for (int i = 0; i < vertices; i++) {
            if (vArray[i].getColorIndex() != 100) {
                doneCount++;
            }
        }
        System.out.println("doneCount is  " + doneCount);
        if (doneCount == vertices) {
            if ((Menu.gamemode == 1 && userChromatic == Menu.chromaticNUM) ||  (Menu.gamemode == 3)) {
                Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
                errorAlert.setHeaderText("you fucking genius");
                errorAlert.setContentText("you managed to finish");
                errorAlert.showAndWait();
                return true;
            } else if (Menu.gamemode == 2) {
                Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
                errorAlert.setHeaderText("Game Over");
                int numColors = numberOfColors();
                errorAlert.setContentText("you colored with " + numColors + " and the chromatic number is :" + Menu.chromaticNUM );
                errorAlert.showAndWait();
                return true;
            }
        }
        return false;
    }
    /*
             resetColorIndex resets the colorIndex to its previous colorIndex, mostly to the default:100.
              */
    public void resetColorIndex() {
        colorIndex = oldColor;
    }

    public void select() {
        selected = true;
        this.setStrokeWidth(4);
        this.setStroke(Color.CYAN);
    }
         /*
         highestSaturation is one of our hint methods, it takes 1 @params
         1)int[][] adjMat is the adjacency
         it finds the index of the vertex that has the highest saturation-
         the vertex that has the most colored vertex connected to it.
         it  iterates the adjacency matrix, checks the amount of edges to each vertex and how many of them are currently colored.
         it returns the index of this vertex.
          */

    public static int highestSaturation(int[][] adjMat) {
        int highestIndex = 0;
        int currentHigh = 0;
        int connectionCounter = 0;

        for (int i = 0; i < adjMat[0].length; i++) {
            for (int j = 0; j < adjMat.length; j++) {
                if (adjMat[i][j] == 1) {
                    if (VertexArray.vertexArray[j].getColorIndex() != 100) {
                        connectionCounter++;
                    }
                }

            }
            if (connectionCounter > currentHigh && VertexArray.vertexArray[i].getColorIndex() == 100) {
                currentHigh = connectionCounter;
                highestIndex = i;
            }
            connectionCounter = 0;
        }
        return highestIndex;
    }

         /**
         setWhite takes one parameter
         @param  index is the index of the vertex
         it colors the Vertex in that index in the default WHITE color.
         this method is used in the highestDegree method, to color the index
         with the highest degree, meaning it has the most edges.
          */

    public static void setWhite(int index) {
        VertexArray.vertexArray[index].setFill(Color.ANTIQUEWHITE);
        VertexArray.vertexArray[index].setStroke(Color.BLACK);
        VertexArray.vertexArray[index].setColorIndex(100);
    }
         /**
         setSalmon takes 1 @params
         1)int index is the index of the vertex
         it colors the Vertex in that index in the default DARKSALMON color.
         this method is used in the highestSaturation method, to color the index
         with the highest saturation.
          */

    public static void setSalmon(int index) {
        VertexArray.vertexArray[index].setFill(Color.DARKSALMON);
        VertexArray.vertexArray[index].setStroke(Color.BLACK);
        VertexArray.vertexArray[index].setColorIndex(100);
    }

    /**
     * checkDoneColor is a method that adds newly used colors to the doneColor array
     * The doneColor array is initialized in the Menu class at the start of a game
     * This method runs through the array, looking for colors with the same index as
     * the parameter. If none are found it means the user is adding a new color. This
     * is then added to the doneColor array. It also updates the GUI to show the user his/her
     * chromatic number.
     * @param nColor
     */

    public void checkDoneColor(int nColor) {
        boolean stop = false;
        for (int i = 0; i < doneColors.length; i++) {
            if (doneColors[i] == nColor) {
                stop = true;
            }
        }
        if (stop != true) {
            for (int j = 0; j < doneColors.length; j++) {
                if (doneColors[j] == -1) {
                    doneColors[j] = nColor;
                    j = j + 100;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < doneColors.length; i++) {
            System.out.println(doneColors[i]);
            if (doneColors[i] != -1) {
                counter++;
            }
        }
        userChromatic = counter;
        Menu.setCurrentChrom(counter);
    }

    /**
     * This method is used to check if the user has managed to reduce their chromatic number.
     * The parameter is the old color of a vertex before it gets recolored. Every other vertex
     * is then checked to see if there are any other vertices with the old color of this vertex.
     * If there are no others with the old color, it is removed from the doneColors array by
     * changing it to -1 (Represents "No color" in the doneColor array
     * @param color The old color of the vertec
     */

    public void checkRemoveColor(int color) {
        boolean keep = false;
        if (color != 100) {
            for (int i = 0; i < VertexArray.vertexArray.length; i++) {
                if (VertexArray.vertexArray[i].getColorIndex() == color) {
                    keep = true;
                }
            }
            if (keep != true) {
                for (int j = 0; j < doneColors.length; j++) {
                    if (doneColors[j] == color) {
                        doneColors[j] = -1;
                    }
                }
            }
        }

    }

    /**
    colorNext is one of our hint methods, it takes 2 @parameter
     1)int[][] adjMat is the adjacency matrix for our graph
     2) int highestSaturationIndex is the index with the highest degree of saturation, gotten from highestSaturation method.
     The method will check the colors that the user used, and try to use a color that was already used first.
     if that isn't possible, it would add another color, going from colorIndex[50] backwards.
     add the isFinished here

		*/

    public static void colorNext(int[][] adjMat, int highestSaturationIndex) {
        int actualColored = 0;
        for (int i = 0; i < doneColors.length; i++) {
            if (doneColors[i] != -1) {
                actualColored++;
            }
        }
        for (int j = 0; j < actualColored; j++) {
            VertexArray.vertexArray[highestSaturationIndex].setColorIndex(doneColors[j]);
            if (connectedColor(adjMat, highestSaturationIndex) == true) {
                int currentColorIndex = VertexArray.vertexArray[highestSaturationIndex].getColorIndex();
                VertexArray.vertexArray[highestSaturationIndex].setFill(Color.web(colorArray[currentColorIndex]));
                break;
            } else {
                VertexArray.vertexArray[highestSaturationIndex].resetColorIndex();
            }
        }
        int color = 50;
        if (VertexArray.vertexArray[highestSaturationIndex].getColorIndex() == 100) {
            VertexArray.vertexArray[highestSaturationIndex].setColorIndex(color);
            while (connectedColor(adjMat, highestSaturationIndex) != true) {
                color--;
                VertexArray.vertexArray[highestSaturationIndex].setColorIndex(color);
            }

            VertexArray.vertexArray[highestSaturationIndex].checkDoneColor(color);

            VertexArray.vertexArray[highestSaturationIndex].setFill(Color.web(colorArray[color]));
        }
    }

    /**
     * numberOfColors is a method that counts the number of the colors used by the user, it basically takes the
     doneColors array(which has the colors it used).
     @return an integer which is the number of colors that were used
		*/

    public static int numberOfColors() {
        int counter = 0;
        for (int i = 0; i < doneColors.length; i++) {
            System.out.println(doneColors[i]);
            if (doneColors[i] != -1) {
                counter++;
            }
        }
        return counter;
    }
}

