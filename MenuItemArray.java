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
	public MenuItem[] menuItemArray = new MenuItem[92];
	
	public MenuItemArray(){	
	MenuItem item0 = new MenuItem("Cyan");
	item0.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[0]));
	}}));
	menuItemArray[0]=item0;
	
	MenuItem item1 = new MenuItem("Magenta");
	item1.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[1]));
	}}));
	menuItemArray[1]=item1;
	
	MenuItem item2 = new MenuItem("Red");
	item2.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[2]));
	}}));
	menuItemArray[2]=item2;
	
	MenuItem item3 = new MenuItem("Dark Green");
	item3.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[3]));
	}}));
	menuItemArray[3]=item3;
	
	MenuItem item4 = new MenuItem("Dark Blue");
	item4.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[4]));
	}}));
	menuItemArray[4]=item4;
	
	MenuItem item5 = new MenuItem("Red-Purple");
	item5.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[5]));
	}}));
	menuItemArray[5]=item5;
	
	MenuItem item6 = new MenuItem("Pink");
	item6.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[6]));
	}}));
	menuItemArray[6]=item6;
	
	MenuItem item7 = new MenuItem("Pink");
	item7.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[7]));
	}}));
	menuItemArray[7]=item7;
	
	MenuItem item8 = new MenuItem("Pink");
	item8.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[8]));
	}}));
	menuItemArray[8]=item8;
	
	MenuItem item9 = new MenuItem("Pink");
	item9.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[9]));
	}}));
	menuItemArray[9]=item9;
	
	MenuItem item10 = new MenuItem("Pink");
	item10.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[10]));
	}}));
	menuItemArray[10]=item10;
	
	MenuItem item11 = new MenuItem("Pink");
	item11.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[11]));
	}}));
	menuItemArray[11]=item11;
	
	MenuItem item12 = new MenuItem("Pink");
	item12.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[12]));
	}}));
	menuItemArray[12]=item12;
	
	MenuItem item13 = new MenuItem("Pink");
	item13.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[13]));
	}}));
	menuItemArray[13]=item13;
	
	MenuItem item14 = new MenuItem("Pink");
	item14.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[14]));
	}}));
	menuItemArray[14]=item14;
	
	MenuItem item15 = new MenuItem("Pink");
	item15.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[15]));
	}}));
	menuItemArray[15]=item15;
	
	MenuItem item16 = new MenuItem("Pink");
	item16.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[16]));
	}}));
	menuItemArray[16]=item16;
	
	MenuItem item17 = new MenuItem("Pink");
	item17.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[17]));
	}}));
	menuItemArray[17]=item17;
	
	MenuItem item18 = new MenuItem("Pink");
	item18.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[18]));
	}}));
	menuItemArray[18]=item18;
	
	MenuItem item19 = new MenuItem("Pink");
	item19.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[19]));
	}}));
	menuItemArray[19]=item19;
	
	MenuItem item20 = new MenuItem("Pink");
	item20.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[20]));
	}}));
	menuItemArray[20]=item20;
	
	MenuItem item21 = new MenuItem("Pink");
	item21.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[21]));
	}}));
	menuItemArray[21]=item21;
	
	MenuItem item22 = new MenuItem("Pink");
	item22.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[22]));
	}}));
	menuItemArray[22]=item22;
	
	MenuItem item23 = new MenuItem("Pink");
	item23.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[23]));
	}}));
	menuItemArray[23]=item23;
	
	MenuItem item24 = new MenuItem("Pink");
	item24.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[24]));
	}}));
	menuItemArray[24]=item24;
	
	MenuItem item25 = new MenuItem("Pink");
	item25.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[25]));
	}}));
	menuItemArray[25]=item25;
	
	MenuItem item26 = new MenuItem("Pink");
	item26.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[26]));
	}}));
	menuItemArray[26]=item26;
	
	MenuItem item27 = new MenuItem("Pink");
	item27.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[27]));
	}}));
	menuItemArray[27]=item27;
	
	MenuItem item28 = new MenuItem("Pink");
	item28.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[28]));
	}}));
	menuItemArray[28]=item28;
	
	MenuItem item29 = new MenuItem("Pink");
	item29.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[29]));
	}}));
	menuItemArray[29]=item29;
	
	MenuItem item30 = new MenuItem("Pink");
	item30.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[30]));
	}}));
	menuItemArray[30]=item30;
	
	MenuItem item31 = new MenuItem("Pink");
	item31.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[31]));
	}}));
	menuItemArray[31]=item31;
	
	MenuItem item32 = new MenuItem("Pink");
	item32.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[32]));
	}}));
	menuItemArray[32]=item32;
	
	MenuItem item33 = new MenuItem("Pink");
	item33.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[33]));
	}}));
	menuItemArray[33]=item33;
	
	MenuItem item34 = new MenuItem("Pink");
	item34.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[34]));
	}}));
	menuItemArray[34]=item34;
	
	MenuItem item35 = new MenuItem("Pink");
	item35.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[35]));
	}}));
	menuItemArray[35]=item35;
	
	MenuItem item36 = new MenuItem("Pink");
	item36.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[36]));
	}}));
	menuItemArray[36]=item36;
	
	MenuItem item37 = new MenuItem("Pink");
	item37.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[37]));
	}}));
	menuItemArray[37]=item37;
	
	MenuItem item38 = new MenuItem("Pink");
	item38.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[38]));
	}}));
	menuItemArray[38]=item38;
	
	MenuItem item39 = new MenuItem("Pink");
	item39.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[39]));
	}}));
	menuItemArray[39]=item39;
	
	MenuItem item40 = new MenuItem("Pink");
	item40.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[40]));
	}}));
	menuItemArray[40]=item40;
	
	MenuItem item41 = new MenuItem("Pink");
	item41.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[41]));
	}}));
	menuItemArray[41]=item41;
	
	MenuItem item42 = new MenuItem("Pink");
	item42.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[42]));
	}}));
	menuItemArray[42]=item42;
	
	MenuItem item43 = new MenuItem("Pink");
	item43.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[43]));
	}}));
	menuItemArray[43]=item43;
	
	MenuItem item44 = new MenuItem("Pink");
	item44.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[44]));
	}}));
	menuItemArray[44]=item44;
	
	MenuItem item45 = new MenuItem("Pink");
	item45.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[45]));
	}}));
	menuItemArray[45]=item45;
	
	MenuItem item46 = new MenuItem("Pink");
	item46.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[46]));
	}}));
	menuItemArray[46]=item46;
	
	MenuItem item47 = new MenuItem("Pink");
	item47.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[47]));
	}}));
	menuItemArray[47]=item47;
	
	MenuItem item48 = new MenuItem("Pink");
	item48.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[48]));
	}}));
	menuItemArray[48]=item48;
	
	MenuItem item49 = new MenuItem("Pink");
	item49.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[49]));
	}}));
	menuItemArray[49]=item49;
	
	MenuItem item50 = new MenuItem("Pink");
	item50.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[50]));
	}}));
	menuItemArray[50]=item50;
	
	MenuItem item51 = new MenuItem("Pink");
	item51.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[51]));
	}}));
	menuItemArray[51]=item51;
	
	MenuItem item52 = new MenuItem("Pink");
	item52.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[52]));
	}}));
	menuItemArray[52]=item52;
	
	MenuItem item53 = new MenuItem("Pink");
	item53.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[53]));
	}}));
	menuItemArray[53]=item53;
	
	MenuItem item54 = new MenuItem("Pink");
	item54.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[54]));
	}}));
	menuItemArray[54]=item54;
	
	MenuItem item55 = new MenuItem("Pink");
	item55.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[55]));
	}}));
	menuItemArray[55]=item55;
	
	MenuItem item56 = new MenuItem("Pink");
	item56.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[56]));
	}}));
	menuItemArray[56]=item56;
	
	MenuItem item57 = new MenuItem("Pink");
	item57.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[57]));
	}}));
	menuItemArray[57]=item57;
	
	MenuItem item58 = new MenuItem("Pink");
	item58.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[58]));
	}}));
	menuItemArray[58]=item58;
	
	MenuItem item59 = new MenuItem("Pink");
	item59.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[59]));
	}}));
	menuItemArray[59]=item59;
	
	MenuItem item60 = new MenuItem("Pink");
	item60.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[60]));
	}}));
	menuItemArray[60]=item60;
	
	MenuItem item61 = new MenuItem("Pink");
	item61.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[61]));
	}}));
	menuItemArray[61]=item61;
	
	MenuItem item62 = new MenuItem("Pink");
	item62.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[62]));
	}}));
	menuItemArray[62]=item62;
	
	MenuItem item63 = new MenuItem("Pink");
	item63.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[63]));
	}}));
	menuItemArray[63]=item63;
	
	MenuItem item64 = new MenuItem("Pink");
	item64.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[64]));
	}}));
	menuItemArray[64]=item64;
	
	MenuItem item65 = new MenuItem("Pink");
	item65.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[65]));
	}}));
	menuItemArray[65]=item65;
	
	MenuItem item66 = new MenuItem("Pink");
	item66.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[66]));
	}}));
	menuItemArray[66]=item66;
	
	MenuItem item67 = new MenuItem("Pink");
	item67.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[67]));
	}}));
	menuItemArray[67]=item67;
	
	MenuItem item68 = new MenuItem("Pink");
	item68.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[68]));
	}}));
	menuItemArray[68]=item68;
	
	MenuItem item69 = new MenuItem("Pink");
	item69.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[69]));
	}}));
	menuItemArray[69]=item69;
	
	MenuItem item70 = new MenuItem("Pink");
	item70.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[70]));
	}}));
	menuItemArray[70]=item70;
	
	MenuItem item71 = new MenuItem("Pink");
	item71.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[71]));
	}}));
	menuItemArray[71]=item71;
	
	MenuItem item72 = new MenuItem("Pink");
	item72.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[72]));
	}}));
	menuItemArray[72]=item72;
	
	MenuItem item73 = new MenuItem("Pink");
	item73.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[73]));
	}}));
	menuItemArray[73]=item73;
	
	MenuItem item74 = new MenuItem("Pink");
	item74.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[74]));
	}}));
	menuItemArray[74]=item74;
	
	MenuItem item75 = new MenuItem("Pink");
	item75.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[75]));
	}}));
	menuItemArray[75]=item75;
	
	MenuItem item76 = new MenuItem("Pink");
	item76.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[76]));
	}}));
	menuItemArray[76]=item76;
	
	MenuItem item77 = new MenuItem("Pink");
	item77.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[77]));
	}}));
	menuItemArray[77]=item77;
	
	MenuItem item78 = new MenuItem("Pink");
	item78.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[78]));
	}}));
	menuItemArray[78]=item78;
	
	MenuItem item79 = new MenuItem("Pink");
	item79.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[79]));
	}}));
	menuItemArray[79]=item79;
	
	MenuItem item80 = new MenuItem("Pink");
	item80.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[80]));
	}}));
	menuItemArray[80]=item80;
	
	MenuItem item81 = new MenuItem("Pink");
	item81.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[81]));
	}}));
	menuItemArray[81]=item81;
	
	MenuItem item82 = new MenuItem("Pink");
	item82.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[82]));
	}}));
	menuItemArray[82]=item82;
	
	MenuItem item83 = new MenuItem("Pink");
	item83.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[83]));
	}}));
	menuItemArray[83]=item83;
	
	MenuItem item84 = new MenuItem("Pink");
	item84.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[84]));
	}}));
	menuItemArray[84]=item84;
	
	MenuItem item85 = new MenuItem("Pink");
	item85.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[85]));
	}}));
	menuItemArray[85]=item85;
	
	MenuItem item86 = new MenuItem("Pink");
	item86.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[86]));
	}}));
	menuItemArray[86]=item86;
	
	MenuItem item87 = new MenuItem("Pink");
	item87.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[87]));
	}}));
	menuItemArray[87]=item87;
	
	MenuItem item88 = new MenuItem("Pink");
	item88.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[88]));
	}}));
	menuItemArray[88]=item88;
	
	MenuItem item89 = new MenuItem("Pink");
	item89.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[89]));
	}}));
	menuItemArray[89]=item89;
	
	MenuItem item90 = new MenuItem("Pink");
	item90.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[90]));
	}}));
	menuItemArray[90]=item90;
	
	MenuItem item91 = new MenuItem("Pink");
	item91.setOnAction((new EventHandler<ActionEvent>(){
		public void handle(ActionEvent e){
			Testing.circle.setFill(Color.web(colorArray[91]));
	}}));
	menuItemArray[91]=item91;
	
	
	}
	
	public MenuItem[] getMenuItemArray(){
	return menuItemArray;
	}
	
	
	
}
	
