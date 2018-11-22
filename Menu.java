// Class Menu implements ActionListener
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Menu extends JFrame implements ActionListener{
	private JButton modeOne;
	private JButton modeTwo;
	private JButton modeThree;
	
	public Menu(){
		setTitle("Chromatic Number Game - Menu");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);

		modeOne = new JButton("Mode 1");
		modeTwo = new JButton("Mode 2");
		modeThree = new JButton("Mode 3");
		
		modeOne.setBounds(320,100,120,35);
		modeTwo.setBounds(320,200,120,35);
		modeThree.setBounds(320,300,120,35);

		
		modeOne.addActionListener(this);
		modeTwo.addActionListener(this);
		modeThree.addActionListener(this);
		
		JLabel title = new JLabel("Chromatic Number Game");
		title.setForeground(Color.BLACK);
		title.setBounds(100,20,300,35);
		JLabel label = new JLabel("Menu Options");
		label.setForeground(Color.BLACK);
		label.setBounds(320, 50, 200, 35);
		
		Font fontOne = new Font("Araial", Font.BOLD, 16);
		Font fontTwo = new Font("Arial", Font.PLAIN, 12);
		title.setFont(fontOne);
		label.setFont(fontTwo);
		
		panel.add(modeOne);
		panel.add(modeTwo);
		panel.add(modeThree);
		panel.add(title);
		panel.add(label);

	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Mode 1")){
			UserInput input1 = new UserInput();
		}
		else if(e.getActionCommand().equals("Mode 2")){
			UserInput input2 = new UserInput();
		} 
		else if(e.getActionCommand().equals("Mode 3")){
			System.out.println("Playing mode 3");
		}
	}
	
	public static void main(String[] args){
		Menu myMenu = new Menu();
		myMenu.setSize(800,500);
		myMenu.setVisible(true);
		myMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}