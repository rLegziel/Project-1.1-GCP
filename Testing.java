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
import javafx.scene.shape.Shape;
import javafx.scene.shape.Line;
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

//Elliot's Testing.java

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
		RandomNodes graph = new RandomNodes(10,10);
		graph.createAdjMatrix();
		int[][] adjMatrix = graph.getAdjMatrix();
		
		/*This is to Test my adjMatrix class, can be recommented
		
		System.out.println("Matrix is: "+adjMatrix.length);
		for(int i=0; i<adjMatrix.length;i++,System.out.print("\n")){
			for(int j=0; j<adjMatrix.length;j++){
				System.out.print(adjMatrix[i][j]+" ");
			}
		}
		*/
		
	//Background color	
	root.setStyle("-fx-background-color: #E7E8E9;");
	
	
	/*Adds all the Vertices to the Pane 
	(Could be moved to adjMatrix class root. would be Testing.root. */
	for(int i=0;i<adjMatrix.length;i++){
	root.getChildren().addAll(VertexArray.vertexArray[i]);
	}
	
	Scene scene = new Scene(root, 1500, 750);
	stage.setTitle("Chromatic Number Game");
	stage.setScene(scene);
	stage.show();
	}
	public static void main(String[] args){
	launch(args);
	}
}
