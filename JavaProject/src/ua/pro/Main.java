package ua.pro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Cinema myCinema;
		ArrayList<Actor> act = null;
		ArrayList<Film> film = new ArrayList<>();
		film.add(new Film("Underworld: Blood Wars", "Screen Gems", new Actor("Kate", "Beckinsale"), "US", 2017,
				"Horror"));
		film.add(new Film("Arsenal", "Lionsgate", new Actor("Adrian", "Grenier"), "US", 2017, "Action"));
		film.add(new Film("Monster Trucks", "Paramount Pictures", new Actor("Lucas", "Till"), "US", 2017, "Animation"));
		film.add(new Film("20 Once Again", "CJ E&M Film Division", new Actor("Yang", "Zishan"), "China", 2015,
				"Comedy"));
		film.add(new Film("The Choice", "Lionsgate", new Actor("Benjamin", "Walker"), "US", 2016, "Drama, Romance"));

		myCinema = new Cinema(film, act);
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("%14S", "Menu\n");
		System.out.println("1- Print list of films;\n"
				+ "2- Save to file;\n"
				+ "3- R2ead from file;\n"
				+ "4- Find film by Name;\n"
				+ "5- Find film by Year;\n"
				+ "6- Exit.");
		int number = sc.nextInt();
		switch (number) {
			case 1: System.out.println("List of films:");
					myCinema.printFilms();
				break;
			case 2: myCinema.inputFile("Film1.txt");
				break;
			case 3: myCinema.outputFile("Film2.txt");
				break;
			case 4: System.out.print("Enter the name of the movie: ");
					String filmName = sc.nextLine();
					String actorFilm = myCinema.findFilmByName(filmName);
					System.out.println(actorFilm);
				break;
			case 5: System.out.println("Enter the year of the movie: ");
					int filmYear = sc.nextInt();
					String yearFilm = myCinema.findFilmByYear(filmYear);
					System.out.println(yearFilm);
				break;
			case 6: System.exit(0);
				break;
		}
		sc.close();
	}
}
