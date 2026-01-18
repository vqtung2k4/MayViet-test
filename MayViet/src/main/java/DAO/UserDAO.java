package DAO;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import Models.User;
import Utils.DBConnection;

public class UserDAO {

    private MongoCollection<Document> userCollection =
            DBConnection.getDatabase().getCollection("Users");

    public User login(String username, String password) {

        Document doc = userCollection.find(
                new Document("username", username)
                        .append("password", password)
        ).first();

        if (doc == null) return null;

        User user = new User();
        user.setUsername(doc.getString("username"));
        user.setEmail(doc.getString("email"));
        user.setRole(doc.getString("role"));

        return user;
    }
}
