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

/*
Elliot's Testing screen builder
This would basically be the game screen which should open from Lena's
Menu screen and which has the vertices on it etc.
*/

public class Testing extends Application
{
	/*NEEDS TO BE HERE!!! (I think), MenuItems need to be able to reach this node
	otherwise the menu's won't work*/
	public static Pane root = new Pane(); 

	public void start(Stage stage){		
		
		/*Parameters of constructor are: (int vertices, int edges)
		so maybe we should add the way for the user to choose these here
		No parameters returns random amount of edges and vertices matrix
		(boundries set in RandomNodes.java)
		*/
		
		RandomNodes graph = new RandomNodes(6,10);
		graph.createAdjMatrix();
		int[][] adjMatrix = graph.getAdjMatrix();
		
		/*
		Automated object creation impossible
		maybe something like we did with the menuItems?
		so an Array with preset vertices (Still random location tho)
		*/
		
			Vertex vertex0 = new Vertex();
			Vertex vertex1 = new Vertex();
			Vertex vertex2 = new Vertex();
			Vertex vertex3 = new Vertex();
			Vertex vertex4 = new Vertex();
	
		/*This is to Test my adjMatrix class, can be recommented
		
		System.out.println("Matrix is: "+adjMatrix.length);
		for(int i=0; i<adjMatrix.length;i++){
			for(int j=0; j<adjMatrix.length;j++){
				System.out.print(adjMatrix[i][j]+" ");
			}
		}
		*/
	
	//Scene setting
	root.getChildren().addAll(vertex0,vertex1,vertex2,vertex3,vertex4);
	
	Scene scene = new Scene(root, 1000, 750);
	scene.setFill(Color.BLACK);
	stage.setTitle("Test");
	stage.setScene(scene);
	stage.show();
	}
	public static void main(String[] args){
	launch(args);
	}
}
