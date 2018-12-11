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
import javafx.stage.*;
import java.lang.*;
import java.util.Random;
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
    public static int gamemode;
    public static Label currentChrom;
    private Scene scene = new Scene(root, 1500, 750);
    public static int chromaticNUM;
    //private Media sound = new Media("GameMusic.mp3");
    //public MediaPlayer mediaPlayer = new MediaPlayer(sound);
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
                gamemode = 1;
                openUserInput(1);
                // primaryStage.close();
            }
        });

        mode2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gamemode = 2;
                openUserInput(2);
                //primaryStage.close();
            }
        });

        mode3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gamemode = 3;
                Random rand = new Random();
                int x = rand.nextInt(35)+1;
                int maximumEdges = (x*2) -1;
                int y = rand.nextInt(maximumEdges)+1;
                inputVertices = x;
                inputEdges = y;

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
                Random rand = new Random();
                int x = rand.nextInt(35)+1;
                int maximumEdges = (x*2) -1;
                int y = rand.nextInt(maximumEdges)+1;
                vertices.setText(Integer.toString(x));
                edges.setText(Integer.toString(y));
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
    public static void setCurrentChrom(int userChrom){
        root.getChildren().removeAll(currentChrom);
        currentChrom = new Label("Colors used: "+userChrom);
        Font chromFont = new Font("Calibri",30);
        currentChrom.setFont(chromFont);
        currentChrom.setLayoutX(1200);
        root.getChildren().addAll(currentChrom);
    }

    public void showGameScreen() {
        root.getChildren().clear();
        for(int i=0;i<51;i++){
            MenuItemArray.doneColors[i]=-1;
        }

        //mediaPlayer.play();

        Image paperBackground = new Image("PaperBackground.JPG");
        ImageView rootBackground = new ImageView(paperBackground);
        root.getChildren().addAll(rootBackground);
        Vertex.setIndex(0);
        Stage stage = new Stage();
        Font chromFont = new Font("Calibri",30);
        currentChrom = new Label("Colors used: 0");
        currentChrom.setFont(chromFont);
        currentChrom.setLayoutX(1200);
        root.getChildren().addAll(currentChrom);
		/*Parameters of constructor are: (int vertices, int edges)
		so maybe we should add the way for the user to choose these here
		No parameters returns random amount of edges and vertices matrix
		(boundries set in RandomNodes.java)
		*/
        RandomNodes graph = new RandomNodes(inputVertices, inputEdges);
        graph.createAdjMatrix();
        int[][] adjMatrix = graph.getAdjMatrix();
        if(gamemode==3){
            VertexArray.vertexArray[0].select();
        }

        chromaticNUM = ReadGraph.fromScartchChromatic(adjMatrix, inputEdges, inputVertices);
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




        Button reset = new Button("Reset");
        reset.setOnMouseClicked((new EventHandler<MouseEvent>(){
            @Override
        public void handle(MouseEvent e) {

                stage.hide();
                showGameScreen();
            }
        }
        ));
        root.getChildren().addAll(reset);

        for (int i = 0; i < adjMatrix.length; i++) {
            root.getChildren().addAll(VertexArray.vertexArray[i]);
        }


        Button hint = new Button("chromatic");
        Button highestDegree = new Button("Highest degree");
        Button highestSatu = new Button("Highest Saturation");
	Button circle = new Button("Circle");
        circle.setLayoutX(150);
        circle.setLayoutY(600);
        highestSatu.setLayoutX(600);
        highestSatu.setLayoutY(600);
        highestDegree.setLayoutX(450);
        highestDegree.setLayoutY(600);
        hint.setLayoutX(300);
        hint.setLayoutY(600);
        Button nextColor = new Button("color next");
        nextColor.setLayoutX(750);
        nextColor.setLayoutY(600);
        hint.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                Alert hinta = new Alert(AlertType.INFORMATION);
                hinta.setHeaderText("chromatic");
                hinta.setContentText("the chromatic number is " + chromaticNUM);
                hinta.showAndWait();
            }
        }));
        highestDegree.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                Alert hint1 = new Alert(AlertType.INFORMATION);
                hint1.setHeaderText("highest degree");
                hint1.setContentText("the vertex with the highest degree is  " + highVertexIndex);
                MenuItemArray.setWhite(highVertexIndex);
                hint1.showAndWait();
            }
        }));
        highestSatu.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                Alert hint2 = new Alert(AlertType.INFORMATION);
                int highestSatIndex = MenuItemArray.highestSaturation(adjMatrix);
                hint2.setHeaderText("Highest Saturation");
                hint2.setContentText("the vertex with the highest degree of saturation  " + highestSatIndex);
                MenuItemArray.setSalmon(highestSatIndex);
                hint2.showAndWait();
            }
        }));
        nextColor.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                Alert hint3 = new Alert(AlertType.INFORMATION);
                int highestSatIndex = MenuItemArray.highestSaturation(adjMatrix);
                MenuItemArray.colorNext(adjMatrix,highestSatIndex);
                hint3.setHeaderText("hopefully this will color the next");
                hint3.setContentText("hope this shit works");
                hint3.showAndWait();
            }
        }));
	    
	circle.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
            Alert hintcircle = new Alert(AlertType.INFORMATION);
            hintcircle.setHeaderText("circle");
            hintcircle.setContentText("vertices form a circle now");
            hintcircle.showAndWait();
            for (int i=0; i<inputVertices; i++){
            VertexArray.vertexArray[i].setLocation(inputVertices);
            }
            }
        }));
        if(gamemode!=3) {
            root.getChildren().addAll(hint, highestDegree, highestSatu, nextColor, circle);
        }
        else{
            root.getChildren().addAll(hint, highestDegree, highestSatu);
        }
        stage.setTitle("Chromatic Number Game");
        stage.setOnCloseRequest((new EventHandler<WindowEvent>(){
            @Override
            public void handle(WindowEvent e){
                //Platform.exit();
            }}));
        stage.setScene(scene);
        stage.show();
    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }


}
