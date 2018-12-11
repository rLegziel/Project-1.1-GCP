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
import javafx.scene.media.*;
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
import java.io.*;

public class Menu extends Application {
    // Instance variables for the input of the user in game mode 1 and 2
    private int inputVertices;
    private int inputEdges;
    public static Pane root = new Pane();
    public static int gamemode;
    public static Label currentChrom;
    private Scene scene = new Scene(root, 1150, 650);
    public static int chromaticNUM;
    public static MediaPlayer mediaPlayer;
    public int counterCC;
    private boolean isMute = true;
    //Getters for the instance variables inputs
    public int getVertices() {
        return inputVertices;
    }

    public int getEdges() {
        return inputEdges;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try{
            Media sound = new Media(new File("GameMusic.MP3").toURI().toString());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setCycleCount(mediaPlayer.INDEFINITE);
        }catch(Exception e){};

        Image background = new Image("MenuBackGround.GIF");
        ImageView mv = new ImageView(background);

        ImageView stevenMeme = new ImageView(new Image("stevenmeme.PNG"));
        Button EE = new Button("Secret...");
        EE.setStyle("-fx-background-color: #1C00ff00; ");
        EE.relocate(0,480);
        stevenMeme.relocate(10,300);

        Pane pane = new Pane();
        pane.setPrefSize(800,500);
        EE.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Media meme = new Media(new File("MemeSound.MP3").toURI().toString());
                mediaPlayer = new MediaPlayer(meme);
                mediaPlayer.play();
                pane.getChildren().addAll(stevenMeme);
            }
        });
        Label title = new Label("Crazy Chromatic Number Game");
        title.setFont(new Font("Verdana", 40));
        title.setTextFill(Color.WHITE);
        title.relocate(80,10);

        Label gameModes = new Label("Menu Options");
        gameModes.setFont(new Font("Verdana", 25));
        gameModes.setTextFill(Color.WHITE);
        gameModes.relocate(300,100);

        Label info = new Label();
        info.setFont(new Font("Verdana", 15));
        info.setTextFill(Color.WHITE);
        info.relocate(480,260);


        Button mode1 = new Button("Mode 1");
        mode1.relocate(350,200);
        Button mode2 = new Button("Mode 2");
        mode2.relocate(350,300);
        Button mode3 = new Button("Mode 3");
        mode3.relocate(350,400);

        Button rules1 = new Button("?");
        rules1.setShape(new Circle(1.5));
        rules1.setMaxSize(3,3);
        rules1.relocate(420,200);
        Button rules2 = new Button("?");
        rules2.setShape(new Circle(1.5));
        rules2.setMaxSize(3,3);
        rules2.relocate(420,300);
        Button rules3 = new Button("?");
        rules3.setShape(new Circle(1.5));
        rules3.setMaxSize(3,3);
        rules3.relocate(420,400);

        pane.getChildren().addAll(mv,EE,title, gameModes, mode1, mode2, mode3, rules1, rules2, rules3, info);

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
                int x = ran1.nextInt((50-1)+1)+1;
                inputVertices = x;
                inputEdges = 2*x-1;

                showGameScreen();
                // primaryStage.close();
            }
        });
        rules1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                info.setText("Mode 1\n"+" To the bitter end - \n play until you get a chromatic number! \n Good luck & keep it chromatic!");
            }
        });

        rules2.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                info.setText("Mode 2\n" +
                        "Best upper bound - \n try to find the best upper bound in \n a fixed time frame! Good luck & keep \n it chromatic! ");
            }
        });
        rules3.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                info.setText("Mode 3\n" +
                        "Random color \n the vertices in an order given \n by a computer! \nGood luck & keep it chromatic!");
            }
        });
        Scene menu = new Scene(pane, 800, 500, Color.BLACK);

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
        Font chromFont = new Font("Calibri",20);
        currentChrom.setFont(chromFont);
        currentChrom.setLayoutX(1200);
        root.getChildren().addAll(currentChrom);
    }


    public void showGameScreen() {
        root.getChildren().clear();
        for(int i=0;i<51;i++){
            MenuItemArray.doneColors[i]=-1;
        }

        mediaPlayer.play();

        Image paperBackground = new Image("PaperBackground.JPG");
        ImageView rootBackground = new ImageView(paperBackground);
        root.getChildren().addAll(rootBackground);
        Vertex.setIndex(0);
        Stage stage = new Stage();
        Font chromFont = new Font("Calibri",30);

        currentChrom = new Label("Colors used: 0");
        currentChrom.setFont(chromFont);
        currentChrom.setLayoutX(950);
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


        Button mute = new Button();
        ImageView muteImg = new ImageView(new Image("MuteImage.PNG"));
        mute.setGraphic(muteImg);
        ImageView unmuteImg = new ImageView(new Image("UnmuteImage.PNG"));
        mute.setLayoutX(1100);
        mute.setLayoutY(600);
        mute.setOnMouseClicked((new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e) {
                if(isMute) {
                    mediaPlayer.pause();
                    mute.setGraphic(unmuteImg);
                    isMute=false;
                }else{
                    mediaPlayer.play();
                    mute.setGraphic(muteImg);
                    isMute=true;
                }
            }
        }
        ));

        Button reset = new Button("Reset");
        ImageView resetImg = new ImageView(new Image("ResetImage.PNG"));
        reset.setGraphic(resetImg);
        reset.setOnMouseClicked((new EventHandler<MouseEvent>(){
            @Override
        public void handle(MouseEvent e) {
                stage.hide();
                showGameScreen();
            }
        }
        ));
        root.getChildren().addAll(reset,mute);

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
                Alert hintrandom = new Alert(AlertType.INFORMATION);
                hintrandom.setHeaderText("random");
                hintrandom.setContentText("vertices are in radom places now");
                if(counterCC%2==0){for (int i=0; i<inputVertices; i++){
                    VertexArray.vertexArray[i].setLocation(inputVertices);
                }counterCC++;
                    circle.setText("Random");
                    hintcircle.showAndWait();
                }
                else {
                    for (int i=0; i<inputVertices; i++){VertexArray.vertexArray[i].setRLocation(inputVertices);}
                    counterCC++;
                    circle.setText("Circle");
                    hintrandom.showAndWait();
                }
            }
        }));

        if(gamemode!=3) {
            root.getChildren().addAll(hint, highestDegree, highestSatu, nextColor,circle);
        }
        else{
            root.getChildren().addAll(hint, highestDegree, highestSatu,circle);
        }
        stage.setTitle("Chromatic Number Game");
        stage.setOnCloseRequest((new EventHandler<WindowEvent>(){
            @Override
            public void handle(WindowEvent e){
                //Platform.exit();
                mediaPlayer.pause();
            }}));
        stage.setScene(scene);
        stage.show();
    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }


}
