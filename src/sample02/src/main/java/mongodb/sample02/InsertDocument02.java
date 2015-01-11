package mongodb.sample02;

import java.net.UnknownHostException;
import java.util.Arrays;

import com.mongodb.*;

public class InsertDocument02 extends CreateDocument01 {

	public static void main(String[] args) {
		try
		{
			DBObject document = getAurora();
			document.put("childs", new String[] {"Robert", "Andrew", "Sarah"});
			document.put("languages", Arrays.asList("English", "Chinese"));
			DBCollection collection = getCollection("persons", "samples");
			System.out.println(document);
			collection.insert(document);
			System.out.println(document);
		}
		catch (Exception exception)
		{
			System.out.println("Ha ocurrido un error: " + exception.getMessage());
		}
		
	}
	
	public static DBCollection getCollection(String collectionName, String databaseName) throws UnknownHostException
	{
		MongoClient client = new MongoClient();
		DB database = client.getDB(databaseName);
		DBCollection collection = database.getCollection(collectionName);
		return collection;
	}

}
