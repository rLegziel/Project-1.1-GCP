// Menu 
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;  
import javafx.application.Application;
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





public class Menu extends Application{
    // Instance variables for the input of the user in game mode 1 and 2
    private int inputVertices;
    private int inputEdges;

    //Getters for the instance variables inputs
    public int getVertices(){
        return inputVertices;
    }

    public int getEdges(){
        return inputEdges;
    }

    @Override
    public void start(Stage stage) throws Exception{
        
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
        mode1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                Dialog<Pair<String, String>> input = new Dialog<>();
                input.setTitle("Game Mode 1");
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
                
                grid.add(new Label("Number of vertices:"), 0, 0);
                grid.add(vertices, 1, 0);
                grid.add(new Label("Number of edges:"), 0, 1);
                grid.add(edges, 1, 1);

                Node loginButton = input.getDialogPane().lookupButton(loginButtonType);

                input.getDialogPane().setContent(grid);

                input.setResultConverter(dialogButton -> {
                    if (dialogButton == loginButtonType) {
                        return new Pair<>(vertices.getText(), edges.getText());
                    }
                        return null;
                });
                
                Optional<Pair<String, String>> result = input.showAndWait();

                if (result.isPresent()){
                    inputVertices = Integer.parseInt(result.get().getKey());	
                    inputEdges = Integer.parseInt(result.get().getValue());	
            
                }
                //result.ifPresent(gameSettings -> System.out.println("Vertices=" + gameSettings.getKey() + ", Edges=" + gameSettings.getValue()));
            }
        });

        mode2.setOnAction(new EventHandler<ActionEvent>(){
             @Override
            public void handle(ActionEvent event){
                Dialog<Pair<String, String>> input = new Dialog<>();
                input.setTitle("Game Mode 2");
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
                
                grid.add(new Label("Number of vertices:"), 0, 0);
                grid.add(vertices, 1, 0);
                grid.add(new Label("Number of edges:"), 0, 1);
                grid.add(edges, 1, 1);

                Node loginButton = input.getDialogPane().lookupButton(loginButtonType);

                input.getDialogPane().setContent(grid);

                input.setResultConverter(dialogButton -> {
                    if (dialogButton == loginButtonType) {
                        return new Pair<>(vertices.getText(), edges.getText());
                    }
                        return null;
                });
                
                Optional<Pair<String, String>> result = input.showAndWait();	
                
                if (result.isPresent()){
                    inputVertices = Integer.parseInt(result.get().getKey());	
                    inputEdges = Integer.parseInt(result.get().getValue());	
                }
                // result.ifPresent(gameSettings -> System.out.println("Vertices=" + gameSettings.getKey() + ", Edges=" + gameSettings.getValue()));
            }
        });

        mode3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("3");
            }
        });

        root.getChildren().add(options);
        // options.setAlignment(Pos.TOP_CENTER);

        Scene menu = new Scene(root, 800, 500);

        stage.setScene(menu);
        stage.setTitle("Chromatic Number Game");
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
