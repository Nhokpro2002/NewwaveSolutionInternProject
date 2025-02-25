package newwavesolution.collections.map;

public class Review {

    private String comment;
    private int rating;

    public Review(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Rating: " + rating + "/5 - " + comment;
    }
}
