package Lab12_good2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Stopnie {

    private JButton wyczyscPolaJButton;
    private JTextField celsjuszTextField;
    private JTextField fahrenheitTextField;
    private double celsjuszInput;
    private double fahrenheitInput;

    public static void main(String[] args) {

        Stopnie start = new Stopnie();
        start.doRysuj();
    }

    private void doRysuj() {

        JFrame ramka = new JFrame();
        ramka.setTitle("Konwerter stopni");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(BorderLayout.CENTER, panel1);
        ramka.getContentPane().add(BorderLayout.EAST, panel2);

        panel1.setLayout(new GridLayout(3, 1));
        panel1.add(new JLabel("Celsjusz"));
        panel1.add(new JLabel("Fahrenheit"));
        wyczyscPolaJButton = new JButton("Wyczysc pola");
        wyczyscPolaJButton.addActionListener(new ReakcjaNaPrzycisk());
        panel1.add(wyczyscPolaJButton);


        panel2.setLayout(new GridLayout(3, 1));
        celsjuszTextField = new JTextField(10);
        fahrenheitTextField = new JTextField(10);
        panel2.add(celsjuszTextField);
        panel2.add(fahrenheitTextField);

        celsjuszTextField.addActionListener(new OnCelsiusTextFieldChanged());
        fahrenheitTextField.addActionListener(new OnFahrenheitTextFieldChanged());

        ramka.setSize(300, 150);


        ramka.setResizable(true);
        ramka.setVisible(true);
    }

    private void showErrorMessage() {
        JOptionPane.showMessageDialog(null, "Nieprawidlowy format liczby", "", JOptionPane.ERROR_MESSAGE);
    }

    class ReakcjaNaPrzycisk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            celsjuszInput = 0.0;
            celsjuszTextField.setText("");

            fahrenheitInput = 0.0;
            fahrenheitTextField.setText("");
        }
    }

    class OnCelsiusTextFieldChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String celsiusStringTextInput = celsjuszTextField.getText();
            try {
                celsjuszInput = Double.parseDouble(celsiusStringTextInput);
                fahrenheitTextField.setText(String.format(Locale.US,"%.2f", Konwerter.toFahrenheit(celsjuszInput)));
            } catch (NumberFormatException ex) {
                showErrorMessage();
            }
        }
    }

    class OnFahrenheitTextFieldChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String fahrenheitStringTextInput = fahrenheitTextField.getText();
            try {
                fahrenheitInput = Double.parseDouble(fahrenheitStringTextInput);
                celsjuszTextField.setText(String.format(Locale.US,"%.2f", Konwerter.toCelsius(fahrenheitInput)));
            } catch (NumberFormatException ex) {
                showErrorMessage();
            }
        }
    }
}
