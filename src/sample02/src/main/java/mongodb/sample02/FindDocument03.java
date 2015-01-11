package mongodb.sample02;

import com.mongodb.*;

public class FindDocument03 extends InsertDocument02 {
	
	public static void main(String[] args) {
		try
		{
			DBObject query = new BasicDBObject("name", "Aurora");
			DBCollection collection = getCollection("persons", "samples");
			DBObject aurora = collection.findOne(query);
			System.out.println(query);
			System.out.println(aurora);
			
//			DBObject fields = new BasicDBObject("name", 1);
//			DBObject auroraShort = collection.findOne(query, fields);
//			System.out.println(auroraShort);
		}
		catch (Exception exception)
		{
			System.out.println("Ha ocurrido un error: " + exception.getMessage());
		}
	}
}
