package votingapp;

import javax.swing.JFrame;

public class VotingApplication {

	public static void main(String[] args) {
		// variables hold window X,Y size
		int xSize = 280, ySize = 190;
		
		// create and setup JFrame
		JFrame.setDefaultLookAndFeelDecorated(false);
		JFrame frame = new JFrame("Voting Application");
		JFrame frame2 = new JFrame("Red Team vs Blue Team");
		
		//create and set up the content panel
		IntroForm intro = new IntroForm(xSize, ySize, frame, frame2);
		
		// set the content of the frame
		frame.setContentPane(intro.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setSize(xSize, ySize);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		VotingForm vote = new VotingForm();
		frame2.setContentPane(vote.createContentPane());
		frame2.setSize(xSize,ySize);
		frame2.setVisible(false);
		

	}//end main

}//end class
