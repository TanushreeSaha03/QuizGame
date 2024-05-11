
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(109, 164, 170));
        setLayout(null);

        ImageIcon icon = new ImageIcon("C:/Users/Tanushree/Desktop/QuizGame/score-logo-600-16083.png");
        Image image = icon.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(60, 200, 300, 250);
        add(imageLabel);

        JLabel heading = new JLabel("Thank you, " + name + ", for playing Master Minds");
        heading.setBounds(140, 50, 1400, 50);
        heading.setFont(new Font("Californian FB", Font.BOLD, 35));
        add(heading);

        JLabel scoreLabel = new JLabel("Your score is: " + score);
        scoreLabel.setBounds(450, 200, 300, 30);
        scoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(scoreLabel);

        JButton playAgainButton = new JButton("Play Again");
        playAgainButton.setBounds(500, 270, 200, 50);
        playAgainButton.setBackground(new Color(30, 144, 255));
        playAgainButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        playAgainButton.setForeground(Color.WHITE);
        playAgainButton.addActionListener(this);
        add(playAgainButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false); // Hide the current window
        new Login(); // Open a new login window
    }

    public static void main(String[] args) {
        new Score("User", 0); // Testing the Score window with default values
    }
}
