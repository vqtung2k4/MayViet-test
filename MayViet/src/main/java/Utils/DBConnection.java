//package Utils;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
//import Models.User;
//
//public class DBConnection {
//
//    public static void main(String[] args) {
//
//        String uri = "mongodb+srv://sa:123@mayviet.jrwyyng.mongodb.net/MayViet";
//
//        List<User> users = new ArrayList<>();
//
//        try (MongoClient mongoClient = MongoClients.create(uri)) {
//
//            MongoDatabase database = mongoClient.getDatabase("MayViet-db");
//            MongoCollection<Document> userCollection =
//                    database.getCollection("Users");
//
////            for (Document doc : userCollection.find()) {
////
////                User user = new User();
////
////                user.setUsername(doc.getString("username"));
////                user.setPassword(doc.getString("password"));
////                user.setEmail(doc.getString("email"));
////                user.setPhone(doc.getString("phone"));
////                user.setAddress(doc.getString("address"));
////                user.setRole(doc.getString("role"));
////
////                users.add(user);
////            }
//
//
//            System.out.println("Kết nối MongoDB thành công!");
////            System.out.println("Danh sách user:");
////
////            for (User u : users) {
////                System.out.println(
////                        u.getUserId() + " | " +
////                                u.getUsername() + " | " +
////                                u.getEmail()
////                );
////            }
//
//        } catch (Exception e) {
//            System.out.println("Kết nối MongoDB thất bại");
//            e.printStackTrace();
//        }
//    }
//}


package Utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class DBConnection {

    private static final String URI =
            "mongodb+srv://sa:123@mayviet.jrwyyng.mongodb.net";

    private static MongoDatabase database;

    static {
        MongoClient client = MongoClients.create(URI);
        database = client.getDatabase("MayViet-db");
        System.out.println("MongoDB connected");
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}
