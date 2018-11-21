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


public class MenuItemArray
{
	public String[] colorArray = ColorArray.getColorArray();
	public MenuItem[] menuItemArray;
	
	public MenuItemArray(){
	MenuItem item0 = new MenuItem("Blue");
	item0.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[0]));
	}}));
	MenuItem item1 = new MenuItem("Red");
	item1.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[1]));
	}}));
	
	MenuItem[] menuItemArray = {item0,item1};
	}
	
	public MenuItem[] getMenuItemArray(){
	return menuItemArray;
	}
	
	
	
}
	