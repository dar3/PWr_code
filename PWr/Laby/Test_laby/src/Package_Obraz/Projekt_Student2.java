package Package_Obraz;

import Package_AlgorytmyObrazuBinaryzacja.*;
import Package_AlgorytmyObrazuPreProcessing.*;

public class Projekt_Student2 extends Obraz {

	
	
	/*W konstruktorze klasy Projektu Studenta ustawiamy jego kombinacje 
	algorytmów - tj. które dok³adnie sposoby na realizacje preprocessingu 
	oraz binaryzacji obrazu wykorzysta*/
	public Projekt_Student2() {
		
		PreProc = new Sposób_2_NaWykonaniePreProcessing();
		setAlgorytmInfoPreProcessing("Algorytm 2 na PreProcessing Obrazu Cyfrowego");
		
		BinObr = new Sposób_1_NaWykonanieBinaryzacji();
		setAlgorytmInfoBinaryzacja("Algorytm 1 na Binaryzacjê Obrazu");
	}
	
	
	//Wyœwietlenie informacji, który student, z którego algorytmu korzysta.
	@Override
	public void WyswietlInfo() {
		
		System.out.println("\nStudent 2 u¿ywa " + getAlgorytmInfoPreProcessing());
		System.out.println("Student 2 u¿ywa " + getAlgorytmInfoBinaryzacja());
	}

	
	//Inne Metody Studenta 2, dotycz¹ce przetwarzania i analizy obrazu ...
	
}
