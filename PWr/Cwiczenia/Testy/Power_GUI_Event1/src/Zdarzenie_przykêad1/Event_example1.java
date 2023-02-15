package Zdarzenie_przyk�ad1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Event_example1 implements ActionListener 
{
	
	
	//Sk�adowe klasy____________________
	private JButton przycisk1;
	private JButton przycisk2;
	private int ile1, ile2;
	//__________________________________
	
	
	public static void main(String[] args) 
	{
		
		Event_example1 apGUI = new Event_example1();
		apGUI.doRysuj();
	}
	
	
	//Tworzenie prostego GUI________________________________________________
	public void doRysuj() 
	{
		
		JFrame ramka = new JFrame();
		przycisk1 = new JButton("Kliknij mnie");
		przycisk2 = new JButton("Kliknij mnie");
	
		
		przycisk1.addActionListener(this);
		przycisk2.addActionListener(this);
		
		JPanel panel = new JPanel();		
		ramka.getContentPane().add(panel);
		panel.add(przycisk1);
		panel.add(przycisk2);
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.pack();
		ramka.setSize(500,300);
		ramka.setVisible(true);
	}	
	//_______________________________________________________________________

/*	Obiekt zainteresowany �r�d�em zdarze� (dzia�aniem przycisk�w) jest obiektem klasy 
	Event_example1 (czyli obiekt bie��cy - wskazywany przez this) 
	On rejestruje si� jako 'nas�uchiwacz' zdarze� generowanych przez przyciski.
	Oznacza to, �e jego klasa musi implementowa� interfejs ActionListener, a wi�c r�wnie�
	przes�oni� metod�: actionPerformed, kt�ra jest reakcj� na zdarzenie.

	Dodatkowo, obiekt zdarzenia przekazywany do metody actionPerformed identyfikuje �r�d�o zdarzenia.*/
	public void actionPerformed(ActionEvent zdarzenie) 
	{
		
		if (zdarzenie.getSource() == przycisk1) 
		{
			ile1++;
			przycisk1.setText("Zosta�em klini�ty razy " + ile1);
		}
		
		if (zdarzenie.getSource() == przycisk2) 
		{
			ile2++;
			przycisk2.setText("Zosta�em klini�ty razy " + ile2);
		}		
	}
}