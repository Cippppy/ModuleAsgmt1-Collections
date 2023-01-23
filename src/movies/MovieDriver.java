package movies;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class MovieDriver {
	
	private static HashMap <Integer, Movie> movies = new HashMap<Integer, Movie>();

	public static void main(String[] args) {
		populateMovies();
		displayMovies();
	}

	/**
	 * This method uses a Scanner and gets user input for three movies (title, length, release date
	 * which it will then use to make a new Movie and add it into the HashMap movies.
	 */
	private static void populateMovies() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Creating movies\n");
		// TODO add your code here.
		System.out.print("Enter title of movie 1: ");
		String name1 = myObj.nextLine();
		System.out.print("\nEnter length of movie 1: ");
		int length1 = myObj.nextInt();
		System.out.print("\nEnter release date of movie 1: ");
		String date1 = myObj.nextLine();

		Movie movie1 = new Movie(name1, date1);
		movies.put(length1, movie1);
	}
	
	/**
	 * This method loops through all the movies using the forEach method 
	 * and displays each movie using its toString() method.
	 */
	private static void displayMovies() {
		System.out.println("\nHere is the list of movies:");
		// TODO add your code here.
	}
}
