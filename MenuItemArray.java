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
import java.util.*;
import javafx.scene.text.TextAlignment;

import java.util.EventObject;
import javafx.event.Event;
import javafx.event.ActionEvent;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.control.Control;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Labeled;
import javafx.scene.control.Label;

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
import javafx.scene.layout.HBox;

import java.lang.Object;
import javafx.stage.Window;
import javafx.stage.PopupWindow;
import javafx.scene.control.PopupControl;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.animation.PauseTransition;

public class MenuItemArray extends Circle
{
	public String[] colorArray = ColorArray.getColorArray();
	public MenuItem[] menuItemArray = new MenuItem[92];
	private int[][] adjMatrix = RandomNodes.array;
	protected int index;
	private int colorIndex =10; //Temp but idk fix
	private boolean error;
			
	public MenuItemArray(double RADIUS){
		super(RADIUS);
		
		
		Stage errorPopUp = new Stage();
		errorPopUp.setTitle("Error");
		Group root = new Group();
		Label label = new Label("ERROR");
		label.setFont(new Font("Arial",40));
		label.relocate(75,25);
		root.getChildren().add(label);
		Scene scene = new Scene(root,300,100);
		errorPopUp.setScene(scene);
		
		
	MenuItem item0 = new MenuItem("Cyan");
	item0.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			int temp = colorIndex;
			colorIndex = 0;
			error = false;
				for(int i=0;i<adjMatrix.length;i++){
					if(adjMatrix[index][i]==1&&index!=i){
						if(colorIndex==VertexArray.vertexArray[i].getColorIndex()
							&&VertexArray.vertexArray[i].getColorIndex()!=10){
							error = true;
							break;
						}
					}
				}
		if(error==true){
			System.out.println("Error");
			
			errorPopUp.show();
			
			colorIndex=temp;
		}else{
			setFill(Color.web(colorArray[0]));
		}
;
	}}));
	menuItemArray[0]=item0;
	
	MenuItem item1 = new MenuItem("Magenta");
	item1.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
				
			setFill(Color.web(colorArray[1]));
	}}));
	menuItemArray[1]=item1;
	
	MenuItem item2 = new MenuItem("Red");
	item2.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[2]));
	}}));
	menuItemArray[2]=item2;
	
	MenuItem item3 = new MenuItem("Dark Green");
	item3.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[3]));
	}}));
	menuItemArray[3]=item3;
	
	MenuItem item4 = new MenuItem("Dark Blue");
	item4.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[4]));
	}}));
	menuItemArray[4]=item4;
	
	MenuItem item5 = new MenuItem("Red-Purple");
	item5.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[5]));
	}}));
	menuItemArray[5]=item5;
	
	MenuItem item6 = new MenuItem("Pink");
	item6.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[6]));
	}}));
	menuItemArray[6]=item6;
	
	MenuItem item7 = new MenuItem("Pink");
	item7.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[7]));
	}}));
	menuItemArray[7]=item7;
	
	MenuItem item8 = new MenuItem("Pink");
	item8.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[8]));
	}}));
	menuItemArray[8]=item8;
	
	MenuItem item9 = new MenuItem("Pink");
	item9.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[9]));
	}}));
	menuItemArray[9]=item9;
	
	MenuItem item10 = new MenuItem("Pink");
	item10.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[10]));
	}}));
	menuItemArray[10]=item10;
	
	MenuItem item11 = new MenuItem("Pink");
	item11.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[11]));
	}}));
	menuItemArray[11]=item11;
	
	MenuItem item12 = new MenuItem("Pink");
	item12.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[12]));
	}}));
	menuItemArray[12]=item12;
	
	MenuItem item13 = new MenuItem("Pink");
	item13.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[13]));
	}}));
	menuItemArray[13]=item13;
	
	MenuItem item14 = new MenuItem("Pink");
	item14.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[14]));
	}}));
	menuItemArray[14]=item14;
	
	MenuItem item15 = new MenuItem("Pink");
	item15.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[15]));
	}}));
	menuItemArray[15]=item15;
	
	MenuItem item16 = new MenuItem("Pink");
	item16.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[16]));
	}}));
	menuItemArray[16]=item16;
	
	MenuItem item17 = new MenuItem("Pink");
	item17.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[17]));
	}}));
	menuItemArray[17]=item17;
	
	MenuItem item18 = new MenuItem("Pink");
	item18.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[18]));
	}}));
	menuItemArray[18]=item18;
	
	MenuItem item19 = new MenuItem("Pink");
	item19.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[19]));
	}}));
	menuItemArray[19]=item19;
	
	MenuItem item20 = new MenuItem("Pink");
	item20.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[20]));
	}}));
	menuItemArray[20]=item20;
	
	MenuItem item21 = new MenuItem("Pink");
	item21.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[21]));
	}}));
	menuItemArray[21]=item21;
	
	MenuItem item22 = new MenuItem("Pink");
	item22.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[22]));
	}}));
	menuItemArray[22]=item22;
	
	MenuItem item23 = new MenuItem("Pink");
	item23.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[23]));
	}}));
	menuItemArray[23]=item23;
	
	MenuItem item24 = new MenuItem("Pink");
	item24.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[24]));
	}}));
	menuItemArray[24]=item24;
	
	MenuItem item25 = new MenuItem("Pink");
	item25.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[25]));
	}}));
	menuItemArray[25]=item25;
	
	MenuItem item26 = new MenuItem("Pink");
	item26.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[26]));
	}}));
	menuItemArray[26]=item26;
	
	MenuItem item27 = new MenuItem("Pink");
	item27.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[27]));
	}}));
	menuItemArray[27]=item27;
	
	MenuItem item28 = new MenuItem("Pink");
	item28.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[28]));
	}}));
	menuItemArray[28]=item28;
	
	MenuItem item29 = new MenuItem("Pink");
	item29.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[29]));
	}}));
	menuItemArray[29]=item29;
	
	MenuItem item30 = new MenuItem("Pink");
	item30.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[30]));
	}}));
	menuItemArray[30]=item30;
	
	MenuItem item31 = new MenuItem("Pink");
	item31.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[31]));
	}}));
	menuItemArray[31]=item31;
	
	MenuItem item32 = new MenuItem("Pink");
	item32.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[32]));
	}}));
	menuItemArray[32]=item32;
	
	MenuItem item33 = new MenuItem("Pink");
	item33.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[33]));
	}}));
	menuItemArray[33]=item33;
	
	MenuItem item34 = new MenuItem("Pink");
	item34.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[34]));
	}}));
	menuItemArray[34]=item34;
	
	MenuItem item35 = new MenuItem("Pink");
	item35.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[35]));
	}}));
	menuItemArray[35]=item35;
	
	MenuItem item36 = new MenuItem("Pink");
	item36.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[36]));
	}}));
	menuItemArray[36]=item36;
	
	MenuItem item37 = new MenuItem("Pink");
	item37.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[37]));
	}}));
	menuItemArray[37]=item37;
	
	MenuItem item38 = new MenuItem("Pink");
	item38.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[38]));
	}}));
	menuItemArray[38]=item38;
	
	MenuItem item39 = new MenuItem("Pink");
	item39.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[39]));
	}}));
	menuItemArray[39]=item39;
	
	MenuItem item40 = new MenuItem("Pink");
	item40.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[40]));
	}}));
	menuItemArray[40]=item40;
	
	MenuItem item41 = new MenuItem("Pink");
	item41.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[41]));
	}}));
	menuItemArray[41]=item41;
	
	MenuItem item42 = new MenuItem("Pink");
	item42.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[42]));
	}}));
	menuItemArray[42]=item42;
	
	MenuItem item43 = new MenuItem("Pink");
	item43.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[43]));
	}}));
	menuItemArray[43]=item43;
	
	MenuItem item44 = new MenuItem("Pink");
	item44.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[44]));
	}}));
	menuItemArray[44]=item44;
	
	MenuItem item45 = new MenuItem("Pink");
	item45.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[45]));
	}}));
	menuItemArray[45]=item45;
	
	MenuItem item46 = new MenuItem("Pink");
	item46.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[46]));
	}}));
	menuItemArray[46]=item46;
	
	MenuItem item47 = new MenuItem("Pink");
	item47.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[47]));
	}}));
	menuItemArray[47]=item47;
	
	MenuItem item48 = new MenuItem("Pink");
	item48.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[48]));
	}}));
	menuItemArray[48]=item48;
	
	MenuItem item49 = new MenuItem("Pink");
	item49.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[49]));
	}}));
	menuItemArray[49]=item49;
	
	MenuItem item50 = new MenuItem("Pink");
	item50.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[50]));
	}}));
	menuItemArray[50]=item50;
	
	MenuItem item51 = new MenuItem("Pink");
	item51.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			setFill(Color.web(colorArray[51]));
	}}));
	menuItemArray[51]=item51;
	
	
	
	}
	
	public MenuItem[] getMenuItemArray(){
	return menuItemArray;
	}
	
	public int getIndex(){
			return this.index;
		}
	public int getColorIndex(){
			return colorIndex;
		}
	
}
	
