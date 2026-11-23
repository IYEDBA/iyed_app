package TP3;

import javax.swing.*;
import java.awt.*;

public class StudentApplication extends JFrame {
    public StudentApplication() {
        setTitle("Application1");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        //NORTH
        JPanel northPanel = new JPanel();
        northPanel.setBackground(new Color(255, 180, 188));
        JLabel titleLabel = new JLabel("Hello Student");
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        northPanel.add(titleLabel);

        JButton switchButton = new JButton("Switch");
        northPanel.add(switchButton);

        add(northPanel, BorderLayout.NORTH);

        // WEST
        JPanel westPanel = new JPanel();
        JLabel epiLabel = new JLabel("EPI");
        epiLabel.setForeground(Color.GREEN);
        epiLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        westPanel.add(epiLabel);
        add(westPanel, BorderLayout.EAST);

        add(westPanel, BorderLayout.WEST);

        // EAST
        JPanel eastPanel = new JPanel();
        JLabel welcomeLabel = new JLabel("Welcome");
        eastPanel.add(welcomeLabel);

        add(eastPanel, BorderLayout.EAST);

        // CENTER
        JPanel centerPanel = new JPanel(new GridLayout(2, 2));
        centerPanel.add(new JLabel("              Name"));
        centerPanel.add(new JLabel("              Surname"));
        centerPanel.add(new JLabel("              Birth Date"));
        centerPanel.add(new JLabel("              Speciality"));

        add(centerPanel, BorderLayout.CENTER);

        // SOUTH
        JPanel southPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        JButton resitButton = new JButton("Resit");
        southPanel.add(submitButton);
        southPanel.add(resitButton);

        add(southPanel, BorderLayout.SOUTH);

    }
}
