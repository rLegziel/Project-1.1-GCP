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

public class Testing extends Application
{
		
	public Circle circle = new Circle(300, 150, 80);
	
	public void start(Stage stage){
	//Getting Roy's color array
	String[] colorArray = ColorArray.getColorArray();
	//Temp starting color of circle
	circle.setFill(Color.RED);
	
	ContextMenu colorMenu = new ContextMenu();
	//To be implemented when MenuItemArray class works
	//MenuItem[] menuItem = MenuItemArray.getMenuItemArray();
	
	//This should be moved to the MenuItemArray class later but is uncommented for testing
	MenuItem item1 = new MenuItem("Blue");
	item1.setOnAction((new EventHandler<ActionEvent>(){ //Sets what happens when you choose this option
		public void handle(ActionEvent e){
			circle.setFill(Color.web(colorArray[0]));
	}}));
	
	//Add option to menu
	colorMenu.getItems().addAll(item1);
	
	/* To be implemented when MenuItemArray class works
	for(i=0; i<2;i++){ //10 should be replaced with number of colors
	colorMenu.getItems().addAll(menuItem[i]);
	}
	*/
	
	//Drops down menu when circle(Later vertex) is clicked
	circle.setOnMouseClicked((new EventHandler<MouseEvent>(){
	@Override
	public void handle(MouseEvent e){
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		colorMenu.show(circle,b.getX(),b.getY());
		}}));

	
	Pane root = new Pane();
	root.getChildren().addAll(circle);
	
	Scene scene = new Scene(root, 600, 300);
	scene.setFill(Color.GRAY);
	stage.setTitle("Test");
	stage.setScene(scene);
	stage.show();
	}
	public static void main(String[] args){
	launch(args);
	}
}