package newwavesolution.basic;

public class Review {
    public User user;
    public Product product;
    public int[] points = {1, 2, 3, 4, 5};
    private String comment;

    public Review() {

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
        return points[4];
    }

    public void displayScore() {
        System.out.println(makeScore());
        //makeScore();
    }
}
