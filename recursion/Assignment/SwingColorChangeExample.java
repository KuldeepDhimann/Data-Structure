package recursion.Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingColorChangeExample extends JFrame {
    private JPanel panel;
    private JButton button;

    public SwingColorChangeExample() {
        setTitle("Color Change Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER);

        button = new JButton("Change Color");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeBackgroundColor();
            }
        });
        add(button, BorderLayout.SOUTH);
    }

    private void changeBackgroundColor() {
        Color randomColor = new Color(
                (int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256)
        );
        panel.setBackground(randomColor);
    }

    public static void main(String[] args) {
        SwingColorChangeExample example = new SwingColorChangeExample();
        example.setVisible(true);
    }
}
