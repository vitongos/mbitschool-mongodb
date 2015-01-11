package mongodb.sample01;

import static spark.Spark.get;

import java.net.UnknownHostException;

import com.mongodb.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		App app = new App();
        get("/mongo/sample01", (req, res) -> app.getDog());
    }
	
	public String getDog() throws UnknownHostException
	{
		MongoClient client = new MongoClient("localhost");
		DB database = client.getDB("samples");
		DBCollection collection = database.getCollection("dogs");
		return (String) collection.findOne().get("name");
	}
}
