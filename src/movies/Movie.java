package movies;

public class Movie {
    private String genre;
    private Integer price;

    Movie(String genre, Integer price) {
        this.genre = genre;
        this.price = price;
    }

    String getGenre() {
        return genre;
    }

    Integer getTicketPrice() {
        return price;
    }
}
