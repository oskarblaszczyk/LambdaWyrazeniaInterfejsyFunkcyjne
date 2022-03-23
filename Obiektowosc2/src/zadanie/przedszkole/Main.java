/*
		 * Stw�rz system do zarz�dzania przedszkolem. W przedszkolu mamy dzieci oraz
		 * wychowawcow, dla obu chcemy znac imie, nazwisko oraz date urodzenia. Dzieci
		 * dziela sie na posluszne (odznaka) i nieposluszne (przewinienia).
		 * 
		 * Wychowawcy maja pensje (obliczana za pomoca algorytmu) i dziela sie na
		 * wychowawcow kwalifikowanych (kwalifikacje) oraz tymczasowych.
		 * 
		 * Wychowacwa odpowiada za grupe (nazwa, max liczba dzieci, obecnie 15).
		 * Wychowacwca moze miec wiele grup, grupa ma jednego wychowawce.
		 * 
		 * Kazda grupa ma przypisana sale (nazwa, kolor scian).
		 * 
		 * -narysuj poprawny diagram uml do teog zagadnienia
		 * -napisz metode kt�ra zwraca dziecko ktore ma najwiecej przewinien 
		 * -napisz metode ktora zwroci wychowawcow kwliafikowanych z pensja wieksza niz podany parametr
		 * -zapisz do pliku imiona nazwiska wszystkich dzieci kt�rzy sa w grupie dla wychowawcy podanego jako parametr 
		 * -i wyswietl wszystkie te dzieci wczytane z pliku na JLiscie
		 */


		/*
		 *  W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla ps�w przechowujemy dodatkowe ich dlugosc siersci 
			oraz ulubione zabawki ,dla kot�w stopien bycia wkurwiajacym futrzakiem (1-10) oraz dla pterodaktylow rozpietosc skrzydel.
			
			Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje wiele zwierzat, ale zwierze jest pod okiem jednego trenera.
			
			Trener uzywa Sprzetu (nazwa, stopien zuzycia(nowe, uzywane, tragiczne)), sprzet moze byc naprawiany.
			 Chcemy przechowywac informacje o tym jaki trener uzywal kiedy
			jkaiego sprzetu. Sprzet przez trenera moze byc uzywany wielokrotnie. 
		
		
			-znajdz trenera ktory trenowa� najwiecej zwierzat
			-znajdz trenera ktory uzywa� jakiegos sprzetu najwieksza liczbe razy
			-znajdz trenerow ktorzy trenowali psy z gatunku spaniel
			-znajdz wszystkie sprzety kt�re byly naprawiane co najmniej 2 razy
			-znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
		 */

	/*
		 * Ok to masz graczy ktorzy graja w turniejach. Turniej ma nazwe i miesiac. Gracz ma imie i nazwisko. 
		 * 
 
			
			1) chcemy przechowywac dla kazdego gracza jakie pozycje zajmowal w jakim turnieju
			
			2) tak samo punkty jakie zdobyl z dnaego turnieju
			
			3) znajdz gracsa ktory byl najlepeszt w turniejach o danej nazwie, jesli nie ma to rzuc wyjatkiem  
			
			4) znajdz gracza ktory zodbyl najwiecej 1 miejsc ze wszystkich turniejow 
			
			5) znajdz gracza ktory ma najwyzsyz ranking z turrniejow ale nigdycnie mial 1 miejsca
		 */

package zadanie.przedszkole;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		Wychowawca w1 = new Wychowawca("Jan", "Kowalski", LocalDate.of(1980, 12, 04), Kwalifikacje.tymczasowy);
		Wychowawca w2 = new Wychowawca("Ania", "Nowak", LocalDate.of(1985, 01, 30), Kwalifikacje.kwalifikowany);

		Dziecko d1 = new Dziecko("Basia", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d2 = new Dziecko("Ania", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d3 = new Dziecko("Lucja", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d4 = new Dziecko("Mateusz", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d5 = new Dziecko("Rafal", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d6 = new Dziecko("Czeslaw", "Konieczna", LocalDate.of(2018, 5, 5), null);
		
		Sala s1 = new Sala("sloneczko", "zolte");
		
		Grupa g1 = new Grupa("Sloneczka", s1, w1, Arrays.asList(d1, d2, d3, d4, d5, d6));
		
		System.out.println(w1.getPensja());
		System.out.println(Dziecko.najwiecejPrzewinien(g1.getDzieci()));
		d1.dodajPrzewinienie("przewinienie");
		System.out.println(Dziecko.najwiecejPrzewinien(g1.getDzieci()));
		System.out.println(Wychowawca.pensjaPowyzejKwalifikowany(2500));
		
		g1.zapisPlik(w1);
		System.out.println();
		g1.odczytPlikuWychowawca(w1);

		
	}

}
