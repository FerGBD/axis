import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quadrant Determination");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            JLabel labelX = new JLabel("Type the number corresponding to x:");
            JTextField textFieldX = new JTextField(10);
            JLabel labelY = new JLabel("Type the number corresponding to y:");
            JTextField textFieldY = new JTextField(10);
            JButton submitButton = new JButton("Submit");

            JTextArea resultArea = new JTextArea(5, 20);
            resultArea.setEditable(false);

            panel.add(labelX);
            panel.add(textFieldX);
            panel.add(labelY);
            panel.add(textFieldY);
            panel.add(submitButton);
            panel.add(resultArea);

            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double x = Double.parseDouble(textFieldX.getText());
                    double y = Double.parseDouble(textFieldY.getText());

                    String result = determineQuadrant(x, y);
                    resultArea.setText(result);
                }
            });

            frame.getContentPane().add(panel);
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }

    private static String determineQuadrant(double x, double y) {
        if (x == 0.0 && y == 0.0) {
            return "Origin";
        } else if (x == 0.0) {
            return "Axis Y";
        } else if (y == 0.0) {
            return "Axis X";
        } else if (x > 0.0 && y > 0.0) {
            return "Q1";
        } else if (x < 0.0 && y > 0.0) {
            return "Q2";
        } else if (x < 0.0 && y < 0.0) {
            return "Q3";
        } else {
            return "Q4";
        }
    }
}
