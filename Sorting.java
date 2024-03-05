import java.util.ArrayList;

class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return (int)( this.year - o.year);
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

}

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie(1.34, "pragun", 1997));
        list.add(new Movie(1.98, "himanshi", 1992));
        list.add(new Movie(1.62, "harjot boss", 1995));


        System.out.println("sort by rating");
        
        for(Movie movie: list){
            System.out.println(movie.getRating()+ " "+movie.getName()+ " "+movie.getYear());
        }
    }
}
