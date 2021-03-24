package votingapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.image.*;

public class VotingForm implements ActionListener {
	
	// instance fields
	int redScoreAmount = 0;
	int blueScoreAmount = 0;
	private JButton redButton, blueButton, resetButton;
	JLabel redScore;
	JLabel blueScore;
	
	public JPanel createContentPane() {
		// frame set up
		JPanel voteGui = new JPanel();
		JPanel titlePanel = new JPanel();
		JPanel scorePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		// labels for scoring
		JLabel redLabel = new JLabel("Red Team");
		JLabel blueLabel = new JLabel("Blue Team");
		redScore = new JLabel("" + redScoreAmount);
		blueScore = new JLabel("" + blueScoreAmount);
		
		// frame components
		titlePanel.setLayout(null);
		titlePanel.setSize(260, 30);
		titlePanel.setLocation(10, 0);
	
		scorePanel.setLayout(null);
		scorePanel.setLocation(260, 30);
		scorePanel.setSize(260, 30);
		
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(10, 80);
		buttonPanel.setSize(260, 70);
		
		voteGui.add(scorePanel);
		voteGui.add(titlePanel);
		voteGui.add(buttonPanel);
		
		// scoring components
		redLabel.setLocation(0, 0);
		redLabel.setSize(120, 30);
		redLabel.setHorizontalAlignment(0);
		redLabel.setForeground(Color.RED);
		titlePanel.add(redLabel);
		
		blueLabel.setLocation(130, 0);
		blueLabel.setSize(120, 30);
		blueLabel.setHorizontalAlignment(0);
		blueLabel.setForeground(Color.RED);
		titlePanel.add(blueLabel);
		
		redScore.setLocation(0, 0);
		redScore.setSize(120, 30);
		redScore.setHorizontalAlignment(0);
		redScore.setForeground(Color.RED);
		scorePanel.add(redScore);
		
		blueScore.setLocation(130, 0);
		blueScore.setSize(120, 30);
		blueScore.setHorizontalAlignment(0);
		blueScore.setForeground(Color.RED);
		scorePanel.add(blueScore);
		
		//buttons
		JButton redButton = new JButton("Red Score!");
		JButton blueButton = new JButton("Blue Score!");
		JButton resetButton = new JButton("Reset Score");
		
		// button components
		redButton.setLocation(0, 0);
		redButton.setSize(120,30);
		redButton.addActionListener(this);
		blueButton.setLocation(130, 0);
		blueButton.setSize(120,30);
		blueButton.addActionListener(this);
		resetButton.setLocation(0, 40);
		resetButton.setSize(250,30);
		resetButton.addActionListener(this);
		return voteGui;
	}//end createContent

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == redButton) {
			redScoreAmount++;
			redScore.setText("" + redScoreAmount);
		}
		else{
				if(e.getSource() == blueButton) {
					blueScoreAmount++;
					blueScore.setText("" + blueScoreAmount);
				}
				
				if(e.getSource() == resetButton) {
					blueScoreAmount = 0;
					redScoreAmount = 0;
					blueScore.setText("" + blueScoreAmount);
					redScore.setText("" + redScoreAmount);
				}//end nested if
			}//end if else
		
	}//end actionPerformed
}//end class