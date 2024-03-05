import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie o) {
        // TODO Auto-generated method stub
        return (int) (this.year - o.year);
    }

}

class NameSorting implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }

} 

class RatingSorting implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        // TODO Auto-generated method stub
        if(o1.getRating() < o2.getRating()){
           return -1;
        } else {
           return 1;
        }
    }

} 

public class Sorting2 {
    public static void main(String[] args) {
        System.out.println("nice and");

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie(1.34, "pragun", 1997));
        list.add(new Movie(1.98, "himanshi", 1992));
        list.add(new Movie(1.62, "harjot boss", 1995));

        System.out.println("name sorting");
        NameSorting nameSorting = new NameSorting();
        Collections.sort(list, nameSorting);

        for(Movie movie: list){
            System.out.println(movie.getRating()+ " "+movie.getName()+ " "+movie.getYear());
        }

        System.out.println("rating sorting");
        RatingSorting ratingSorting = new RatingSorting();
        Collections.sort(list, ratingSorting);

        for(Movie movie: list){
            System.out.println(movie.getRating()+ " "+movie.getName()+ " "+movie.getYear());
        }
    }
}
