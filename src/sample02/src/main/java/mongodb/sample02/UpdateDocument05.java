package mongodb.sample02;

import com.mongodb.*;

public class UpdateDocument05 extends FindDocument03 {

	public static void main(String[] args) {
		try
		{
			DBObject query = new BasicDBObject("name", "Aurora");
			DBCollection collection = getCollection("persons", "samples");
			DBObject newAurora = new BasicDBObject("name", "María");
			DBObject aurora = collection.findAndModify(query, newAurora);
			System.out.println(aurora);
		}
		catch (Exception exception)
		{
			System.out.println("Ha ocurrido un error: " + exception.getMessage());
		}
	}
}
