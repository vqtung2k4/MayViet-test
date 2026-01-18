package Models;

import java.sql.Timestamp;

public class Banner {
    private int bannerId;
    private String title;
    private String imageUrl;
    private String linkUrl;
    private int displayOrder;
    private boolean status;
    private Timestamp createdAt;
}
