package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Play extends JFrame {

     public Play() {

        super("Selection");
        setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.cyan);
        setUndecorated(true);

        // Title
        JLabel Title = new JLabel("Select Time", SwingConstants.CENTER);
        Title.setFont(new Font("arial", Font.BOLD, 60));
        add(Title, BorderLayout.NORTH);

        // Buttons
        JButton onemin = new JButton("1 Minute");
        JButton twomin = new JButton("2 Minutes");
        JButton threemin = new JButton("3 Minutes");
        JButton backBtn = new JButton("Back");

        // Set font
        onemin.setFont(new Font("arial", Font.PLAIN, 20));
        twomin.setFont(new Font("arial", Font.PLAIN, 20));
        threemin.setFont(new Font("arial", Font.PLAIN, 20));
        backBtn.setFont(new Font("arial", Font.PLAIN, 20));

        // Add buttons to the box
        Box buttonsBox = Box.createVerticalBox();
        onemin.setAlignmentX(CENTER_ALIGNMENT);
        twomin.setAlignmentX(CENTER_ALIGNMENT);
        threemin.setAlignmentX(CENTER_ALIGNMENT);
        backBtn.setAlignmentX(CENTER_ALIGNMENT);

        buttonsBox.add(Box.createVerticalGlue());
        buttonsBox.add(onemin);
        buttonsBox.add(Box.createVerticalGlue());
        buttonsBox.add(twomin);
        buttonsBox.add(Box.createVerticalGlue());
        buttonsBox.add(threemin);
        buttonsBox.add(Box.createVerticalGlue());
        buttonsBox.add(backBtn);
        buttonsBox.add(Box.createVerticalGlue());

        add(Title, BorderLayout.NORTH);
        add(buttonsBox, BorderLayout.CENTER);

        // Button actions function

       

        onemin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new Game(60);
                Gamestate.state = Gamestate.GAMEPLAY;
                dispose(); // Close the window
            }
        });

        twomin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new Game(120);
                Gamestate.state = Gamestate.GAMEPLAY;
                dispose(); // Close the window
            }
        });

        threemin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new Game(180);
                Gamestate.state = Gamestate.GAMEPLAY;
                dispose(); // Close the window
            }
        });


        


        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new Mainmenu();
                dispose(); // Close the window
            }
        });

        setVisible(true);
    }
}