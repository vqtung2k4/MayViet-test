package Models;

import java.sql.Timestamp;

public class Review {
    private int reviewId;
    private int productId;
    private int userId;
    private int rating;
    private String comment;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
