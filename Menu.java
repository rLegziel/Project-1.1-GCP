// Menu 

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.geometry.*;
import javafx.scene.control.*;

import java.lang.*;

import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.util.Pair;
import javafx.application.Platform;
import javafx.scene.Node;

import java.util.Optional;

import javafx.application.Application;

import static javafx.application.Application.launch;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.geom.Point2D;
import java.awt.Point;

import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Line;

import java.util.EventObject;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.control.Control;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.ColorPicker;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.lang.Object;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.control.ChoiceBox;

import java.lang.Object;

import javafx.stage.Window;
import javafx.stage.PopupWindow;
import javafx.scene.control.PopupControl;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;;

public class Menu extends Application {
    // Instance variables for the input of the user in game mode 1 and 2
    private int inputVertices;
    private int inputEdges;
    public static Pane root = new Pane();

    //Getters for the instance variables inputs
    public int getVertices() {
        return inputVertices;
    }

    public int getEdges() {
        return inputEdges;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image background = new Image("numbers.jpeg");
        ImageView mv = new ImageView(background);

        Group root = new Group();
        root.getChildren().addAll(mv);

        Label title = new Label("Crazy Chromatic Number Game");
        title.setFont(new Font("Stencil", 50));
        title.setTextFill(Color.WHITE);

        VBox options = new VBox();
        options.setSpacing(50);
        options.setAlignment(Pos.TOP_CENTER);

        Label gameModes = new Label("Menu Options");
        gameModes.setFont(new Font("Stencil", 30));
        gameModes.setTextFill(Color.WHITE);

        options.getChildren().add(title);
        options.getChildren().add(gameModes);

        Button mode1 = new Button("Mode 1");
        Button mode2 = new Button("Mode 2");
        Button mode3 = new Button("Mode 3");

        options.getChildren().add(mode1);
        options.getChildren().add(mode2);
        options.getChildren().add(mode3);

        // Mode 1 EventHandler - opens Pop up that asks for input of number of vertices and edges
        mode1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                openUserInput(1);
                // primaryStage.close();
            }
        });

        mode2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                openUserInput(2);
                //primaryStage.close();
            }
        });

        mode3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Random ran1 = new Random();
                int x = ran1.nextInt((25 - 1)+1)+1;
                inputVertices = x;
                inputEdges = 2*x-1;

                showGameScreen();
                // primaryStage.close();
            }
        });

        root.getChildren().add(options);
        // options.setAlignment(Pos.TOP_CENTER);

        Scene menu = new Scene(root, 800, 500);

        primaryStage.setScene(menu);
        primaryStage.setTitle("Chromatic Number Game");
        primaryStage.show();

    }

    // Method for game mode 1 and 2 to show the game screen
    public void openUserInput(int modeNumber) {
        Dialog<Pair<String, String>> input = new Dialog<>();
        input.setTitle("Game Mode " + modeNumber);
        input.setHeaderText("Game Settings");
        input.setGraphic(new ImageView(this.getClass().getResource("settings.png").toString()));
        ButtonType loginButtonType = new ButtonType("START", ButtonData.OK_DONE);
        input.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField vertices = new TextField();
        vertices.setPromptText("Vertices");
        TextField edges = new TextField();
        edges.setPromptText("Edges");
        Button random = new Button("Random graph");
        // Random graph button that puts to numbers into the input text fields of vertices and edges
        random.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Random ran2 = new Random();
                int x = ran2.nextInt((25 - 1)+1)+1;
                vertices.setText(Integer.toString(x));
                edges.setText(Integer.toString(2*x-1));
            }
        });


        grid.add(new Label("Number of vertices:"), 0, 0);
        grid.add(vertices, 1, 0);
        grid.add(new Label("Number of edges:"), 0, 1);
        grid.add(edges, 1, 1);
        grid.add(random, 2, 1);

        Node loginButton = input.getDialogPane().lookupButton(loginButtonType);

        input.getDialogPane().setContent(grid);

        input.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(vertices.getText(), edges.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = input.showAndWait();

        if (result.isPresent()) {
            inputVertices = Integer.parseInt(result.get().getKey());
            inputEdges = Integer.parseInt(result.get().getValue());
        }
        showGameScreen();
        //primaryStage.hide();
        // result.ifPresent(gameSettings -> System.out.println("Vertices=" + gameSettings.getKey() + ", Edges=" + gameSettings.getValue()));
    }

    // Method to show the game screen
    public void showGameScreen() {

        Stage stage = new Stage();
		/*Parameters of constructor are: (int vertices, int edges)
		so maybe we should add the way for the user to choose these here
		No parameters returns random amount of edges and vertices matrix
		(boundries set in RandomNodes.java)
		*/
        RandomNodes graph = new RandomNodes(inputVertices, inputEdges);
        graph.createAdjMatrix();
        int[][] adjMatrix = graph.getAdjMatrix();
        int chromaticNUM = ReadGraph.fromScartchChromatic(adjMatrix, inputEdges, inputVertices);
        System.out.println(chromaticNUM);
        int highVertexIndex = ReadGraph.highestDegreeVertex(adjMatrix);
		
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
        for (int i = 0; i < adjMatrix.length; i++) {
            root.getChildren().addAll(VertexArray.vertexArray[i]);
        }

        Scene scene = new Scene(root, 1500, 750);
        Button hint = new Button("Chromatic Number");
        Button highestDegree = new Button("Highest degree");
        Button highestSatu = new Button("Highest Saturation");
        highestSatu.setLayoutX(600);
        highestSatu.setLayoutY(600);
        highestDegree.setLayoutX(450);
        highestDegree.setLayoutY(600);
        hint.setLayoutX(300);
        hint.setLayoutY(600);
        hint.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                Alert hinta = new Alert(AlertType.INFORMATION);
                hinta.setHeaderText("Chromatic Number");
                hinta.setContentText("The chromatic number is " + chromaticNUM);
                hinta.showAndWait();
            }
        }));
        highestDegree.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                Alert hint1 = new Alert(AlertType.INFORMATION);
                hint1.setHeaderText("Highest degree");
                hint1.setContentText("The vertex with the highest degree is  " + highVertexIndex);
                MenuItemArray.setWhite(highVertexIndex);
                hint1.showAndWait();
            }
        }));
        highestSatu.setOnMouseClicked((new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent e) {
                        Alert hint2 = new Alert(AlertType.INFORMATION);
                        int highestSatIndex = MenuItemArray.highestSaturation(adjMatrix);
                        hint2.setHeaderText("Highest Saturation");
                        hint2.setContentText("The vertex with the highest degree of saturation  " + highestSatIndex);
                        MenuItemArray.setSalmon(highestSatIndex);
                        hint2.showAndWait();
                    }
        }));

        root.getChildren().addAll(hint, highestDegree,highestSatu);
        stage.setTitle("Chromatic Number Game");
        stage.setScene(scene);
        stage.show();
    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }


}
