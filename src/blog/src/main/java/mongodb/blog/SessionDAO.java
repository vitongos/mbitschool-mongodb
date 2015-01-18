package mongodb.blog;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Base64.Encoder;

import com.mongodb.*;

public class SessionDAO {
	@SuppressWarnings("unused")
	private final DBCollection sessionsCollection;

    public SessionDAO(final DB blogDatabase) {
        sessionsCollection = blogDatabase.getCollection("sessions");
    }

    public String findUserNameBySessionId(String sessionId) {
        return "Victor";
    }

    public String startSession(String username) {
        return getSessionId();
    }

    public void endSession(String sessionID) {
        // borrar la sesión de la colección
    }

    public DBObject getSession(String sessionID) {
        return new BasicDBObject("username", "Victor")
            	.append("_id", sessionID);
    }
    
    private String getSessionId() {
    	SecureRandom generator = new SecureRandom();
        byte randomBytes[] = new byte[32];
        generator.nextBytes(randomBytes);

        Encoder encoder = Base64.getEncoder();

        String sessionID = encoder.encodeToString(randomBytes);

        return sessionID;
    }
    
}
