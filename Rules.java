import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome  " + name + " to Master Minds");
        heading.setBounds(50, 20, 700, 55);
        heading.setFont(new Font("Californian FB", Font.BOLD, 35)); // Changed font to Californian FB and increased size
        heading.setForeground(Color.BLACK); // Changed text color to black
        add(heading);

        JLabel rules = new JLabel("<html>" +
                "<ul>" +
                "<li>The exam will start promptly at [Start Time] and end at [End Time]. You are required to complete the exam within the specified duration.</li>"
                +
                "<li>No External Assistance: You must complete the exam independently without any external assistance. Do not consult textbooks, notes, or online resources during the exam.</li>"
                +
                "<li>No Communication: Avoid communication with other participants during the exam. Do not discuss exam questions or answers with anyone.</li>"
                +
                "<li>No Unauthorized Devices or Software: Use only approved devices and software for accessing the exam platform. Avoid using smartphones, tablets, or any unauthorized aids.</li>"
                +
                "<li>Exam Environment: Choose a quiet and distraction-free environment for taking the exam. Minimize background noise and interruptions.</li>"
                +
                "<li>Technical Requirements: Ensure stable internet connectivity and use a supported browser. Contact [Technical Support Contact] for assistance with any technical issues.</li>"
                +
                "<li>Submission Deadline: Submit your responses before the exam deadline to avoid penalties.</li>" +
                "<li>Honesty and Integrity: Maintain honesty and integrity throughout the exam. Refrain from cheating, copying, or engaging in any form of academic dishonesty.</li>"
                +
                "<li>Consequences of Violations: Violations of exam rules may result in disqualification or academic penalties. Take the exam seriously and adhere to the rules to avoid any negative consequences.</li>"
                +
                "</ul>" +
                "Thank you for your cooperation, and best of luck with your exam!" +
                "</html>");
        rules.setBounds(50, 110, 1200, 450);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(rules);

        // Back button
        back = new JButton("Back");
        back.setBounds(250, 530, 100, 30);
        back.setFont(new Font("Arial", Font.BOLD, 20));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 530, 120, 30);
        start.setFont(new Font("Arial", Font.BOLD, 20));
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        getContentPane().setBackground(new Color(109, 164, 170));

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name);

        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }

}
