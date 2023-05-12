import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Play extends JFrame {

    public Play() {
        super("Select Mode");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Please select", SwingConstants.CENTER);
        label.setFont(new Font("arial", Font.BOLD, 20));
        add(label);

        JButton singlePlayerBtn = new JButton("Play");
        JButton backBtn = new JButton("Back");

        singlePlayerBtn.setFont(new Font("arial", Font.BOLD, 20));
        backBtn.setFont(new Font("arial", Font.BOLD, 20));

        Box buttonsBox = Box.createVerticalBox();
        singlePlayerBtn.setAlignmentX(CENTER_ALIGNMENT);
        backBtn.setAlignmentX(CENTER_ALIGNMENT);
        buttonsBox.add(singlePlayerBtn);
        buttonsBox.add(Box.createVerticalGlue());
        buttonsBox.add(backBtn);
        buttonsBox.add(Box.createVerticalGlue());

        add(buttonsBox);

        singlePlayerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // Do something when Play
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