package mongodb.sample02;

import com.mongodb.*;

public class RemoveDocument06 extends FindDocument03 {

	public static void main(String[] args) {
		try
		{
			DBObject query = new BasicDBObject("name", "Aurora");
			DBCollection collection = getCollection("persons", "samples");
			DBObject result = collection.findAndRemove(query);
			System.out.println(result);
			
//			WriteResult writeResult = collection.remove(query);
//			System.out.println(writeResult);
		}
		catch (Exception exception)
		{
			System.out.println("Ha ocurrido un error: " + exception.getMessage());
		}

	}

}
