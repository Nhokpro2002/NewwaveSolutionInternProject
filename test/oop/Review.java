package test.oop;

public class Review {
    public User user;
    public Product product;
    public int rating;
    private String comment;

    public Review(User user, Product product, int rating, String comment) {
        this.user = user;
        this.product = product;
        this.rating = rating;
        this.comment = comment;

    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void displayComment() {
        System.out.println(comment);
    }

    public int makeScore() {
        return rating;
    }

    public String displayReview() {
        return (user.getUserName()
                           + " reviewed " + product.getName()
                           + ": " + rating + " with comment: " + comment);

    }
}
