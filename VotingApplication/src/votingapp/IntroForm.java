package votingapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.image.*;


public class IntroForm implements ActionListener {
	
	//instance fields
	
	private int xSize, ySize;
	private JButton enterBtn, exitBtn;
	private JFrame thisFrame, voteFrame;
	
	//constructor method
	public IntroForm(int xSize, int ySize, JFrame frame, JFrame frame2) {
		this.xSize = xSize;
		this.ySize = ySize;
		thisFrame = frame;
		voteFrame = frame2;
	}//end constructor method
	
	public  JPanel createContentPane() {
		 // we create a bottom JPanel to place everything on.
		JPanel introGUI = new JPanel();
		// sets the default layout to null, so that we can place our component manually
		//create a label named imgLabel
		JLabel imgLabel = new JLabel();
		//assign the jpg image to the img variable
		ImageIcon img = new ImageIcon(this.getClass().getResource("/JL.jpg"));
		//create an info label and set the default text
		JLabel infoLabel = new JLabel("Voting Application");
		
		introGUI.setLayout(null);
		// sets the panels location within the frame
		introGUI.setLocation(0,0);
		// sets the size of the panel
		introGUI.setSize(280, 190);
		// return the content of the frame to the driver class
		
		//sets the size of the label
		infoLabel.setSize(120, 30);
		// set location of the label using width of the imgLabel
		infoLabel.setLocation(img.getIconWidth()+20, 30);
		// add a black line around the border of the label
		infoLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		//set the text to appear in the middle of the label
		infoLabel.setHorizontalAlignment(0);
		//set the text colour to red
		infoLabel.setForeground(Color.red);
		//add the label to the panel
		introGUI.add(infoLabel);
		
		
		
		//set the image variable to be the icon displayed in the img label
		imgLabel.setIcon(img);
		//Moves and resizes this component. The location of the top-left corner is
		// specified by x(10) and y(10), the new size is specified by width
		// (img.getWidth(imgLabel)) and height (img.getHeight(imgLabel)).
		imgLabel.setBounds(10,10, img.getIconWidth(), img.getIconHeight());
		//add a black line around the border of the label
		imgLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		//add the image label to the panel
		introGUI.add(imgLabel);
		
		
		// enter button
		enterBtn = new JButton("Start Voting");
		enterBtn.setLocation(10, img.getIconHeight()+20);
		enterBtn.setSize(120, 30);
		enterBtn.addActionListener(this);
		introGUI.add(enterBtn);
		
		//exit button
		exitBtn = new JButton("Exit Voting");
		exitBtn.setLocation(140, img.getIconHeight()+20);
		exitBtn.setSize(120, 30);
		exitBtn.addActionListener(this);
		introGUI.add(exitBtn);
		return introGUI;
	}//end createContentPane

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enterBtn) {
			voteFrame.setVisible(true);
			thisFrame.setVisible(false);
		}
		else if(e.getSource() == exitBtn) {
			System.exit(0);
		}//end if
		
	}//end actionPerformed

}//end class
