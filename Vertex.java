import java.lang.Math;
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

import java.util.EventObject;
import javafx.event.Event;
import javafx.event.ActionEvent;

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

public class Vertex extends Circle
{
	private static int counter = 0;
	private int index;
	private final static double WIDTH = 600;
	private final static double HEIGHT = 300;
	private final static double RADIUS = 10;
	public static String[] colorArray = ColorArray.getColorArray();
	
	public Vertex(){
		super(RADIUS);
		setCenterX(Math.random()*WIDTH);
		setCenterY(Math.random()*HEIGHT);
		index = counter;
		counter++;

		ContextMenu colorMenu = new ContextMenu();
		MenuItemArray temp = new MenuItemArray();
		MenuItem[] menuItemArray = temp.getMenuItemArray();
		
		for(int i=0; i<91;i++){
		colorMenu.getItems().addAll(menuItemArray[i]);
		}
		
		this.setOnMouseClicked((new EventHandler<MouseEvent>(){
		@Override
		public void handle(MouseEvent e){
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		colorMenu.show(Testing.root,b.getX(),b.getY());
		}}));
		}
		
	}
