package io.github.myrsstas.musicplayer.models.loginForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFormView extends JFrame {
    private JButton startButton;
    private JButton resumeButton;
    private JPanel loginFormPanel;

    public LoginFormView() {


        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "it works"); // joptionpane message box
            }
        });
        resumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"it also works");
            }
        });
    }

    static void setUpLoginFormView() {
        JFrame loginFrame = new JFrame("Music App");
        loginFrame.setContentPane(new LoginFormView().loginFormPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.pack();
        loginFrame.setVisible(true);
    }

    public static void main(String[] args) {
        setUpLoginFormView();
    }
}
