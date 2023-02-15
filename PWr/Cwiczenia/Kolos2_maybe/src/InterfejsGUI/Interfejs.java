package InterfejsGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Kontroler.*;

public class Interfejs {

    JFrame ramka;
    JPanel panel;
    JButton przycisk;
    JTextField pole1;
    JTextField pole2;


    public void StworzInterfejs() {

        ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(300, 180);
        ramka.setVisible(true);
        ramka.setLocationRelativeTo(null);
        ramka.setTitle("Kolokwium");

        panel = new JPanel();
        pole1 = new JTextField(10);
        pole2 = new JTextField(10);
        pole2.setText("Negatywny");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        przycisk = new JButton("Sprawdz");
        przycisk.addActionListener(new ButtonAction());

        panel.add(new JLabel("Sciezka dostepu do pliku"));
        panel.add(pole1);
        panel.add(new JLabel("Wynik"));
        panel.add(pole2);
        panel.add(przycisk);


        ramka.add(panel, BorderLayout.CENTER);
        ramka.revalidate();
        ramka.repaint();
    }

    class ButtonAction implements ActionListener {

        public void actionPerformed(ActionEvent zdarzenie) {

            Kontroler.odczytaj(pole1.getText());
            ramka.revalidate();
            ramka.repaint();
        }
    }

    public void setStan(){
        pole2.setText("Pozytywny");

        ramka.revalidate();
        ramka.repaint();
    }

}
