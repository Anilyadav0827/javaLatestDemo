package swigyApplications;

public class Rating {
    private String rating;
    private String comment;

    public String getRating() {

        return rating;
    }

    public void setRating(String rating) {

        this.rating = rating;
    }

    public String getFeedBack()
    {
        return comment;
    }

    public void setComment(String comment) {

        this.comment = comment;
    }

    @Override
    public String toString() {
        return " \n Rating{" +
                "rating='" + rating + '\'' +
                ", feedBack='" + comment + '\'' +
                '}';
    }
}
