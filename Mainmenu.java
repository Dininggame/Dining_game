import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mainmenu extends JFrame {

	public Mainmenu(){
		super(Constants.Name);
		setSize(Constants.WINDOW_WIDTH,Constants.WINDOW_HEIGHT);
		setLocationRelativeTo(null); // To centre the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,0));
		setResizable(false);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		getContentPane().setBackground(Color.cyan);
		// Three Buttons and Name of The Game Label
		JLabel nameOfTheGame = new JLabel(Constants.Name,SwingConstants.CENTER); // Changeable
		nameOfTheGame.setFont(new Font("arial",Font.BOLD , 60));
		JButton playBtn = new JButton("Play");
		JButton leaderboardBtn = new JButton("Leaderboard");
		JButton exitBtn = new JButton("Exit");
		
		Font buttonFont = new Font("arial",Font.BOLD , 30);
		playBtn.setFont(buttonFont);
		leaderboardBtn.setFont(buttonFont);
		exitBtn.setFont(buttonFont);
		
		
		// Box To put the buttons in vertical alignment 
		Box JButtons = Box.createVerticalBox();
		playBtn.setAlignmentX(CENTER_ALIGNMENT);
		exitBtn.setAlignmentX(CENTER_ALIGNMENT);
		leaderboardBtn.setAlignmentX(CENTER_ALIGNMENT);
		JButtons.add(playBtn);
		JButtons.add(Box.createVerticalGlue());
		JButtons.add(leaderboardBtn);
		JButtons.add(Box.createVerticalGlue());
		JButtons.add(exitBtn);
		JButtons.add(Box.createVerticalGlue());
		add(nameOfTheGame);
		add(JButtons);
		
		
		
		
		//Play Button Function
		playBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				new Play();
				dispose();
			}
		});

		
		//Leaderboard Button Function
		leaderboardBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				new Leaderboard();
				dispose();
			}
		});
		
		
		//Exit Button Function
		exitBtn.addActionListener(new ActionListener(){
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
