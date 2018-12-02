import java.lang.Math;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Point;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.EventObject;
import javafx.event.Event;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.control.Control;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.ColorPicker;
import java.util.Arrays;
import javafx.scene.input.MouseButton;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;
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

public class Vertex extends MenuItemArray
{
	private static int counter = 0;
	private int index;
	private final static int WIDTH = 1200;
	private final static int HEIGHT = 750;
	private final static double RADIUS = 15;
	public static String[] colorArray = ColorArray.getColorArray();


	public Vertex(){
		super(RADIUS);
		Random rand = new Random();
			setCenterX(rand.nextInt(WIDTH) + 20);
			setCenterY(rand.nextInt(HEIGHT) + 20);

		index = counter;
		counter++;
		ContextMenu colorMenu = new ContextMenu();
		MenuItem[] menuItemArray = getMenuItemArray();




		for(int i=0; i<91;i++){ //Change 91 to less for smaller menu's with less colors
			colorMenu.getItems().addAll(menuItemArray[i]);
		}

		this.setOnMouseClicked((new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				MouseButton butt = e.getButton();
				if (butt == MouseButton.SECONDARY) {
					PointerInfo a = MouseInfo.getPointerInfo();
					Point b = a.getLocation();
					colorMenu.show(Testing.root, b.getX(), b.getY());
				}
			}}));
		setUpDragging(this);
	}
	private void setUpDragging(Vertex circle) {

		circle.setOnDragDetected(event -> {
			circle.getParent().setCursor(Cursor.CLOSED_HAND);
//			ppp = new Point2D(event.getSceneX(), event.getSceneY());
			//ppp = new Point2D(circle.getCenterX(), circle.getCenterY());

			circle.setCenterX(event.getSceneX());
			circle.setCenterY(event.getSceneY());
		});

		circle.setOnMouseReleased(event -> {
			circle.getParent().setCursor(Cursor.DEFAULT);
			//ppp = new Point2D(event.getSceneX(), event.getSceneY());
			circle.setCenterX(event.getSceneX());
			circle.setCenterY(event.getSceneY());

		});
	}

		/*
		Not used anymore but might be an idea to add something like this to
		the MenuItemArray class to make color checking easier

		public void setColorIndex(int colorIndex){
			this.colorIndex = colorIndex;
			this.setFill(Color.web(colorArray[colorIndex]));
		}
		*/

}
