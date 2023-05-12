package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mainmenu extends JFrame {

	
	public Mainmenu(){
		super(Constants.Name);
		setBackground(Color.cyan);
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.cyan);

		// Title
		JLabel Title = new JLabel(Constants.Name, SwingConstants.CENTER);
		Title.setFont(new Font("arial", Font.BOLD, 60));
		add(Title, BorderLayout.NORTH);

		// Buttons
		JButton playButton = new JButton("Play");
		JButton leaderboardButton = new JButton("Leaderboard");
		JButton exitButton = new JButton("Exit");

		// Set font
		playButton.setFont(new Font("arial", Font.PLAIN, 20));
		leaderboardButton.setFont(new Font("arial", Font.PLAIN, 20));
		exitButton.setFont(new Font("arial", Font.PLAIN, 20));

		// Add buttons to the box
		Box buttonsBox = Box.createVerticalBox();
		playButton.setAlignmentX(CENTER_ALIGNMENT);
		leaderboardButton.setAlignmentX(CENTER_ALIGNMENT);
		exitButton.setAlignmentX(CENTER_ALIGNMENT);
		buttonsBox.add(Box.createVerticalGlue());
		buttonsBox.add(playButton);
		buttonsBox.add(Box.createVerticalGlue());
		buttonsBox.add(leaderboardButton);
		buttonsBox.add(Box.createVerticalGlue());
		buttonsBox.add(exitButton);
		buttonsBox.add(Box.createVerticalGlue());

		add(Title, BorderLayout.NORTH);
		add(buttonsBox, BorderLayout.CENTER);

		// Button actions function
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Play();
				dispose(); // Close the window
			}
		});

		leaderboardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Leaderboard();
				dispose(); // Close the window
			}
		});

		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});




		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mainmenu();
	}
	
}
