package training.com.sk.day7;

import java.util.*;

public class ComparableNComparator {

	public static void main(String[] args) {
		
        List<Movie> list = new ArrayList<Movie>();
        
        list.add(new Movie("The Avegers", 8, 2012));
        list.add(new Movie("Kung Fu Panda", 7.6, 2008));
        list.add(new Movie("Finding Nemo", 8.2, 2003));
 
        //Uses Comparable
        System.out.println("\nSorted By Year : ");
        Collections.sort(list);
        for (Movie movie: list) System.out.println(movie.getName() + " " +movie.getRating() + " " +movie.getYear());
        
        //Uses Comparator
        System.out.println("\nSorted by Rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie: list) System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        //Uses Comparator
        System.out.println("\nSorted By Name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list) System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
	}
}
class Movie implements Comparable<Movie>
{
    private String name;
    private double rating;
    private int year;
 
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
    public Movie(String name, double rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public String getName(){  
    	return name; 
    }
    public double getRating(){ 
    	return rating; 
    }
    public int getYear(){  
    	return year;  
    }
}
class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}
 
class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}
