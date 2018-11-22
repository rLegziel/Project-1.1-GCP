import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class UserInput extends JFrame implements ActionListener{
	public UserInput(){
		setSize(350,180);
		setLocation(250,200);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);
		
		JTextField inputVertices = new JTextField(10);
		inputVertices.setBounds(170,20,120,30);
		JLabel vertices = new JLabel("Number of vertices:");
		vertices.setBounds(40,20,120,30);
		
		JTextField inputEdges = new JTextField(10);
		inputEdges.setBounds(170,60,120,30);
		JLabel edges = new JLabel("Number of edges:");
		edges.setBounds(40,60,120,30);
		
		JButton enter = new JButton("Start Game");
		enter.setBounds(235,100,100,25);
		enter.addActionListener(this);
		
		panel.add(inputVertices);
		panel.add(inputEdges);
		panel.add(vertices);
		panel.add(edges);
		panel.add(enter);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Start Game"))
			System.out.println("YESSSSSSSS");
	}
}