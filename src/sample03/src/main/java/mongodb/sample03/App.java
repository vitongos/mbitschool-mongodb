package mongodb.sample03;

import java.net.UnknownHostException;
import java.util.Arrays;

import com.mongodb.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException, InterruptedException
    {
        MongoClient client = new MongoClient(new ServerAddress("localhost", 30001));
        DBCollection collection = client.getDB("replica_test").getCollection("ids");
        collection.drop();
        
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
        	try {
        		collection.insert(new BasicDBObject("_id", i));
        		System.out.println("Inserted : " + i);
        	}
        	catch (Exception exception) {
        		System.out.println(exception.getMessage());
        	}
        	Thread.sleep(500);
        }
    }
}
