package Services.Implementations.Auths;

import Services.Interfaces.Auths.ISignUpService;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import Models.User;
import org.bson.Document;
import Utils.DBConnection;

import static com.mongodb.client.model.Filters.eq;

public class SignUpService implements ISignUpService {

    private final MongoCollection<Document> userCollection;

    public SignUpService() {
        MongoDatabase db = DBConnection.getDatabase();
        userCollection = db.getCollection("users");
    }

    @Override
    public boolean register(User user) {
        try {
            userCollection.insertOne(user.toDocument());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean isUsernameExists(String username) {
        return userCollection.find(eq("username", username)).first() != null;
    }

    @Override
    public boolean isEmailExists(String email) {
        return userCollection.find(eq("email", email)).first() != null;
    }
}
