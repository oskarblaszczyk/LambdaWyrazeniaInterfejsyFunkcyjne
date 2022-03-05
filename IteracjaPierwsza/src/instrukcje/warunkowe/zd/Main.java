package instrukcje.warunkowe.zd;

public class Main {

	public static void main(String[] args) {
		//  Zadeklaruj dwie zmienne typu String i spr�buj je por�wna� operatorem >. Jaki jest efekt programu? 
		System.out.println("------------------------ "
				+ "\nZadeklaruj dwie zmienne typu String i spr�buj je por�wna� operatorem >. Jaki jest efekt programu?\n");
		String x = "zmiennaA", y = "zmiennaB";
		// System.out.println(a > b); operatory > < <= >= brak mozliwosci porownania
		System.out.println(x == y); // porownanie dwoch roznych stringow- dwie rozne komorki pamieci
		y = x;
		System.out.println(x + " = " + y + " to: " + (x == y)); // porownanie zmiennych String o tej samej wartosci zapisanej w jednej komorce
		y = new String(x);
		System.out.println(x + " = " + y + " to: " + (x == y)); //porownanie tych samych string ale zapisanych w innych komorkach pamieci

		// Napisz program w kt�rym deklarujesz 3 zmienne typu int (r�ne od siebie) i program wy�wietl najmniejsz� z nich. 
		System.out.println("-------------------"
				+ "\nNapisz program w kt�rym deklarujesz 3 zmienne typu int (r�ne od siebie) i program wy�wietli \r\n"
				+ "najmniejsz� z nich. \n");
		int y1 = 1, d = 2, e = 3;
		System.out.println("Liczby do porownania: " + y1 + ", " + d + ", " + e + "\r\n" + "najmniejsza z nich to: ");
		if (y1 < d && y1 < e) {
			System.out.println(y1);
		} else if (d < e) {
			System.out.println(d);
		} else {
			System.out.println(e);

		}

		// Napisz program w kt�rym deklarujesz 2 zmienne typu int. Sprawd� czy s� sobie r�wne
		System.out.println("--------------------------------"
				+ "\nNapisz program w kt�rym deklarujesz 2 zmienne typu int. Sprawd� czy s� sobie r�wne \n");
		int f = 2, g = 3;
		if (f == g) {
			System.out.println("zadeklarowane liczby sa rowne");
		} else {
			System.out.println("zadeklarowane liczby nie sa rowne");
		}

		//Napisz program kt�ry sprawdzi czy �rednia dw�ch liczb typu double jest wi�ksza od 5.
		System.out.println("------------------------"
				+ "\nNapisz program kt�ry sprawdzi czy �rednia dw�ch liczb typu double jest wi�ksza od 5.\r\n" + "");
		double h = 2, i = 3;
		System.out.println("zadeklarowane liczby: " + h + ", " + i + " i ich");
		if ((h + i) / 2 > 5) {
			System.out.println("srednia jest wieksza od 5");
		} else if ((h + i) / 2 < 5) {
			System.out.println("srednia jest mniejsza od 5");
		} else {
			System.out.println("srednia jest rowna 5");
		}

		// Napisz program w kt�rym deklarujesz 3 zmienne typu int (r�ne od siebie). Program ma 
		// wy�wietli� je posortowane rosn�co
		/*						a<b
		 * 			b<c				    	b<c
		 * abc			a<c		     	a<c		cba
		 * 			acb		cab		 bac   bca  
		 */
		int a = 2, b = 1, c = 3;
		System.out.println("\n-------------------" + "\nliczby do posortowania to: " + a + ", " + b + ", " + c
				+ "\nposortowane: ");

		if (a < b) {
			if (b < c) {
				System.out.println(a + ", " + b + ", " + c);
			} else if (a < c) {
				System.out.println(a + ", " + c + ", " + b);
			} else {
				System.out.println(c + ", " + a + ", " + b);
			}
		} else {
			if (b > c) {
				System.out.println(c + ", " + b + ", " + a);
			} else if (a < c) {
				System.out.println(b + ", " + a + ", " + c);
			} else {
				System.out.println(b + ", " + c + ", " + a);
			}
		}

	}

}