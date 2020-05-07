package movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieOperations {
    private List<Movie> SaturdayMovies = new ArrayList<>();
    private List<Movie> SundayMovies = new ArrayList<>();

    public MovieOperations() {
        fillList();
    }

    private void fillList() {

        SaturdayMovies.add(new Movie("Adventure", 11));
        SaturdayMovies.add(new Movie("Comedy", 22));
        SaturdayMovies.add(new Movie("Adventure", 33));

        SundayMovies.add(new Movie("Comedy", 44));
        SundayMovies.add(new Movie("Adventure", 55));
        SundayMovies.add(new Movie("Comedy", 66));
    }

    public void findAveragePriceByGenre() {
        Map<String, Double> genreAverageMap1 = SaturdayMovies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingDouble(Movie::getTicketPrice)));
        Map<String, Double> genreAverageMap2 = SundayMovies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingDouble(Movie::getTicketPrice)));
        System.out.println("Average ticket price for genre: \n Saturday \n" + genreAverageMap1 +
                "\n Sunday: \n" + genreAverageMap2 + "\n");

        Map<String, Long> genreCountingMap1 = SaturdayMovies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        Map<String, Long> genreCountingMap2 = SundayMovies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println("Number of films for genre: \n Saturday \n" + genreCountingMap1 +
                "\n Sunday \n" + genreCountingMap2);
    }
}
