package ua.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Cinema {

	ArrayList<Film> films;
	ArrayList<Actor> actors; // Actor[] actors;

	public Cinema(ArrayList<Film> films, ArrayList<Actor> actors) {
		this.films = films;
		this.actors = actors;
	}
	// method - to print films
	public void printFilms() {
		for (Film film : films) {
			System.out.println(film);
		}
	}
	// method - to save arraylist to file
	public void inputFile(String fileName) {
		File file = new File(fileName);
		int i = 0;
		Film film = null;
		ObjectInputStream inStream = null;
		try {
			FileInputStream fileIn = new FileInputStream(file);
			inStream = new ObjectInputStream(fileIn);
			if (inStream != null) {
				while (true) {
					film = (Film) inStream.readObject();
					if (film == null)
						break;
				}
				inStream.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("No file with data found - " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Error in data structure - " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading data - " + e.getMessage());
		}
	}
	// to read arraylist from file	
	public void outputFile(String fileName) {
		File file = new File(fileName);
		try {
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			for (Film film : films) {
				outStream.writeObject(film);
			}
			outStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file - " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error writing data - " + e.getMessage());
		}
	}
	
	// with this method some problems
	public String findFilmByName(String name) {
		String search = "";

		for (Film film : films) {
			if (film.getFilmName().toLowerCase().equals(name)) {
				search += film.toString() + "\n";
				return search;
			}
		}
		return search.isEmpty() ? "\tSorry, but there is no movie(-s) with that name" : search;
	}
	// find film by year
	public String findFilmByYear(int year) {
		String search = "";

		for (Film film : films) {
			if (film.getYear() == year) {
				search += film.toString() + "\n";
				return search;
			}
		}
		return search.isEmpty() ? "\tSorry, but there is no movie(-s) with that year" : search;
	}
}
