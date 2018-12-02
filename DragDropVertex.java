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
import java.util.Random;
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

// Elliot's Random Graph class

public class RandomNodes {
	private int vertices;
	private int edges;
	private int randomX = 0;
	private int randomY = 0;
	private int[][] array; //The AdjArray!

	public RandomNodes() {
		Random random = new Random();

		vertices = random.nextInt(20) + 1;
		edges = random.nextInt(40) + 1;
	}

	public RandomNodes(int userVertex, int userEdge) {
		vertices = userVertex;
		edges = userEdge;
	}

	public void createAdjMatrix() {

		int[][] adjMatrix = new int[vertices][vertices];
		int counter = 0;
		while (counter < edges) {
			randomNum();
			if (adjMatrix[randomX][randomY] != 1 ) { // currently takes 0 also
				adjMatrix[randomX][randomY] = 1;
				adjMatrix[randomY][randomX] = 1;
				counter++;
				System.out.println(randomX + " is connected to " + randomY + "this is edge number " + counter);
			}
		}
		array = adjMatrix;
		createVertexArray();
		lineDrawing();
	}


	public void createVertexArray() { //Initializes the vertexArray (Only had to happen once!!)
		VertexArray temp = new VertexArray(vertices);
	}

	/*
	This is the stuff Roy wrote, I added it to this class.
	When you run the constructor it uses the constructed adjMatrix to make this (called array!!!)
	VertexArray.vertexArray. is where the vertices are stored, the static vertexArray in VertexArray
	*/

	public void lineDrawing() {
		int[][] copyMatrix = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				copyMatrix[i][j] = array[i][j];
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (copyMatrix[i][j] == 1) {
					copyMatrix[j][i] = 0;
					Line line = lineConnect.connect(VertexArray.vertexArray[i], VertexArray.vertexArray[j]);


					Testing.root.getChildren().addAll(line);
	    /* Roy's code used to try and make multiple line objects,
	    by just adding them to the pane called Testing.root we can constantly
	    only need 1 Line object at a time
	    */
				}
			}
		}

	}
	/*NEEDS IMPROVEMENT!!!!!!!!!!!!!
	This was just for my conveinience, used in the constructor
	this should be refined to not check things double!!!, compile time 
	with a lot of edges is very very long */

	public void randomNum() {
		Random rand = new Random();
		randomX = 0;
		randomY = 0;
		while (randomX == randomY)
			randomX = rand.nextInt(vertices);
		randomY = rand.nextInt(vertices);
	}

	//Is used in the Testing class but can be removed if we make array public static
	//Leave for now tho
	public int[][] getAdjMatrix() {
		return array;
	}
}

