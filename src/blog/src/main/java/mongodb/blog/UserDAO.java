package mongodb.blog;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Random;

import com.mongodb.*;

public class UserDAO {
	@SuppressWarnings("unused")
	private final DBCollection usersCollection;
    @SuppressWarnings("unused")
	private Random random = new SecureRandom();

    public UserDAO(final DB blogDatabase) {
        usersCollection = blogDatabase.getCollection("users");
    }

    public boolean addUser(String username, String password, String email) {
        // String passwordHash = makePasswordHash(password, Integer.toString(random.nextInt()));
        return true;
    }

    public DBObject validateLogin(String username, String password) {
        DBObject user = new BasicDBObject("_id", "Victor")
    		.append("password", makePasswordHash(password, "salt"));

        String hashedAndSalted = user.get("password").toString();

        String salt = hashedAndSalted.split(",")[1];

        if (!hashedAndSalted.equals(makePasswordHash(password, salt))) {
            System.out.println("Submitted password is not a match");
            return null;
        }

        return user;
    }


    private String makePasswordHash(String password, String salt) {
        try {
            String saltedAndHashed = password + "," + salt;
            
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(saltedAndHashed.getBytes());
            String md5Encoded = new String(digest.digest(), "UTF-8");
            
            byte[] hashedBytes = md5Encoded.getBytes();
            Encoder encoder = Base64.getEncoder();
            
            String base64Encoded = new String(encoder.encode(hashedBytes));
            return base64Encoded + "," + salt;

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA is not available", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 unavailable?  Not a chance", e);
        }
    }
}
