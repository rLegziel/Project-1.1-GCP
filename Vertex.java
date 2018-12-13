package group2;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.util.Random;

/**
 * Contributed by: Elliot, Roy, Lina, Iga, Mihai
 * Version: 4
 * 12.12.2018
 * Vertex class extends MenuItemArray class.
 * It contains all the properties of the MenuItemArray class
 * necessary for a program to work the way we want.
 * Vertex has a radius and the coordinates.
 */

public class Vertex extends MenuItemArray
{
    private static int counter = 0;
    private final static int WIDTH = 1000;
    private final static int HEIGHT = 500;
    private final static double RADIUS = 15;
    public static String[] colorArray = ColorArray.getColorArray();
    public int[][] ar = RandomNodes.array;
    public int r=400; // int r - the radius of the circle formed by the vertices(setLocation())


    /**
     * Construct a vertex without a parameter.
     * Set x-coordinate to a random location.
     * Set y-coordinate to a random location.
     * Adds all the menu items to color's menu
     */

    public Vertex(){
        super(RADIUS);
        setRLocation();
        index = counter;
        counter++;
        ContextMenu colorMenu = new ContextMenu();
        MenuItem[] menuItemArray = getMenuItemArray();




        for(int i=0; i<51;i++){
            colorMenu.getItems().addAll(menuItemArray[i]);
        }

        this.setOnMouseClicked((new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){
                MouseButton butt = e.getButton();
                if ((Menu.gamemode == 3 && selected == true) || Menu.gamemode < 3) {
                    if (butt == MouseButton.SECONDARY) {
                        Point2D b = new Point2D(e.getX(), e.getY());
                        colorMenu.show(Menu.root, b.getX(), b.getY());
                        colorMenu.setHideOnEscape(true);
                    }
                }
            }}));
        setUpDragging(this);
    }

    /**
     * Takes a vertex as a parameter.
     * Responsible for a "drag-and-drop" function.
     * Tracks the mouse's movement.
     * @param circle
     */

    private void setUpDragging(Vertex circle) {

        circle.setOnDragDetected(event -> {
            circle.getParent().setCursor(Cursor.CLOSED_HAND);

            circle.setCenterX(event.getSceneX());
            circle.setCenterY(event.getSceneY());
        });

        circle.setOnMouseReleased(event -> {
            circle.getParent().setCursor(Cursor.DEFAULT);
            circle.setCenterX(event.getSceneX());
            circle.setCenterY(event.getSceneY());

        });
    }

    /**
     * Set the location of the vertices so that they form a circle.
     * Takes number of vertices, so that are "separated" by the same angle.
     * @param v - number of vertices in a given graph
     */

    public void setLocation(int v){
        int vertices = v;
        int j = this.index;
        double angle = Math.toRadians(360)/(2*vertices);
        double a = (angle*(j));
        double sin = Math.sin(a);
        double cos = Math.cos(a);
        setCenterX((WIDTH/2-(WIDTH/8)) + (r - (r*sin*sin)));
        setCenterY((HEIGHT/2) + r*sin*cos);
    }

    /**
     * Set the vertices' locations to random ones.
     */
    public void setRLocation(){
        Random rand = new Random();
        setCenterX(rand.nextInt(WIDTH) + 100);
        setCenterY(rand.nextInt(HEIGHT) + 15);
    }

    /**
     * Sets the index of the vertex.
     * @param nIndex
     */
    public static void setIndex(int nIndex) {
        counter = nIndex;
    }

}
