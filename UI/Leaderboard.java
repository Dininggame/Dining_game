package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Leaderboard extends JFrame {

    // instance variables


    public Leaderboard() {

        super(Constants.Name + " - Leaderboard");
        setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT + 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.cyan);
        setUndecorated(true);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        setLayout(new BorderLayout());

        JLabel Title = new JLabel("Leaderboard", SwingConstants.CENTER);
		Title.setFont(new Font("arial", Font.BOLD, 100));
		add(Title, BorderLayout.NORTH);

        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("arial", Font.PLAIN, 20));





        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new Mainmenu();
                dispose();
            }
        });

        setVisible(true);
    }

        

    public static void main(String[] args) {
        new Leaderboard();
    }
    
}
