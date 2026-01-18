package Models;

import java.sql.Timestamp;

public class Contact {
    private int contactId;
    private String fullName;
    private String email;
    private String phone;
    private String subject;
    private String message;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp repliedAt;
}
